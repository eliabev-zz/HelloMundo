package oo.heranca.continua_desafio;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class OJogo {

    public static void main(String[] args) {
        Jogador player1 = new Heroi(2, 4);
        player1.andar(Direcao.NORTE);
        player1.andar(Direcao.NORTE);
        player1.andar(Direcao.NORTE);
        player1.andar(Direcao.NORTE);
        player1.andar(Direcao.LESTE);

        Jogador player2 = new Monstro();
        player2.andar(Direcao.NORTE);
        player2.andar(Direcao.NORTE);
        player2.andar(Direcao.NORTE);
        player2.andar(Direcao.LESTE);

        System.out.println(player1.vida);
        System.out.println(player2.vida);

        player1.atacar(player2);
        player1.atacar(player2);
        System.out.println(player2.vida);

    }
}
