package fundamentos;

public class SwitchCase {
    public static void main(String[] args) {
        char sigla = 'P';

        switch (sigla){
            case 'P':{
                System.out.printf("PEQUENO");
                break;
            }
            case 'M':{
                System.out.printf("MEDIO");
                break;
            }
            case 'G':{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("VALOR INVALIDO");
        }
    }
}
