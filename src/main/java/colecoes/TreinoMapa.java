package colecoes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreinoMapa {
    public static void main(String[] args) {
        Map<String, double[]> notasDeAlunos = new HashMap<>();

        System.out.println("Quantos alunos você precisa? ");
        Scanner scanner = new Scanner(System.in);
        int quantidadeAlunos = scanner.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int notasPorAluno = scanner.nextInt();

        for(int a=0; a<quantidadeAlunos; a++) {
            System.out.println("Informe o nome do " +(a+1)+ "º aluno: ");
            String nome = scanner.next();
            double notas[] = new double[notasPorAluno];
            for(int n=0; n<notasPorAluno; n++) {
                System.out.println("Informe a " +(n+1)+ "ª nota do(a) aluno(a) " +nome);
                notas[n] = scanner.nextDouble();
            }
            notasDeAlunos.put(nome, notas);
        }

        for(Map.Entry<String, double[]> mapa:notasDeAlunos.entrySet()) {
            System.out.println(mapa.getKey() +" => "+ Arrays.toString(mapa.getValue()));
        }

    }
}
