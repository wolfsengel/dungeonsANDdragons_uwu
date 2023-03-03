package dd.App;

import dd.core.Ataque;

public abstract class Personaje {
    protected String nombre;
    public int salud;
    protected Ataque ataque;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public abstract void ataca(Personaje enemigo);

    @Override
    public String toString() {
        return "[" + nombre + ": " + salud + "]";
    }
}
