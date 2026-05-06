package com.TarefasPrevistas.Tarefa;

import com.TarefasPrevistas.Usuario.Usuario;

import java.util.List;

public class TarefaController {
    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    public void mostrarTarefas(Usuario usuario) {
        List<Tarefa> tarefas = tarefaService.getTarefasByUsuario(usuario);
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas para o usuário.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println("Tarefa ID: " + tarefa.getId());
                System.out.println("Descrição: " + tarefa.getDescricao());
                System.out.println("Prioridade: " + tarefa.getPrioridade());
                System.out.println("Categoria: " + tarefa.getCategoria());
                System.out.println("----");
            }
        }
    }
}
