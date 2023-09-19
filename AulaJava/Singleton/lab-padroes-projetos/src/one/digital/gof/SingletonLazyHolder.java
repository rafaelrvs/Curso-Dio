package one.digital.gof;
/*
 * variação encapsulando instancia
 */
public class SingletonLazyHolder{

  public class InstanceHolder{
    private static SingletonLazyHolder instancia = new SingletonLazyHolder();
  }

    private SingletonLazyHolder(){
      super();
    }
    public static SingletonLazyHolder getInstancia(){
      return InstanceHolder.instancia;
    }
}
