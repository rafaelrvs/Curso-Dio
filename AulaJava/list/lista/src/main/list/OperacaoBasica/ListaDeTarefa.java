package main.list.OperacaoBasica;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefa{
  private List<Tarefa> tarefaList;

  public ListaDeTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  //Adicionando
  public void adicionarTarefa(String descricao){
     tarefaList.add( new Tarefa(descricao));
    }
    //removendo
  public void removeTarefa(String descricao){
     List<Tarefa>tarefasParaRemover = new ArrayList<>();
     for(Tarefa t : tarefaList){

      if(t.getDescricao().equalsIgnoreCase(descricao)){
        tarefasParaRemover.add(t);
      }
     }
     tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalDeTarefa(){
     return tarefaList.size();
    }
    //impressão
    public void obterDescricaoTarefa(){
     System.out.println(tarefaList);
    }
  }