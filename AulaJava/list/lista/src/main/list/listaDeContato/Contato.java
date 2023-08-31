package main.list.listaDeContato;

import java.util.Objects;

public class Contato {
  private String nome;
  private int numero;


  public Contato (String nome, int numero){
    this.nome = nome;
    this.numero = numero;
  }

  public String getNome(){
    return nome;
  }
  public int getNumero(){
    return numero;
  }
  public void setNumero(int numero){
    this.numero = numero;
  }
@Override
public int hashCode(){
  return Objects.hash(getNome());
}

  @Override
  public String toString(){
    return "Contato{"+
    ", nome='"+nome+'\''+
    ", numero="+numero+'}';
  }

}
