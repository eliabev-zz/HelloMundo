package oo.heranca;

public class Heroi extends Jogador{

    public Heroi(int x, int y) {
        super(x, y);
    }

    public boolean atacar(Jogador adversario) {
        boolean ataque1 = super.atacar(adversario);
        boolean ataque2 = super.atacar(adversario);
        return ataque1 || ataque2;
    }
}
