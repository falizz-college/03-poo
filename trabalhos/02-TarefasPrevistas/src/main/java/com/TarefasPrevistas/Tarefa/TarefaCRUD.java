package com.TarefasPrevistas.Tarefa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.TarefasPrevistas.Usuario.Usuario;

public class TarefaCRUD {
    private final Connection connection;

    public TarefaCRUD(Connection connection) {
        this.connection = connection;
    }

    // Método para adicionar uma tarefa
    public boolean addTarefa(Tarefa tarefa) {
        try {
            String sql = "INSERT INTO tarefas (descricao, prioridade, categoria, userID) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, tarefa.getDescricao());
                stmt.setInt(2, tarefa.getPrioridade());
                stmt.setString(3, tarefa.getCategoria().name());
                stmt.setInt(4, tarefa.getUserID());
                stmt.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Erro ao adicionar tarefa: " + e.getMessage());
            return false;
        }
    }

    // Método para obter todas as tarefas
    public List<Tarefa> getAllTarefas() {
        List<Tarefa> tarefas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tarefas";
            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    Tarefa tarefa = new Tarefa(
                            rs.getInt("userID"),
                            rs.getString("descricao"),
                            rs.getInt("prioridade"),
                            Tarefa.Categoria.valueOf(rs.getString("categoria"))
                    );
                    tarefas.add(tarefa);
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar tarefas: " + e.getMessage());
        }
        return tarefas;
    }

    // Método para buscar tarefa por ID
    public Tarefa getTarefaById(int id) {
        try {
            String sql = "SELECT * FROM tarefas WHERE id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, id);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return new Tarefa(
                                rs.getInt("userID"),
                                rs.getString("descricao"),
                                rs.getInt("prioridade"),
                                Tarefa.Categoria.valueOf(rs.getString("categoria"))
                        );
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar tarefa: " + e.getMessage());
        }
        return null;
    }

    // Método para atualizar uma tarefa
    public boolean updateTarefa(Tarefa tarefa) {
        try {
            String sql = "UPDATE tarefas SET descricao = ?, prioridade = ?, categoria = ?, userID = ? WHERE id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, tarefa.getDescricao());
                stmt.setInt(2, tarefa.getPrioridade());
                stmt.setString(3, tarefa.getCategoria().name());
                stmt.setInt(4, tarefa.getUserID());
                stmt.setInt(5, tarefa.getId());
                stmt.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar tarefa: " + e.getMessage());
            return false;
        }
    }

    // Método para deletar tarefa
    public boolean deleteTarefa(int id) {
        try {
            String sql = "DELETE FROM tarefas WHERE id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Erro ao deletar tarefa: " + e.getMessage());
            return false;
        }
    }

    // Método para buscar as tarefas de um usuário
    public List<Tarefa> findTarefasByUsuario(Usuario usuario) {
        List<Tarefa> tarefas = new ArrayList<>();
        String sql = "SELECT * FROM tarefas WHERE usuario_email = ?"; // Supondo que a tabela de tarefas tem uma coluna 'usuario_email'

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getEmail());
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Criar tarefa a partir dos dados do ResultSet
                Tarefa tarefa = new Tarefa();
                tarefa.setId(rs.getInt("id"));
                tarefa.setDescricao(rs.getString("descricao"));
                // Defina outros campos de Tarefa conforme necessário
                tarefas.add(tarefa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tarefas;
    }
}
