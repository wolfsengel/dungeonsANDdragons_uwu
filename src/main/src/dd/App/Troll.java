package dd.App;
public class Troll extends Personaje {
    public Troll(String nombre) {
        super(nombre);
        salud = 15069;
    }

    @Override
    public void ataca(Personaje enemigo) {
        if (ataque != null) {
            ataque.lanzaAtaque(enemigo);
        }
    }
}

