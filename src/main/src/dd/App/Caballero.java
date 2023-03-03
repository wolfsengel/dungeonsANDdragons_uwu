package dd.App;

public class Caballero extends Personaje {
    public Caballero(String nombre) {
        super(nombre);
        salud = 1500;
    }

    @Override
    public void ataca(Personaje enemigo) {
        if (ataque != null) {
            for (int i = 0; i < 2; i++) {
                ataque.lanzaAtaque(enemigo);
            }
        }
    }
}
