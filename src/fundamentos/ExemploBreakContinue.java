package fundamentos;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int x = 0 ; x<=5;x++) {
            if (x == 3)
                break;
            System.out.printf("Terminou de contar" + x);
        }

    }
}
