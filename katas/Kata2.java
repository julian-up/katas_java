package katas;
import java.util.Locale;
import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Ingrese el nombre de una bebida");
        String bebida = scanner.nextLine(); // todo se guarde en una pila.

        System.out.println("Ingrese la temperatura en grados Celcius");
        int temperatura = scanner.nextInt();

        if (temperatura > 60) {
            System.out.println(bebida + " :Caliente.");
        } else if (temperatura > 30 && temperatura < 60) {
            System.out.println(bebida + " :Templada");
        } else if (temperatura < 30) {
            System.out.println(bebida + " :Fria");
        }
        scanner.close();
    }
}
