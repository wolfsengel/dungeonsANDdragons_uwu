package Main;


public class DDApp {
    public static void main(String[] args) {
        Personaje p1 = new Rey("Rey Arturo");
        Personaje p2 = new Caballero("Caballero Oscuro");
        Personaje p3 = new Troll("Troll Gigante");
        // Configurar ataques
        p1.setAtaque(new AtaqueEspada());
        p2.setAtaque(new AtaqueArco());
        p3.setAtaque(new AtaqueCuchillo());

        // Simulación de batalla
        System.out.println("----- Inicio de la batalla -----");
        System.out.println(p1 + " vs " + p3);
        System.out.println(p2 + " vs " + p3);
        System.out.println("-----------------------------");
        while (p1.salud > 0 && p3.salud > 0) {
            System.out.println(p1 + " ataca a " + p3);
            p1.ataca(p3);
            if (p3.salud <= 0) {
                break;
            }
            System.out.println(p3 + " ataca a " + p1);
            p3.ataca(p1);
        }
        System.out.println("-----------------------------");
        while (p2.salud > 0 && p3.salud > 0) {
            System.out.println(p2 + " ataca a " + p3);
            p2.ataca(p3);
            if (p3.salud <= 0) {
                break;
            }
            System.out.println(p3 + " ataca a " + p2);
            p3.ataca(p2);
        }
        System.out.println("-----------------------------");
        System.out.println("----- Fin de la batalla -----");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}