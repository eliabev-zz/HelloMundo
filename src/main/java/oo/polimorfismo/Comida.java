package oo.polimorfismo;

public class Comida {
    private double peso;

    public Comida(double peso) {
        this.setPeso(peso);
    }

    public void setPeso(double peso) {
        peso = Math.abs(peso);
        this.peso = peso;
    }

    public double getPeso() {
        return (double) (Math.round(this.peso*100)/100);
    }
}
