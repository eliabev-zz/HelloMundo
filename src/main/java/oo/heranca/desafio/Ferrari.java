package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean turbo;
    private boolean ar;

    public Ferrari() {
        super(212);
        this.setDelta(15);
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }


    @Override
    public void ligarTurbo() {
        this.turbo = true;
    }

    @Override
    public void desligarTurbo() {
        this.turbo = false;
    }

    @Override
    public void ligarAr() {
        this.ar = true;
    }

    @Override
    public void desligarar() {
        this.ar = false;
    }

    public int getDelta() {
        if(turbo && !ar) {
            return 35;
        } else if (turbo && ar) {
            return 25;
        } else if(!turbo && !ar) {
            return 15;
        } else {
            return 10;
        }
    }


}
