package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidation {

    public static void main(String[] args) {

        try{
            Aluno aluno = new Aluno("  ", -7);
            Validar.usuario(aluno);
        } catch (StringVaziaException | NumeroForaDoRangeException e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("Fin :)");
    }
}
