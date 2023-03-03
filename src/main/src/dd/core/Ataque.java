package dd.core;

import dd.App.Personaje;

import java.util.Random;

public interface Ataque {
    void lanzaAtaque(Personaje enemigo);
    default int calculaDanio(int valorAtaque){
        Random r = new Random();
        int acierta = r.nextInt(2);
        double factor = r.nextDouble();
        return (int) (acierta * factor * valorAtaque);
    }
}
