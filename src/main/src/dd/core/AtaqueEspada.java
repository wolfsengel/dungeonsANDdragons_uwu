package dd.core;

import dd.App.Personaje;

public class AtaqueEspada implements Ataque {
    private final int valorAtaque;
    public AtaqueEspada() {
        valorAtaque = 300;
    }

    @Override
    public void lanzaAtaque(Personaje enemigo) {
        int danio = calculaDanio(valorAtaque);
        if (danio == 0) {
            System.out.println("Ataque con espada (falla)");
        } else {
            enemigo.salud -= danio;
            System.out.println("Ataque con espada (-" + danio + ")");
        }
    }
}
