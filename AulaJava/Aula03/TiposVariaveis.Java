public class TiposVariaveis {

  
  public static void main(String[] args){
   /* Oque são tipos de dados? 
   
      Na linguagem java existe algumas palavras  dos tipos de dados
    basicos que precisam ser manipulados para construção  de programa
    Esses tipos são conhecidos como tipos primitivos

    int|short|float|boolean|byte|long|double|char|;
    -----------------------------------------------

    byte  1 byte
    short 2 byte
    int   4 bytes // muito comum opções como int
    long  8 bytes

    partes fracionadas:
    float  4 bytes;
    double 8 bytes;  // mais comum o uso do double;
   
   */

   byte idade = 123;
   short ano = 2021;
   int cep =21070333; // se começar com zero o ideal é que fosse outro tipo
   long cpf = 98765432109L; // se começar com zero o ideal é que fosse outro tipo precisa ser encerrado com L
   float p1 = 3.14F;
   double salario = 1275.33;

   // Cuidado com tipo da variavel
   // valores que não mudam, constantes:
   final double PI = 3.14;
}
}
