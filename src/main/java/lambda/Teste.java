package lambda;

import java.util.Arrays;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, -2, 0, 3, 4);
        int positivo=0;
        int negativo = 0;
        int zero = 0;
        for(int numero: arr) {
            if(numero > 0) {
                positivo++;
            } else if(numero < 0) {
                negativo++;
            } else {
                zero++;
            }
        }

        double quotaPositivo = (double)positivo/arr.size();
        double quotaNegativo = negativo/arr.size();
        double quotaZero = zero/arr.size();

        System.out.printf("%.2f", quotaPositivo);
    }
}