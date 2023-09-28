import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        double saldo = 1000000; // Saldo inicial
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Cajero Automático");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar Dinero");
        System.out.println("3. Retirar Dinero");
        System.out.println("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Saldo actual: $" + saldo);
                break;
            case 2:
                System.out.println("Ingrese la cantidad a depositar: ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Nuevo saldo: $" + saldo);
                break;
            case 3:
                System.out.println("Ingrese la cantidad a retirar: ");
                double retiro = scanner.nextDouble();
                if (retiro <= saldo) {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                } else {
                    System.out.println("Fondos insuficientes");
                }
                break;
            default:
                System.out.println("Opción no válida. Por favor seleccione una opción válida.");
        }
        scanner.close();
    }
}