package katas;

import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dia 1-7, donde 1 = Lunes, 7 = Domingo");
        int day = scanner.nextInt();
        System.out.println("Ingrese su hora de interes 00:00-23:59: ");
        double hour = scanner.nextDouble();

        String dia = switch (day) {
            case 1, 2, 3, 4, 5 -> {
                if (hour >= 6 && hour <= 20) {
                    yield "Cafeteria abierto";
                } else {
                    yield "Cafeteria cerrada";
                }
            }
            case 6 -> {
                if (hour >= 7 && hour <= 14) {
                    yield "Cafeteria abierto";
                } else {
                    yield "Cafeteria cerrada";
                }
            }
            default -> {
                yield "Cafeteria cerrada";
            }
        };
        System.out.print(dia);

        scanner.close();
    }
}
