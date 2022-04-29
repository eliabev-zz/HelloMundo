package excecao.personalizadaA;

public class NumeroForaDoRangeException extends RuntimeException{

    private static String nomeDoAtributo;
    public NumeroForaDoRangeException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("%s não vale", nomeDoAtributo);
    }
}
