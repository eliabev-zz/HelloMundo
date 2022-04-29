package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        System.out.println("Informe a quantidade de notas por aluno: ");
        int notasDeAluno = scanner.nextInt();


        double[][] matrizAlunosNotas = new double[quantidadeAlunos][notasDeAluno];

        double total = 0;
        int posicaoAluno = 0;
        for(double[] aluno:matrizAlunosNotas) {
            int posicaoNota = 0;
            for(double nota:aluno) {
                System.out.println("Informe a " + (posicaoNota+1) + "ª nota do " + (posicaoAluno+1) + "º aluno: ");
                double atual = scanner.nextDouble();
                matrizAlunosNotas[posicaoAluno][posicaoNota] = atual;
                posicaoNota++;
                total+= atual;
            }
            posicaoAluno++;

        }
        scanner.close();

        int quantidadeNotas = quantidadeAlunos*notasDeAluno;
        double media = (double) Math.round(total/quantidadeNotas * 100) / 100;

        System.out.println("Quantidade de alunos: " + quantidadeAlunos);
        System.out.println("Quantidade de notas: " + quantidadeNotas);
        System.out.println("Total: " + total);
        System.out.println("Media das notas: " + media);
    }
}
