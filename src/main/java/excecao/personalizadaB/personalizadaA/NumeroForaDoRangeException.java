package excecao.personalizadaB.personalizadaA;

public class NumeroForaDoRangeException extends Exception{

    private static String nomeDoAtributo;
    public NumeroForaDoRangeException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("%s não vale", nomeDoAtributo);
    }
}
