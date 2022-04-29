package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilter {
    public static void main(String[] args) {
        Carro c1 = new Carro("HR-V", 12.3, 105100);
        Carro c2 = new Carro("Corolla", 13.9, 137414);
        Carro c3 = new Carro("Etios", 15, 68054);
        Carro c4 = new Carro("HB20", 14.9, 71102);
        Carro c5 = new Carro("Civic", 13, 120990);

        Predicate<Carro> preco = n -> n.preco <= 80000;
        Predicate<Carro> consumo = n -> n.consumo >= 14;
        Function<Carro, String> opcoes = n -> n.nome+" é uma opção.";

        List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5);

        carros.stream()
                .filter(preco)
                .filter(consumo)
                .map(opcoes)
                .forEach(System.out::println);
    }
}
