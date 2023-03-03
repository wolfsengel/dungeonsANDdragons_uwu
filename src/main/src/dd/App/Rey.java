package dd.App;

public class Rey extends Personaje {
    public Rey(String nombre) {
        super(nombre);
        salud = 2000;
    }

    @Override
    public void ataca(Personaje enemigo) {
        if (ataque != null) {
            for (int i = 0; i < 3; i++) {
                ataque.lanzaAtaque(enemigo);
            }
        }
    }
}
