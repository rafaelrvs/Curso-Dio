public class Saldo{
  double valorGuardado = 100;


  public void inserindoValor(double valorDigitado){
    if(valorDigitado > valorGuardado || valorDigitado < 0){
      System.out.println("Saldo insuficiente");

    }
    else{
      valorGuardado = valorGuardado - valorDigitado;
      System.out.println("Seiu saldo atual é:  " + valorGuardado);
  
      }
  }




}

