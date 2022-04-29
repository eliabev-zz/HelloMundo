package lambda;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = (double) (Math.round(preco * (1-desconto)*100)) / 100;
        return "Produto: "+ nome +
                ". Preco: R$ " + preco +
                ". Desconto: " + desconto*100 +
                "%. Preco final: R$ " + precoFinal;
    }
}
