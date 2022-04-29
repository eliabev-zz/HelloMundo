package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Eli", 95.37);
        Sorvete jundia = new Sorvete(2);

        System.out.println(eu.getPeso());

        eu.comer(jundia);
        System.out.println(eu.getPeso());
    }
}
