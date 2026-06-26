package katas;
import java.util.Locale;
import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Ingresa el total de la cuenta");
        double cuenta = scanner.nextDouble();
        
        if (cuenta <= 0) {
            System.out.println("Esta cuenta no se puede pagar");
            System.exit(0);
        }
        
        System.out.println("Ingresa el porcentaje de propina");
        double porcentaje = scanner.nextDouble();
        
        if (porcentaje <= 0) {
            System.out.println("No pagaste propina o ingresaste un valor incorrecto");
            System.exit(0);
        } else if (porcentaje < 5) {
            System.out.println("Propina muy baja");
        } else if (porcentaje > 30) {
            System.out.println("¡Propina generosa!");
        } 
        
        
        
        double propina = (porcentaje * 0.01) * cuenta ;
        double total = propina + cuenta;
        System.out.println("Total a pagar" + total);

        scanner.close();
    }
}
