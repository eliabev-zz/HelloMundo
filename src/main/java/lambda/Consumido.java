package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumido {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = produto -> System.out.println(produto.nome + "!!");
        Produto computer = new Produto("Notebook Acer", 3500, .1);

        imprimir.accept(computer);

        Produto lapis = new Produto("Lapis Preto", .75, .05);
        Produto borracha = new Produto("Borracha Branca", 1.2, .1);
        Produto caneta = new Produto("Azul Caneta", 1, .12);
        Produto caderno = new Produto("Death Note", 35, .08);

        List<Produto> compraEscolar = Arrays.asList(computer, lapis, borracha, caneta, caderno);

        compraEscolar.forEach(imprimir);
        compraEscolar.forEach(p -> System.out.println("R$ " + p.preco));
        compraEscolar.forEach(System.out::println);

        List<Integer> ais = Arrays.asList(3, 5, 17, 90);

    }
}
