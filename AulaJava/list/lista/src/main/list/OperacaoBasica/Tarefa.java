package main.list.OperacaoBasica;

 public class Tarefa{
  
   private String descricao;


   public Tarefa(String descricao){
    
    this.descricao = descricao;
   }


   @Override
    public String toString(){
      return "Tarefa{"+
        "Descrição'" + descricao + '\''+
        '}';
      }
  

   public String getDescricao(){
    return descricao;
   }
   


  }