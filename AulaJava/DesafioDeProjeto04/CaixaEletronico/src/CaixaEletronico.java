import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
      double valorParaSaque = 0;  
      Scanner entrada = new Scanner(System.in);

      System.out.println("Digite o valor");
     valorParaSaque = entrada.nextDouble();
        Saldo valorGuardadoNoBanco = new Saldo();
        valorGuardadoNoBanco.inserindoValor(valorParaSaque);
        


    }
}
