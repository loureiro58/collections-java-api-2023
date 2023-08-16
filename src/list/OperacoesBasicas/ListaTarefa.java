package list.OperacoesBasicas;

import java.util.*;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        tarefaList.add(tarefa);
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList){
            if(tarefa.getDescricao().equals(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 4");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 4");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
