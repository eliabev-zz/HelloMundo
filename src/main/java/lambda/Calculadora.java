package lambda;

public class Calculadora {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Multiplicacao multiplicacao = new Multiplicacao();

        System.out.println(soma.executar(3.7, 7.3));
        System.out.println(multiplicacao.executar(3.7, 7.3));
    }
}
