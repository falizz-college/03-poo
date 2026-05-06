package com.TarefasPrevistas.Usuario;

import java.util.List;

public class UsuarioService {
    private final UsuarioCRUD usuarioCRUD;

    // Construtor que recebe a dependência do CRUD
    public UsuarioService(UsuarioCRUD usuarioCRUD) {
        this.usuarioCRUD = usuarioCRUD;
    }

    // Método para registrar um novo usuário
    public boolean registerUser(String email, String senha, String empresa, String cidade) {
        if (email == null || email.isBlank() || senha == null || senha.isBlank()) {
            System.err.println("Erro: Email e senha são obrigatórios.");
            return false;
        }

        Usuario novoUsuario = new Usuario(email, senha, empresa, cidade);
        return usuarioCRUD.addUsuario(novoUsuario);
    }

    // Método para buscar todos os usuários
    public List<Usuario> getAllUsers() {
        return usuarioCRUD.getAllUsuarios();
    }

    // Método para buscar um usuário pelo ID
    public Usuario getUserById(int id) {
        return usuarioCRUD.getUsuarioById(id);
    }

    // Método para atualizar os dados de um usuário
    public boolean updateUser(int id, String email, String senha, String empresa, String cidade) {
        Usuario usuarioExistente = usuarioCRUD.getUsuarioById(id);

        if (usuarioExistente == null) {
            System.err.println("Erro: Usuário não encontrado.");
            return false;
        }

        Usuario usuarioAtualizado = new Usuario(id, email, senha, empresa, cidade);
        return usuarioCRUD.updateUsuario(usuarioAtualizado);
    }

    // Método para deletar um usuário
    public boolean deleteUser(int id) {
        Usuario usuario = usuarioCRUD.getUsuarioById(id);
        if (usuario == null) {
            System.err.println("Erro: Usuário não encontrado.");
            return false;
        }

        return usuarioCRUD.deleteUsuario(id);
    }

    // Método para autenticar um usuário
    public Usuario authenticate(String email, String senha) {
        List<Usuario> usuarios = usuarioCRUD.getAllUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }

        System.err.println("Erro: Credenciais inválidas.");
        return null;
    }
}
