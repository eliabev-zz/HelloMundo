package lambda;

public class CalculadoraLambida {

    public static void main(String[] args) {
        Calculus divisao = (x, y) -> {
            return x/y;
        };

        System.out.println(divisao.executar(7.3, 3.7));
    }
}
