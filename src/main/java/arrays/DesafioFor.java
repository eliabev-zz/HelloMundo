package arrays;

import java.util.Scanner;

public class DesafioFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas notas você deseja incluir? ");
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];

        for(int i = 0; i<quantidade; i++) {
            System.out.println("Insira a nota " +(i+1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        scanner.close();

        double total = 0;
        for(double nota: notas) {
            total += nota;
        }

        //double media = total/quantidade;
        double media = (double) Math.round((total/quantidade) * 100) / 100;

        if (media >= 6) {
            System.out.println("Parabéns, você passou!\nSua média é: " + media);
        } else {
            System.out.println("Burro");
        }
    }
}
