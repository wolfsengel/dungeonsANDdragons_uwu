package dd;


import dd.App.Caballero;
import dd.App.Personaje;
import dd.App.Rey;
import dd.App.Troll;
import dd.core.AtaqueArco;
import dd.core.AtaqueCuchillo;
import dd.core.AtaqueEspada;

import java.util.Scanner;

public class DDApp {
    public static void main(String[] args) {

        System.out.println("""
                                
                   _____          __                        __________       .__                         ___________      .__                     \s
                  /  _  \\________/  |_ __ _________  ____   \\______   \\ ____ |  |   ____ _____    ______ \\_   _____/_____ |__| ____ _____    ______
                 /  /_\\  \\_  __ \\   __\\  |  \\_  __ \\/  _ \\   |     ___// __ \\|  | _/ __ \\\\__  \\  /  ___/  |    __)_\\____ \\|  |/ ___\\\\__  \\  /  ___/
                /    |    \\  | \\/|  | |  |  /|  | \\(  <_> )  |    |   \\  ___/|  |_\\  ___/ / __ \\_\\___ \\   |        \\  |_> >  \\  \\___ / __ \\_\\___ \\\s
                \\____|__  /__|   |__| |____/ |__|   \\____/   |____|    \\___  >____/\\___  >____  /____  > /_______  /   __/|__|\\___  >____  /____  >
                        \\/                                                 \\/          \\/     \\/     \\/          \\/|__|           \\/     \\/     \\/\s
                                
                """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Presiona cualquier tecla para continuar...");
        scanner.nextLine();


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
                System.out.println("Ha muerto: "+p3);
                break;
            }
            System.out.println(p3 + " ataca a " + p1);
            p3.ataca(p1);
            if (p1.salud <= 0) {
                System.out.println("Ha muerto: "+p1);
                break;
            }
        }
        System.out.println("-----------------------------");
        while (p2.salud > 0 && p3.salud > 0) {
            System.out.println(p2 + " ataca a " + p3);
            p2.ataca(p3);
            if (p3.salud <= 0) {
                System.out.println("Ha muerto: "+p3);
                break;
            }
            System.out.println(p3 + " ataca a " + p3);
            p3.ataca(p2);
            if (p2.salud <= 0) {
                System.out.println("Ha muerto: "+p2);
                break;
            }
        }
        System.out.println("-----------------------------");
        System.out.println("----- Fin de la batalla -----");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}