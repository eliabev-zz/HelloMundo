package excecao.personalizadaB.personalizadaA;

import excecao.Aluno;

public class Validar {
    private Validar() {}

    public static void usuario(Aluno aluno) throws StringVaziaException, NumeroForaDoRangeException{
        if(aluno==null) {
            throw new IllegalArgumentException("O aluno é hollow");
        }

        if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if(aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaDoRangeException("nota");
        }
    }
}
