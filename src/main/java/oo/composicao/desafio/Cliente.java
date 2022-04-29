package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nomeCliente;
    List<Compra> comprasDoCliente = new ArrayList<>();

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    void adicionarCompra(Compra compra) {
        this.comprasDoCliente.add(compra);
    }

    double gastoTotal() {
        double total = 0;
        for(Compra compra: comprasDoCliente) {
            total += compra.getValorCompra();
        }
        return total;
    }
}
