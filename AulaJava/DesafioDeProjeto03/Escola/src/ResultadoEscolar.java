// Estrutura condicional


import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
            double notaDigitada;

           System.out.println("Digite a nota do aluno");
            notaDigitada =  entrada.nextDouble();

            Notas notaDoAluno = new Notas();


            notaDoAluno.atribuindoNota(notaDigitada);

        
    }
}
