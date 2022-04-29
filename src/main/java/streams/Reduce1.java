package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac+n;


        int result = nums.stream().reduce(soma).get();
        System.out.println(result);

        Integer total2 = nums.stream().reduce(7, soma);
        System.out.println(total2);

        nums.stream()
                .filter(n -> n>10)
                .reduce(soma)
                .ifPresentOrElse(System.out::println, () -> {System.out.println("Nenhum resultado enccontrado :(");});
    }
}
