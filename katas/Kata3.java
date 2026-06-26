package katas;
import java.util.Locale;
import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        //Variables
        double precio;
        double total = 0;
        double IVA = 0.19;
        double descuento = 0.1;

        //Objetos
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        do {
            System.out.println("Ingresa el precio de cada producto que va a llevar o marque 0 para salir: ");
            precio = scanner.nextDouble();
            total = precio + total;
        } while (precio != 0);

        double totalIVA = (total * IVA) + total;
        System.out.println("El total de su pedido es: " + total);
        System.out.println("El total de su IVA es: " + total * IVA);
        System.out.println("Precio con iva incluido es: " + totalIVA);
    
        if(totalIVA >= 50000){
            total = totalIVA - (totalIVA * descuento);
            System.out.println("Su compra es mayor de $50,000, tienes un descuento de: " + totalIVA * descuento);
            System.out.println("Se le a aplicado un descuento del 10%, debes pagar: " + total);
        } 

        scanner.close();
    }
}
