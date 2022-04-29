package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p1 = new Produto("Televisão", 1999, .1);
        Function<Produto, Double> valorComDesconto = p -> (p.preco * (1 - p.desconto));
        UnaryOperator<Double> imposto = v -> v >= 2500 ? v*1.085 : v;
        UnaryOperator<Double> frete = v -> v >= 3000 ? v + 100 : v + 50;
        UnaryOperator<Double> arredondar = v -> (double) Math.round(v*100) / 100;
        Function<Double, String> formatar = v -> ("R$ " + v).replace(".", ",");

        System.out.println(valorComDesconto.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatar).apply(p1));
    }
}
