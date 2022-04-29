package generics;

import java.math.BigDecimal;

public class CaixaIntTeste {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(19);

        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);

        CaixaNumero<Float> caixaF = new CaixaNumero<>();

        caixaF.guardar((float) (12.3*3));

        Float abrirF = (Float) caixaF.abrir();

        System.out.println(abrirF);
    }
}
