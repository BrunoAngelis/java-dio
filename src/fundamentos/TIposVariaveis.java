package fundamentos;

public class TIposVariaveis {
    public static void main(String[] args) {
        double valorSalario = 2.500;

        //tentando colocar numero maior dentro de um menor
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        //definindo uma constante usar a palavra final e como boa pratica colocar em maiusculo
        final double VALOR_DE_PI =  3.14;

        System.out.println(VALOR_DE_PI);
    }
}
