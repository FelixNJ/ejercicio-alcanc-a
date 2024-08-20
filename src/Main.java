import java.util.Scanner;
//Felipe Navarro Jamaica
//Alcancia que permite meter una moneda de algun valor, contar cuantas monedas hay, el total ahorrado y vaciar la alcancia
//20/08/2024

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, moneda, mon20=0, mon50=0, mon100=0, mon200=0, mon500=0;
        boolean salir = false;
        while (!salir) {
            System.out.println("----Menu Alcancia----");
            System.out.println("1)Depositar monedas");
            System.out.println("2)Contar mis monedas");
            System.out.println("3)Total ahorrado");
            System.out.println("4)Romper alcancia");
            System.out.println("5)Terminar");
            System.out.println("Escoja una opcion:");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.print("Ingresa la denominación de la moneda (20, 50, 100, 200, 500): ");
                moneda = scanner.nextInt();
                if (moneda == 20) {
                    System.out.println("Añadiste una moneda de 20 pesos");
                    mon20++;
                } else
                if (moneda == 50) {
                    System.out.println("Añadiste una moneda de 50 pesos");
                    mon50++;
                } else
                if (moneda == 100) {
                    System.out.println("Añadiste una moneda de 100 pesos");
                    mon100++;
                } else
                if (moneda == 200) {
                    System.out.println("Añadiste una moneda de 200 pesos");
                    mon200++;

                } else
                if (moneda == 500) {
                    System.out.println("Añadiste una moneda de 500 pesos");
                    mon500++;
                } else {
                    System.out.println("Denominación no válida.");
                }
            } else
            if (opcion == 2) {
                System.out.println("Cantidad de monedas por su valor:");
                System.out.println();
                System.out.println("Monedas de $20: " + mon20);
                System.out.println("Monedas de $50: " + mon50);
                System.out.println("Monedas de $100: " + mon100);
                System.out.println("Monedas de $200: " + mon200);
                System.out.println("Monedas de $500: " + mon500);
            } else
            if (opcion == 3) {
                int total= (mon20 * 20 + mon50 * 50 + mon100 * 100 + mon200 * 200 + mon500 * 500);
                System.out.println("Total de dinero ahorrado: $" + total);
            } else
            if (opcion == 4) {
                System.out.println("Rompiendo la alcancía...");
                mon20 = 0;
                mon50 = 0;
                mon100 = 0;
                mon200 = 0;
                mon500 = 0;
                System.out.println("Alcancía vacía.");
            } else
            if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                salir = true;
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }
}