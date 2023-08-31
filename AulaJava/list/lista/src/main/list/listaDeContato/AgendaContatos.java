package main.list.listaDeContato;
import java.util.HashSet;
import java.util.Set;
//constructor
public class AgendaContatos {
  
  private Set<Contato> contatoSet;
  
  public AgendaContatos(){
    this.contatoSet = new HashSet<>();
  }
  //method
  public void adiconarContatos(String nome, int numero){
    contatoSet.add(new Contato(nome,numero));
  }
  public void exibirContato(){
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> contatosPorNome = new  HashSet<>();
    for(Contato c: contatoSet){
      if(c.getNome().startsWith(nome)){
        contatosPorNome.add(c);
    }

    }
    return contatosPorNome;


  }
  public Contato atuatlizaNumeroContatos(String nome, int novoNumero){
   Contato contatoAtualizado = null;
    for(Contato c: contatoSet){
      if(c.getNome().equalsIgnoreCase(nome)){
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
    }

    }
    return contatoAtualizado;


  }


  public static void main(String [] args){
    AgendaContatos a = new AgendaContatos();

    a.adiconarContatos("rafael", 12345);
    a.adiconarContatos("r", 12345);
    a.adiconarContatos("d", 12345);
    a.adiconarContatos("s", 12345);
    a.adiconarContatos("s", 12345);
  
    System.out.println(  a.pesquisarPorNome("s"));
    
  }
  
}
