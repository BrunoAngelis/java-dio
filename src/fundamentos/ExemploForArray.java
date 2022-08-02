package fundamentos;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Bruno","Juliana","Miguel"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice "+x+" e o aluno "+alunos[x]);
        }

        //Tambem pode usar o for each
        for(String aluno:alunos){
            System.out.printf("Nome do aluno é: "+aluno);
        }
    }
}
