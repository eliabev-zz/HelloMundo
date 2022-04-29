package arrays;

public class ExercicioForEach {
    public static void main(String[] args) {

        double[] notasAluno = {9.7, 5.3, 8.9, 6.4};

        double total = 0;
        int quant = 0;
        for(double nota:notasAluno) {
            total += nota;
            quant++;
        }

        System.out.println((double) Math.round((total/quant)*100)/100);
    }
}
