package colecoes;

import colecoes.Usuario;

public class Equals {
    public static void main(String[] args) {

        Usuario user1 = new Usuario();
        user1.nome = "Jonas Santos";
        user1.email = "jonas.s@email.com";

        Usuario user2 = new Usuario();
        user2.nome = "Jonas Santos";
        user2.email = "jonas.s@email.com";

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));

    }
}
