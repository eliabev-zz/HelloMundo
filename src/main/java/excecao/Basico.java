package excecao;

import streams.Aluno;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;
        try {
            imprimirAluno(a1);
        } catch (Exception e) {
            System.out.println("Erro na obtenção do nome do aluno");
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Erro na divisão: " + e.getMessage());
        }

        System.out.println("Parabéns por ter chegado ao fim!");
    }
    public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
