package lambda;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        Predicate<Produto> eCaro = prod -> ((prod.preco * (1- prod.desconto)) > 600);

        Produto pastaDeDente = new Produto("Pasta de Dente", 3.75, 0.09);
        Produto computer = new Produto("Notebook Acer", 3500, .1);
        System.out.println(eCaro.test(pastaDeDente));
        System.out.println(eCaro.test(computer));
    }
}
