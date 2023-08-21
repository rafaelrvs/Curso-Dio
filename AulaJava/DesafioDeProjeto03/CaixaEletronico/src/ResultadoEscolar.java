import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
            double notaDigitada;

           System.out.println("Digite a nota do aluno");
            notaDigitada =  entrada.nextDouble();

            Notas notaDoAluno = new Notas();


            notaDoAluno.atribuindoNota(notaDigitada);

            if(notaDoAluno.nota >= 5 )
                System.out.println("Aluno aprovado");
            else if (notaDoAluno.nota <5 && notaDoAluno.nota >=3)
                System.out.println("Aluno de exame");
            else
            System.out.println("Reprovado");       
    }
}
