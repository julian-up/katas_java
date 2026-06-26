package katas;

import java.util.Scanner;

public class Kata5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        String productos = "";

        int opcion;

        do {
            System.out.println("\n--- Menú de la Cafetería ---");
            System.out.println("1. Café ($4.000)");
            System.out.println("2. Muffin ($3.500)");
            System.out.println("3. Sandwich ($7.500)");
            System.out.println("4. Jugo ($5.000)");
            System.out.println("5. Té ($3.000)");
            System.out.println("6. Salir");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    productos += "Café\n";
                    total += 4000;
                    break;

                case 2:
                    productos += "Muffin\n";
                    total += 3500;
                    break;

                case 3:
                    productos += "Sandwich\n";
                    total += 7500;
                    break;

                case 4:
                    productos += "Jugo\n";
                    total += 5000;
                    break;

                case 5:
                    productos += "Té\n";
                    total += 3000;
                    break;

                case 6:
                    System.out.println("\n====== FACTURA ======");
                    System.out.println("Productos comprados:");
                    System.out.println(productos);
                    System.out.println("Total a pagar: $" + total);
                    System.out.println("¡Gracias por su compra!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}