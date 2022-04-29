package excecao;

public class ChecadaNaoChecada {
    public static void main(String[] args) {
        try{
            geraErro1();
        } catch (Exception e) {
            System.out.println("Animal " +e.getMessage());
        }
        try{
            geraErro2();
        }  catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fim");
    }

    public static void geraErro1() {
        throw  new RuntimeException("Erro de B.I.O.S.");
    }

    public static void geraErro2() throws Exception {
        throw new Exception("Erro 2");
    }
}
