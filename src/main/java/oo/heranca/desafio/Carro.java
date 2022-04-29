package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual;
    protected final int VELOCIDADE_MAXIMA;
    private int delta = 5;

    Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public int obterVelocidade() {
        return this.velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual+=getDelta();
        if(velocidadeAtual>this.VELOCIDADE_MAXIMA){
            velocidadeAtual=this.VELOCIDADE_MAXIMA;
        }
    }

    public void frear() {
        velocidadeAtual-=5;
        if(velocidadeAtual<0){
            velocidadeAtual=0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
