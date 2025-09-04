package servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Tarefa;

public class TarefaServico {

    private List<Tarefa> listaDeTarefas = new ArrayList<>();
    private int proximoId = 1;
    private Scanner scanner = new Scanner(System.in);

    // Criar nova tarefa interativamente
    public void criarTarefa() {
        System.out.println("criar uma nova tarefa!");
        System.out.print("Digite o título da tarefa: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();

        Tarefa tarefa = new Tarefa(proximoId++, titulo, descricao, false);
        listaDeTarefas.add(tarefa);

        System.out.println("Parabéns! Tarefa criada: " + titulo + "\n");
    }

    // Mostrar todas as tarefas
    public void mostrarTarefas() {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Opaa! Ainda não há tarefas cadastradas.\n");
            return;
        }

        System.out.println("=== Suas tarefas ===");
        for (Tarefa t : listaDeTarefas) {
            String status = t.estaCompleta() ? "Concluída" : "Pendente";
            System.out.println(t.getId() + " - " + t.obterTitulo() + " | " + t.obterDescricao() + " [" + status + "]");
        }
        System.out.println();
    }
}

