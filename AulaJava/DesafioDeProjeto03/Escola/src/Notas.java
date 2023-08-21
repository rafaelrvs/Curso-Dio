public class Notas{
  double nota = 3;

  public void atribuindoNota (double notaDigitada){
       if(notaDigitada >= 5 )
                System.out.println("Aluno aprovado");
            else if (notaDigitada <5 && notaDigitada >=3)
                System.out.println("Aluno de exame");
            else{
              System.out.println("Reprovado");       
            }
    nota = notaDigitada;
  }


}