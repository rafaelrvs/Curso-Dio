import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {
     double mesada = 50.0;

        while(mesada>0 ){
            double valorDoDoce = valorAleatorio();
            if(valorDoDoce>mesada){
                valorDoDoce = mesada;
            }
            System.out.println("doce do valor "+ valorDoDoce +" Adicionando no carrinho" );
            mesada = mesada - valorDoDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou a sua mesada em doces");

}

        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2, 8);
        }
    
}
