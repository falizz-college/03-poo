package com.TarefasPrevistas;

import com.TarefasPrevistas.Tarefa.TarefaController;
import com.TarefasPrevistas.Tarefa.TarefaCRUD;
import com.TarefasPrevistas.Tarefa.TarefaService;
import com.TarefasPrevistas.Usuario.Usuario;
import com.TarefasPrevistas.Usuario.UsuarioAutenticacao;
import com.TarefasPrevistas.Usuario.UsuarioCRUD;
import com.TarefasPrevistas.Usuario.UsuarioService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Estabeleça a conexão com o banco de dados
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/POO_TarefasPrevistas", "TarefasPrevistasTester", "1234")) {

            // Criação do CRUD de Tarefa
            UsuarioCRUD usuarioCRUD = new UsuarioCRUD(connection);
            TarefaCRUD tarefaCRUD = new TarefaCRUD(connection);

            // Criação dos serviços
            UsuarioService usuarioService = new UsuarioService(usuarioCRUD); // Usando um CRUD básico de usuário
            TarefaService tarefaService = new TarefaService(tarefaCRUD); // Passa o TarefaCRUD

            // Exemplo de Controller
            UsuarioAutenticacao authController = new UsuarioAutenticacao(usuarioService);
            TarefaController tarefaController = new TarefaController(tarefaService);

            // Exemplo de login
            String email = "usuario@exemplo.com";
            String senha = "senha123"; // Senha em texto simples
            boolean autenticado = authController.login(email, senha);

            if (autenticado) {
                // Se o login for bem-sucedido, buscar e exibir as tarefas do usuário
                Usuario usuario = usuarioService.authenticate(email, senha);
                tarefaController.mostrarTarefas(usuario); // Listar as tarefas do usuário
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
