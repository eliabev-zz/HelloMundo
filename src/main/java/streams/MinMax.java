package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Bia", 4.5);
        Aluno a2 = new Aluno("Lia", 9.2);
        Aluno a3 = new Aluno("Eli", 8.7);
        Aluno a4 = new Aluno("Leo", 9.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota>=7;

        Comparator<Aluno> melhorNota = (al1, al2) -> {
        if (al1.nota > al2.nota) return 1;
        if (al1.nota < al2.nota) return -1;
        return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        Aluno melhor = alunos.stream().max(melhorNota).get();
        Aluno pior = alunos.stream().min(melhorNota).get();

        System.out.println(melhor.nome);
        System.out.println(pior.nome);
    }
}
