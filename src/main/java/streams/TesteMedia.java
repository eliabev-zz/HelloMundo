package streams;

public class TesteMedia {
    public static void main(String[] args) {
        Media m1 = new Media();
        m1.adicionar(8.3);
        m1.adicionar(6.7);

        Media m2 = new Media().adicionar(9.7).adicionar(5.6);
        System.out.println(m1.getMedia());
        System.out.println(m2.getMedia());

        System.out.println(new Media().combinarMedia(m1, m2).getMedia());
    }
}
