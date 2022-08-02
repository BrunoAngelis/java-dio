package fundamentos;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
         try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Meu nome é: " + nome + " " + sobrenome);
        System.out.println("Minha idade é: " + idade);
         }
         catch (InputMismatchException e){
             System.out.println("Os campos idade e alutura precisam ser numericos");
         }
    }

    /*
        Excecões mais comuns:
        NullPointerException - Quando tentamos obter alguma informação de uma variavel nula.
        ArithmeticException - Quando tentamos dividir um valor por zero
        SQLException - Quando existe algum erro relacionado a interação com a base de dados
        FileNotFoundException - Quando tentamos ler ou escrever em um arquivo que não existe
     */

}
