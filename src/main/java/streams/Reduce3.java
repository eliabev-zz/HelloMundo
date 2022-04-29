package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Bia", 4.5);
        Aluno a2 = new Aluno("Lia", 9.2);
        Aluno a3 = new Aluno("Eli", 8.7);
        Aluno a4 = new Aluno("Leo", 9.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota>=7;
        Function<Aluno, Double> getNota = a -> a.nota;
        BiFunction<Media, Double, Media>  mediaAlunos = (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinarMedia(m1, m2);

        Media mediaResultante = alunos.stream()
                .filter(aprovado)
                .map(getNota)
                .reduce(new Media(), mediaAlunos, combinarMedia);
        System.out.println(mediaResultante.getMedia());

        List<Aluno> alunosAprovados = new ArrayList<>();

        alunos.stream()
                .filter(aprovado)
                .forEach(alunosAprovados::add);

        System.out.println("Alunos aprovados: ");
        alunosAprovados.stream().forEach(a -> System.out.println(a.nome));

    }
}
