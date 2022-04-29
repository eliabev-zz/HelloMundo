package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Bia", 4.5);
        Aluno a2 = new Aluno("Lia", 9.2);
        Aluno a3 = new Aluno("Eli", 8.7);
        Aluno a4 = new Aluno("Leo", 9.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota>=7;

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));
    }
}
