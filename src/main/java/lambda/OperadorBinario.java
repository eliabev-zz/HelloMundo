package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.7, 6.3));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double result = (n1+n2) /2;
            return result >= 7 ? "Aprovado! " + result: "Reprovado: " + result;

        };
        System.out.println(resultado.apply(7.3, 6.5));
        System.out.println(resultado.apply(8.3, 7.8));
    }
}
