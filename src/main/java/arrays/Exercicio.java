package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 10;
        notasAlunoA[1] = 7.75;
        notasAlunoA[2] = 9.2;
        notasAlunoA[3] = 6.5;

        String a = Arrays.toString(notasAlunoA);
        System.out.printf(a);

        System.out.println(notasAlunoA[0]);
    }
}
