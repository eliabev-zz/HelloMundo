package oo.composicao.desafio;

public class Item {

    private Produto produto;
    private int quantidade;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return produto.getPreco();
    }

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
