package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucca", 8.3);
        Aluno a2 = new Aluno("Ana", 7.9);
        Aluno a3 = new Aluno("Clara", 5.3);
        Aluno a4 = new Aluno("Luis", 6.2);
        Aluno a5 = new Aluno("Rick", 9.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        alunos.stream().filter(n -> n.nota>=7).forEach(n -> System.out.println("Parabéns, " +n.nome+ "! Você está aprovado(a)."));
    }
}
