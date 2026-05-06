package com.TarefasPrevistas;

import com.TarefasPrevistas.Usuario.Usuario;
import com.TarefasPrevistas.Usuario.UsuarioCRUD;
import com.TarefasPrevistas.Usuario.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioServiceTest {

    private UsuarioService usuarioService;
    private Connection connection;

    @BeforeEach
    void setUp() throws SQLException {
        // Cria uma conexão com o banco de dados H2 em memória
        connection = DriverManager.getConnection("jdbc:h2:mem:POO_TarefasPrevistas;DB_CLOSE_DELAY=-1");

        // Cria o serviço de usuário, passando a conexão
        UsuarioCRUD usuarioCRUD = new UsuarioCRUD(connection);
        usuarioService = new UsuarioService(usuarioCRUD);

        // Crie as tabelas necessárias para o teste (caso seja necessário)
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS Usuario (id INT PRIMARY KEY, email VARCHAR(255), senha VARCHAR(255), empresa VARCHAR(255), cidade VARCHAR(255))");
    }

    @Test
    void testAuthenticateValidCredentials() {
        // Registra um usuário
        usuarioService.registerUser("usuario@exemplo.com", "senha123", "empresa 1", "Brasília");

        // Testa a autenticação com credenciais válidas
        Usuario autenticado = usuarioService.authenticate("usuario@exemplo.com", "senha123");
        assertNotNull(autenticado);
        assertEquals("usuario@exemplo.com", autenticado.getEmail());
    }

    @Test
    void testAuthenticateInvalidCredentials() {
        // Simula a autenticação com credenciais inválidas
        Usuario autenticado = usuarioService.authenticate("usuario@exemplo.com", "senhaErrada");
        assertNull(autenticado);
    }

}
