package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Leo", "Gui", "Eli", "Joy");

        System.out.println("Forma arcaica: ");
        for(String nome: aprovados) {
            System.out.println(nome);
        }
        System.out.println("\nForma Lambda One: ");
        aprovados.forEach((nome) -> System.out.println(nome + "!!"));

        System.out.println("\nMethod Reference: ");
        aprovados.forEach(System.out::println);

        System.out.println("\nForma Lambda Two (Com Método): ");
        aprovados.forEach(nome -> meuLimao(nome));

        System.out.println("\nMethod Reference Two (Com Método): ");
        aprovados.forEach(ForEach::meuLimao);
    }

    static void meuLimao(String nome) {
        System.out.println("Oi! Meu nome é " +nome+ " e eu tenho um limoeiro :D");
    }

}
