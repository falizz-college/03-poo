package com.TarefasPrevistas;

import com.TarefasPrevistas.Tarefa.Tarefa;
import com.TarefasPrevistas.Tarefa.TarefaCRUD;
import com.TarefasPrevistas.Tarefa.TarefaService;
import com.TarefasPrevistas.Usuario.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class TarefaServiceTest {

    private TarefaService tarefaService;
    private Usuario usuario;
    private Connection connection;

    @BeforeEach
    void setUp() throws SQLException {
        // Cria uma conexão com o banco de dados H2 em memória
        connection = DriverManager.getConnection("jdbc:h2:mem:POO_TarefasPrevistas;DB_CLOSE_DELAY=-1");

        // Cria o serviço de tarefas, passando a conexão
        TarefaCRUD tarefaCRUD = new TarefaCRUD(connection);
        tarefaService = new TarefaService(tarefaCRUD);

        // Cria um usuário para associar às tarefas
        usuario = new Usuario("usuario@exemplo.com", "senha123", "empresa 1", "Brasília");

        // Criar a tabela de tarefas no banco de dados em memória para o teste
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS Tarefa (id INT PRIMARY KEY, descricao VARCHAR(255), prioridade INT, categoria VARCHAR(255), userID INT)");
    }

    @Test
    void testAddTarefa() {
        // Testa a adição de uma nova tarefa
        Tarefa.Categoria categoria = Tarefa.Categoria.TESTE;
        boolean resultado = tarefaService.addTarefa("Nova tarefa", 1, categoria, usuario);

        assertTrue(resultado);
    }

    @Test
    void testAddTarefaInvalidDescription() {
        // Testa a adição de tarefa com descrição inválida
        Tarefa.Categoria categoria = Tarefa.Categoria.TESTE;
        boolean resultado = tarefaService.addTarefa("", 1, categoria, usuario);

        assertFalse(resultado);
    }


}
