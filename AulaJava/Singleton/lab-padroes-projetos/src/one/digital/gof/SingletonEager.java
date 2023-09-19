package one.digital.gof;
/*
 * variação de instancia rapida
 */


public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
      super();
    }
    public static SingletonEager getInstancia(){
        return instancia;
      
    }
}
