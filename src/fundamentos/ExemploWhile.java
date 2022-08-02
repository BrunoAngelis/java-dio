package fundamentos;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;
                while(mesada>0){
                    double valorDoce = ValorAleatorio();
                    System.out.println("Adicionado ao carrinho");
                    mesada = mesada - valorDoce;

                }

    }

    private static double ValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,9);
    }
}
