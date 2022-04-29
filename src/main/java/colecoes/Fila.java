package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Joao");
        fila.offer("Paula");
        fila.add("Bibiana");
        fila.offer("Luan");

        System.out.println(fila.peek());
        System.out.println(fila.element());



    }
}
