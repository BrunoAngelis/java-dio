package fundamentos;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFOrmatado = formatarCep("2765064");
            System.out.println(cepFOrmatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();

            return "23.765-064";
    }
}
