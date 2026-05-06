package com.TarefasPrevistas.Usuario;

public class Usuario {
    private int id; // Supondo que exista um campo ID
    private String email;
    private String senha;
    private String empresa;
    private String cidade;

    // Construtor padrão
    public Usuario() {}

    // Construtor sem ID (para novos usuários)
    public Usuario(String email, String senha, String empresa, String cidade) {
        this.email = email;
        this.senha = senha;
        this.empresa = empresa;
        this.cidade = cidade;
    }

    // Construtor com ID (para usuários existentes)
    public Usuario(int id, String email, String senha, String empresa, String cidade) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.empresa = empresa;
        this.cidade = cidade;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
