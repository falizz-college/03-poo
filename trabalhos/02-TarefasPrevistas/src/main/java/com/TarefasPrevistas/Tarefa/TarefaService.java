package com.TarefasPrevistas.Tarefa;

import com.TarefasPrevistas.Usuario.Usuario;
import java.util.List;

public class TarefaService {
    private final TarefaCRUD tarefaCRUD;

    // Construtor que recebe o TarefaCRUD
    public TarefaService(TarefaCRUD tarefaCRUD) {
        this.tarefaCRUD = tarefaCRUD;
    }

    // Método para adicionar uma nova tarefa
    public boolean addTarefa(String descricao, int prioridade, Tarefa.Categoria categoria, Usuario usuario) {
        if (descricao == null || descricao.trim().isEmpty()) {
            System.err.println("Descrição não pode ser vazia.");
            return false;
        }
        if (usuario == null) {
            System.err.println("Usuário não pode ser nulo.");
            return false;
        }

        // Cria a tarefa e associa o ID do usuário (usando o ID do usuário)
        Tarefa tarefa = new Tarefa(usuario.getId(), descricao, prioridade, categoria);
        return tarefaCRUD.addTarefa(tarefa);
    }

    // Método para buscar todas as tarefas
    public List<Tarefa> getAllTarefas() {
        return tarefaCRUD.getAllTarefas();
    }

    // Método para buscar uma tarefa por ID
    public Tarefa getTarefaById(int id) {
        return tarefaCRUD.getTarefaById(id);
    }

    // Método para atualizar uma tarefa
    public boolean updateTarefa(int id, String descricao, int prioridade, Tarefa.Categoria categoria, int userID) {
        Tarefa tarefaExistente = tarefaCRUD.getTarefaById(id);
        if (tarefaExistente == null) {
            System.err.println("Tarefa não encontrada.");
            return false;
        }

        // Atualiza os dados da tarefa
        tarefaExistente.setDescricao(descricao);
        tarefaExistente.setPrioridade(prioridade);
        tarefaExistente.setCategoria(categoria);
        tarefaExistente.setUserID(userID);

        return tarefaCRUD.updateTarefa(tarefaExistente);
    }

    // Método para deletar uma tarefa
    public boolean deleteTarefa(int id) {
        Tarefa tarefa = tarefaCRUD.getTarefaById(id);
        if (tarefa == null) {
            System.err.println("Tarefa não encontrada.");
            return false;
        }

        return tarefaCRUD.deleteTarefa(id);
    }

    // Método para buscar as tarefas por usuário
    public List<Tarefa> getTarefasByUsuario(Usuario usuario) {
        return tarefaCRUD.findTarefasByUsuario(usuario); // Chama o método no TarefaCRUD
    }
}
