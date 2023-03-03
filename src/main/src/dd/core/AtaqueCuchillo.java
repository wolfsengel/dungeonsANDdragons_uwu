package dd.core;

import dd.App.Personaje;

public class AtaqueCuchillo implements Ataque {
    private final int valorAtaque;
    public AtaqueCuchillo() {
        valorAtaque = 150;
    }

    @Override
    public void lanzaAtaque(Personaje enemigo) {
        int danio = calculaDanio(valorAtaque);
        if (danio == 0) {
            System.out.println("Ataque con cuchillo (falla)");
        } else {
            enemigo.salud -= danio;
            System.out.println("Ataque con cuchillo (-" + danio + ")");
        }
    }
}
