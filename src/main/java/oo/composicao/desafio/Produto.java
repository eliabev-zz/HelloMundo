package oo.composicao.desafio;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
