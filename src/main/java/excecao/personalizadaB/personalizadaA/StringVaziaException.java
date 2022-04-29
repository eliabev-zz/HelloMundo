package excecao.personalizadaB.personalizadaA;

public class StringVaziaException extends Exception{

    private static String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("\"%s\" tá vazia", nomeDoAtributo);
    }
}
