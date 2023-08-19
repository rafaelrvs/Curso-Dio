package Aula04;

public class Unario {
  public static void main (String [] args){
    System.out.println("Esses operadores são\n"+
    "aplicados com outro perador aritmetico\n"+ 
     "eles realizam alguns trabalhos basicos como \nincrementar\n"+
     "Decrementar,\ninverter valores numericos e boleanos\n"+
     "+ números positivos |  - nega numero ou expressão | ++ incremento | -- decremento de valor |");
  
  
    int numero = 5;
   // System.out.println(++ numero); incrementando 
    // System.out.println(-- numero ); decrementando
    boolean variavel = true;
    variavel = !variavel; // inversão de valores
    System.out.println(variavel);
  
  
    }
  
}
