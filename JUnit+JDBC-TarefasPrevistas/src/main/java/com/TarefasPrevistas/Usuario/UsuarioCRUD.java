package com.TarefasPrevistas.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioCRUD {
    private final Connection connection;

    // Construtor que recebe a conexão
    public UsuarioCRUD(Connection connection) {
        this.connection = connection;
    }

    // Método para adicionar um novo usuário
    public boolean addUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (email, senha, empresa, cidade) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getEmpresa());
            stmt.setString(4, usuario.getCidade());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao adicionar usuário: " + e.getMessage());
            return false;
        }
    }

    // Método para buscar todos os usuários
    public List<Usuario> getAllUsuarios() {
        String sql = "SELECT * FROM usuarios";
        List<Usuario> usuarios = new ArrayList<>();
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                usuarios.add(new Usuario(
                        rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("empresa"),
                        rs.getString("cidade")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar usuários: " + e.getMessage());
        }
        return usuarios;
    }

    // Método para atualizar um usuário
    public boolean updateUsuario(Usuario usuario) {
        String sql = "UPDATE usuarios SET email = ?, senha = ?, empresa = ?, cidade = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getEmpresa());
            stmt.setString(4, usuario.getCidade());
            stmt.setInt(5, usuario.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar usuário: " + e.getMessage());
            return false;
        }
    }

    // Método para deletar um usuário
    public boolean deleteUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar usuário: " + e.getMessage());
            return false;
        }
    }

    // Método para buscar um usuário por ID
    public Usuario getUsuarioById(int id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                            rs.getInt("id"),
                            rs.getString("email"),
                            rs.getString("senha"),
                            rs.getString("empresa"),
                            rs.getString("cidade")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar usuário: " + e.getMessage());
        }
        return null;
    }
}
