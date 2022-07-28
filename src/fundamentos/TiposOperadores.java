package fundamentos;

public class TiposOperadores {
    public static void main(String[] args) {
        //Operador de atribuição " = " para definir valor ou sobre escrever valor de variavel
        String nome = "Bruno" + "Garcia";
        System.out.println(nome);


        //Operadores Aritimeitcos utilizados para realizar operações matematicas
        // + , - , * , / %
        double soma = 10.5 + 15.7;
        int subtracao = 5 - 2;
        int multiplicacao = 5 * 9;
        int divisao = 15 / 3;
        int modulo = 18 % 3 ;
        double resultado = (10*7) + (20/4);


        //Operador Unarios - incrementrar, decrementar e inverter valores
        // (+) positivo ; (-) negativo; (++) incremento valor; (--) decremento valor; (!) negação

        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = + numero * -1;
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        // Ternario - serve como condicional apenas em uma linha usando "?"
        int a = 5;
        int b = 6;
        String valor = a==b ? "Verdadeiro" : "Falso";
        System.out.println(valor);

        // Relacionais - Avaliam a relação entre duas variaveis
        // == , != , > , >= , < , <=
        // para objetos usar -> equals

        String nomeUm = "Bruno";
        String nomeDois = new String("Bruno");
        System.out.println(nomeUm.equals(nomeDois));

        boolean simNao = a == b;
        System.out.println("A igual a B? " + simNao);
        simNao = a != b;
        System.out.println("A diferente de B? "+simNao);

        //Lógicos - && and ||
        boolean condicao1=true;
        boolean condicao2=true;

        if(condicao1 && condicao2 ){
            System.out.println("As duas condições são verdadeira");
        }

        if (condicao1|| condicao2){
            System.out.println("Uma das condições é verdadeira " );
        }
    }
}
