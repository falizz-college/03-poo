package com.TarefasPrevistas.Usuario;

public class UsuarioAutenticacao {
    private final UsuarioService usuarioService;

    public UsuarioAutenticacao(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public boolean login(String email, String senha) {
        Usuario usuario = usuarioService.authenticate(email, senha); // Chama o método de autenticação
        if (usuario != null) {
            System.out.println("Usuário autenticado com sucesso!");
            return true;
        } else {
            System.out.println("Credenciais inválidas.");
            return false;
        }
    }
}
