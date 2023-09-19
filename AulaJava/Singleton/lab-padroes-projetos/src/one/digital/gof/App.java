package one.digital.gof;

public class App {
 

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    SingletonEager S = SingletonEager.getInstancia();
  System.out.println(S);
        
    }
}
