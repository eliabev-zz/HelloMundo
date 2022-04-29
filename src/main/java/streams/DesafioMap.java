package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> stringBinaria = n -> Integer.toBinaryString(n);
        UnaryOperator<String> reverseString = n -> {
            StringBuilder sb = new StringBuilder(n);
            sb.reverse();
            return sb.toString();
        };
        Function<String, Integer> binarioToInteiro = n -> Integer.parseInt(n, 2);



        nums.stream()
                .map(stringBinaria)
                .map(reverseString)
                .map(binarioToInteiro)
                .forEach(System.out::println);
    }
}
