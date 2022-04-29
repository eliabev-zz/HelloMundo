package oo.heranca;

public class Jogador {

    int x;
    int y;
    public int vida = 100;
//    Jogador() {
//
//    }

    Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador oponente) {

        int deltaX = Math.abs(this.x - oponente.x);
        int deltaY = Math.abs(this.y - oponente.y);

        if ((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0)) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }

    }


    public boolean andar(Direcao direcao) {
        if(direcao == Direcao.NORTE && y < 100) y++;
        if(direcao == Direcao.LESTE && x < 100) x++;
        if(direcao == Direcao.SUL && y > 0) y--;
        if(direcao == Direcao.OESTE && x > 0) x--;
        return true;
    }
}
