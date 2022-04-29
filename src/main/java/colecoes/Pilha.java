package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("O Hobbit");
        livros.add("Como Ler Livros");
        System.out.println(livros.peek());

    }
}
