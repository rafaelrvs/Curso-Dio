import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {
      try{
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Diite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Diite seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("Diite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Diite sua altura: ");
        double altura = entrada.nextDouble();
      }
      catch(InputMismatchException e){
          System.out.println("Os campos idade e altura precisam ser numericos");
      }

    
     
      }
    }

