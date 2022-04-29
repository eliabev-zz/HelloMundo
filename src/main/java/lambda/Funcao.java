package lambda;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parImpar = numero -> numero % 2 == 0? "par" : "ímpar";
        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
        Function<String, String> empolgou = valor -> valor + "!!!!";

        System.out.println(parImpar.apply(37));
        String resultadoFinal = parImpar.andThen(oResultadoE).andThen(empolgou).apply(16);
        System.out.println(resultadoFinal);
    }
}
