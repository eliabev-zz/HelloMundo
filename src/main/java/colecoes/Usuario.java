package colecoes;

public class Usuario {
    public String nome;
    public String email;

    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;

            return super.equals(objeto);
        } else {
            return false;
        }
    }

}
