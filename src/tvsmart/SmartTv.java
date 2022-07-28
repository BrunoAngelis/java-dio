package tvsmart;

import java.security.spec.RSAOtherPrimeInfo;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar(){
        ligada = true;
        System.out.println("Tv ligada!");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Tv desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume: "+volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal: "+canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal: "+canal);
    }

    public void selecionarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal: "+canal);
    }
}
