package Main;
import java.util.Random;
public class Main {
}


abstract class Personaje {
    protected String nombre;
    protected int salud;
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

class Rey extends Personaje {
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

class Caballero extends Personaje {
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

class Troll extends Personaje {
    public Troll(String nombre) {
        super(nombre);
        salud = 1000;
    }

    @Override
    public void ataca(Personaje enemigo) {
        if (ataque != null) {
            ataque.lanzaAtaque(enemigo);
        }
    }
}

abstract class Ataque {
    protected int valorAtaque;

    public abstract void lanzaAtaque(Personaje enemigo);

    protected int calculaDanio() {
        Random r = new Random();
        int acierta = r.nextInt(2);
        double factor = r.nextDouble();
        return (int) (acierta * factor * valorAtaque);
    }
}

class AtaqueEspada extends Ataque {
    public AtaqueEspada() {
        valorAtaque = 100;
    }

    @Override
    public void lanzaAtaque(Personaje enemigo) {
        int danio = calculaDanio();
        if (danio == 0) {
            System.out.println("Ataque con espada (falla)");
        } else {
            enemigo.salud -= danio;
            System.out.println("Ataque con espada (-" + danio + ")");
        }
    }
}

class AtaqueArco extends Ataque {
    public AtaqueArco() {
        valorAtaque = 50;
    }

    @Override
    public void lanzaAtaque(Personaje enemigo) {
        int danio = calculaDanio();
        if (danio == 0) {
            System.out.println("Ataque con arco (falla)");
        } else {
            enemigo.salud -= danio;
            System.out.println("Ataque con arco (-" + danio + ")");
        }
    }
}

class AtaqueCuchillo extends Ataque {
    public AtaqueCuchillo() {
        valorAtaque = 25;
    }

    @Override
    public void lanzaAtaque(Personaje enemigo){
        int danio = calculaDanio();
        if (danio == 0) {
            System.out.println("Ataque con cuchillo (falla)");
        } else {
            enemigo.salud -= danio;
            System.out.println("Ataque con cuchillo (-" + danio + ")");
        }
    }
}
