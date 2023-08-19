public class SmartTv{
  boolean ligada = false;
  int canal =1;
  int volume =25;

  public void mudarDeCanal(int novoCanal){
    if(ligada == true)
      canal = novoCanal;
    else
        System.out.println("A tv esta desligada");
  }
   


  public void aumentarVolume(){
    if(ligada == true)
      volume++;
    else
        System.out.println("A tv esta desligada");
  }
  public void diminuitVolume(){
       if(ligada == true)
       volume--;
       else
       System.out.println("A tv esta desligada");
      
  }

  public void ligar(){
    ligada = true;
  }
  public void desligar(){
    ligada = false;
  }
}