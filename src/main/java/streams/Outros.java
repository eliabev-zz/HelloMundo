package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bia", 4.5);
        Aluno a2 = new Aluno("Lia", 9.2);
        Aluno a3 = new Aluno("Eli", 8.7);
        Aluno a4 = new Aluno("Leo", 9.8);
        Aluno a5 = new Aluno("Bia", 4.5);
        Aluno a6 = new Aluno("Fe", 9.2);
        Aluno a7 = new Aluno("Gu", 8.7);
        Aluno a8 = new Aluno("Fran", 9.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(6)
                .limit(3)
                .forEach(System.out::println);


    }
}
