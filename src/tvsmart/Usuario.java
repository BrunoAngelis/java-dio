package tvsmart;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta ligada? "+ smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);

        System.out.println("---------- Controle Tv -------");

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.selecionarCanal(5);

    }
}
