package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String nome;

    List<Item> listaDeCompra = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade) {
        this.listaDeCompra.add(new Item(produto, quantidade));
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco);
        this.listaDeCompra.add(new Item(produto, quantidade));
    }

    double getValorCompra() {
        double total = 0;
        for(Item item: listaDeCompra) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
}
