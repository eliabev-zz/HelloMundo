package oo.composicao.desafio;

public class PampaPrime {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria Mercedes");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta Bic Preta", 1.12, 5);

        Produto produtoTeste = new Produto("Caderno 20 Matérias", 23);
        compra1.adicionarItem(produtoTeste, 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Faixa de Judô", 97.35, 3);

        compra2.adicionarItem(new Produto("Notebook Positivo", 1756.99), 2);

        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

        System.out.println("R$ " + ((double)Math.round(cliente1.gastoTotal()*100)/100));
    }
}
