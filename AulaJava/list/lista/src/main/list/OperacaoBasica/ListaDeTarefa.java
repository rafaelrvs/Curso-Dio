package main.list.OperacaoBasica;
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

    //realizando testes 
       public static void main (String [] args){

        // verificando se a lista esta vazia.
   ListaDeTarefa listaDeTarefa = new ListaDeTarefa();
   System.out.println("O numero total de tarefas é : " +listaDeTarefa.obterNumeroTotalDeTarefa());
   //adicionando itens.
   listaDeTarefa.adicionarTarefa("tarefa01"); 
   listaDeTarefa.adicionarTarefa("tarefa01"); 
   listaDeTarefa.adicionarTarefa("tarefa02"); 
   System.out.println("O numero total de tarefas é : " +listaDeTarefa.obterNumeroTotalDeTarefa());
   
   //Removendo tarefa.
   listaDeTarefa.removeTarefa("tarefa01");
   System.out.println("O numero total de tarefas é : " +listaDeTarefa.obterNumeroTotalDeTarefa());
 // obtendo descrições;
 listaDeTarefa.obterDescricaoTarefa();
        
  
  }      


  }