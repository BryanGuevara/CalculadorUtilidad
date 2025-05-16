package ganancia;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Ganancia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "______                          _____                                 \n"
                + "| ___ \\                        |  __ \\                                \n"
                + "| |_/ /_ __ _   _  __ _ _ __   | |  \\/_   _  _____   ____ _ _ __ __ _ \n"
                + "| ___ \\ '__| | | |/ _` | '_ \\  | | __| | | |/ _ \\ \\ / / _` | '__/ _` |\n"
                + "| |_/ / |  | |_| | (_| | | | | | |_\\\\ \\ |_| |  __/\\ V / (_| | | | (_| |\n"
                + "\\____/|_|   \\__, |\\__,_|_| |_|  \\____/\\__,_|\\\\___| \\_/ \\__,_|_|  \\__,_|\n"
                + "             __/ |                                                    \n"
                + "            |___/                                                     \n"
                + "=================================================== <[Entrada]> ==================================================");

        System.out.print("Ingrese el precio del producto: $");
        double precio = scan.nextDouble();

        System.out.print("Ingrese el porcentaje de Ganancias: %");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.print("¿Incluir diezmo? (S/N): ");
        String diezmo = scan.next();

        System.out.print("En cuales partes lo quiere dividir?\n(Ingrese los nombres separados por comas): ");
        scan.nextLine();
        String divisiones = scan.nextLine();

        String[] division = divisiones.split("\\s*,\\s*");

        double porcentajeGanancia = 1 + (num / 100.0);

        double precioReal = (precio / porcentajeGanancia);
        double ganancia = precio - precioReal;

        System.out.println("=================================================== <[Datos]> ====================================================");
        System.out.printf("Precio de producto: $%.2f\n", precioReal);
        System.out.printf("Ganancia del producto: $%.2f\n", ganancia);

        if (diezmo.equals("S")) {
            System.out.printf("Diezmo: $%.2f\n", ganancia / 10);
            ganancia = ganancia - (ganancia / 10);
        }

        double gananciaDividida = ganancia / division.length;

        for (int i = 0; i < division.length; i++) {
            System.out.printf("%s: $%.2f\n", division[i].trim(), gananciaDividida);
        }

        System.out.println("==================================================================================================================");

    }

}
