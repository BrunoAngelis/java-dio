package fundamentos;

import java.util.Scanner;

public class CondicionalSimples {
    public static void main(String[] args) {

        double saldo = 500.0;
        double valorSolicitado = 150.0;

        if (saldo > valorSolicitado)
            saldo = saldo - valorSolicitado;

            System.out.println("Saldo: "+saldo);



    }

}