package lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num%2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        System.out.println(isPar.test(27));
        System.out.println(isPar.test(2));
        System.out.println(isPar.and(isTresDigitos).test(98));
        System.out.println(isPar.and(isTresDigitos).test(102));
        System.out.println(isPar.and(isTresDigitos).test(101));

    }
}
