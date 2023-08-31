package main.list.Pesquisa;

public class Livro {

  private String titulo;
  private String autor;
  private int anoDePublicacao;

  public  Livro(String titulo, String auto, int AnoDePublicacao){
    this.titulo = titulo;
    this.autor = autor;
    this.anoDePublicacao = anoDePublicacao;
  }
  
  public int getAnoDePublicacao() {
    return anoDePublicacao;
  }
  public String getAutor() {
    return autor;
  }
  public String getTitulo() {
    return titulo;
  }
 @Override
  public String toString(){
    return "Livro{"+
  ",titulo'"+titulo+'\''+
    ",autor'"+autor+'\''+
  ",anoDePublicacao" + anoDePublicacao +'}';

}
  


}
