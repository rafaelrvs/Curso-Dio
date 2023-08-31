package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogosLivros {

  //Atributos
  private List<Livro> livroList;

  public CatalogosLivros() {this.livroList = new ArrayList<>();}

  public void adicionandoLivro(String titulo,String autor, int anoDePublicacao){
    livroList.add(new Livro(titulo, autor, anoDePublicacao));
  }

  public List<Livro> pesquisaPorAutor(String autor){
    // isEmpty se for true nem começa a execução desse bloco de comando
    List<Livro> livrosPorAutor = new ArrayList<>();
    if(!livroList.isEmpty()){
      // se não for verdade faça
      // livros = l 
      // ignorecase =  pesquisa somente o valor que procura 
        for(Livro newLivro : livroList){
          if(newLivro.getAutor().equalsIgnoreCase(autor)){
            livrosPorAutor.add(newLivro);
          }
        }
      }
      return livrosPorAutor;
  }

  public List<Livro> pesquisarPorintervaloDeAnos(int anoInicail,int anoFinal){
   List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
   for(Livro listaAno : livroList){
    if(listaAno.getAnoDePublicacao() >= anoInicail && listaAno.getAnoDePublicacao()<= anoFinal){
      livrosPorIntervaloDeAnos.add(listaAno);
    }
   }

  return livrosPorIntervaloDeAnos;
  }

  public Livro pesquisarPorTitulo(String titulo){
    Livro livrosPorTitulo = null;
    for(Livro l : livroList){
    if(l.getTitulo().equalsIgnoreCase(titulo)){
      livrosPorTitulo = l;
      break;
    }
  }
  return livrosPorTitulo;
}
  
  public static void main(String[]args){
    CatalogosLivros catalogosLivros = new CatalogosLivros();
    catalogosLivros.adicionandoLivro("Livro 1", "Autor1", 2020);
    catalogosLivros.adicionandoLivro("Livro 2", "Autor2", 2021);
    catalogosLivros.adicionandoLivro("Livro 3", "Autor3", 2022);
    catalogosLivros.adicionandoLivro("Livro 4", "Autor4", 1994);

    System.out.println(catalogosLivros.pesquisarPorintervaloDeAnos(1994 ,2022));
  }
}
