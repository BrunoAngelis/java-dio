package fundamentos;

public class CondicionalEncadeada {
    public static void main(String[] args) {
        int nota = 6;

        if(nota > 7)
            System.out.println("Aprovado");
        else if (nota>5 && nota<7)
            System.out.println("Recuperaçao");
        else
            System.out.println("Reprovado");

    }
}
