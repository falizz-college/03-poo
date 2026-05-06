package com.TarefasPrevistas.Tarefa;

import com.TarefasPrevistas.Usuario.Usuario;

public class Tarefa {
    private int id; // ID da tarefa
    private int userID; // ID do usuário que vai realizar a tarefa
    private String descricao;
    private int prioridade; // Prioridade de 1 a 5
    private Categoria categoria; // Categoria da tarefa

    // Enum de categorias
    public enum Categoria {
        MANUTENCAO, DESENVOLVIMENTO, TESTE, OUTROS;
    }

    // Construtor padrão
    public Tarefa() {}

    // Construtor com todos os campos
    public Tarefa(int id, int userID, String descricao, int prioridade, Categoria categoria) {
        this.id = id;
        this.userID = userID;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.categoria = categoria;
    }

    // Construtor sem ID (para novas tarefas)
    public Tarefa(int userID, String descricao, int prioridade, Categoria categoria) {
        this.userID = userID;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.categoria = categoria;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
