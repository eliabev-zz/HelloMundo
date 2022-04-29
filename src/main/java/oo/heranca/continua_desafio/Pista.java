package oo.heranca.continua_desafio;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;

public class Pista {
    public static void main(String[] args) {
        Carro meu = new Etios(240);
        System.out.println("Velocidade do Etios: " + meu.obterVelocidade());
        meu.acelerar();
        meu.acelerar();
        System.out.println("Velocidade do Etios: " + meu.obterVelocidade());
        meu.acelerar();
        meu.acelerar();
        meu.acelerar();
        meu.acelerar();
        meu.acelerar();
        meu.acelerar();
        meu.acelerar();
        meu.acelerar();
        meu.acelerar();
        meu.acelerar();
        meu.acelerar();
        meu.acelerar();
        System.out.println("Velocidade do Etios: "+ meu.obterVelocidade());
        meu.frear();
        meu.frear();
        meu.frear();
        meu.frear();
        System.out.println("Velocidade do Etios: " + meu.obterVelocidade());
        meu.frear();
        meu.frear();
        meu.frear();
        meu.frear();
        meu.frear();
        meu.frear();
        meu.frear();
        meu.frear();
        meu.frear();
        meu.frear();
        System.out.println("Velocidade do Etios: " + meu.obterVelocidade());

        Carro ferrari = new Ferrari();
        System.out.println("Velocidade da Ferrari: " + ferrari.obterVelocidade());
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println("Velocidade da Ferrari: "+ferrari.obterVelocidade());
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println("Velocidade da Ferrari: "+ferrari.obterVelocidade());
    }
}
