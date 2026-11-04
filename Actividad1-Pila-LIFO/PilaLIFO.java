
import java.util.Stack;
import java.util.Scanner;

/**
 * Actividad 1: Pila LIFO (Last In, First Out)
 * Caso: Unidad de servicios academicos - Gestion de solicitudes.
 * Alumno: Milthom
 */

public class PilaLIFO {

    public static void main(String[] args) {

        Stack<String> pilaSolicitudes = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Datos iniciales
        pilaSolicitudes.push("Solicitud #001");
        pilaSolicitudes.push("Solicitud #002");
        pilaSolicitudes.push("Solicitud #003");

        do {
            System.out.println("\n======================================");
            System.out.println("       GESTION DE PILA LIFO");
            System.out.println("======================================");
            System.out.println("1. Apilar nueva solicitud");
            System.out.println("2. Desapilar solicitud");
            System.out.println("3. Visualizar el elemento del tope");
            System.out.println("4. Verificar si la pila esta vacia");
            System.out.println("5. Mostrar solicitudes pendientes");
            System.out.println("6. Mostrar representacion grafica");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Error: Ingrese un numero valido.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la solicitud: ");
                    String solicitud = scanner.nextLine();

                    pilaSolicitudes.push(solicitud);

                    System.out.println("-> Solicitud agregada correctamente al TOPE.");
                    break;

                case 2:
                    if (pilaSolicitudes.isEmpty()) {
                        System.out.println("-> La pila esta vacia.");
                    } else {
                        String retirada = pilaSolicitudes.pop();
                        System.out.println("-> Solicitud retirada: " + retirada);
                    }
                    break;

                case 3:
                    if (pilaSolicitudes.isEmpty()) {
                        System.out.println("-> No hay elementos en el tope.");
                    } else {
                        System.out.println("-> Elemento en el TOPE: "
                                + pilaSolicitudes.peek());
                    }
                    break;

                case 4:
                    if (pilaSolicitudes.isEmpty()) {
                        System.out.println("-> La pila esta vacia.");
                    } else {
                        System.out.println("-> La pila contiene "
                                + pilaSolicitudes.size() + " solicitudes.");
                    }
                    break;

                case 5:
                    if (pilaSolicitudes.isEmpty()) {
                        System.out.println("-> No existen solicitudes pendientes.");
                    } else {
                        System.out.println("-> Solicitudes pendientes (TOPE a BASE):");

                        for (int i = pilaSolicitudes.size() - 1; i >= 0; i--) {
                            System.out.println("   " + pilaSolicitudes.get(i));
                        }
                    }
                    break;

                case 6:
                    System.out.println("\n--- REPRESENTACION GRAFICA DE PILA LIFO ---");

                    if (pilaSolicitudes.isEmpty()) {
                        System.out.println("       [ PILA VACIA ]");
                    } else {
                        System.out.println("          TOPE");

                        for (int i = pilaSolicitudes.size() - 1; i >= 0; i--) {
                            System.out.println("       | "
                                    + pilaSolicitudes.get(i) + " |");
                        }

                        System.out.println("       -----------");
                        System.out.println("          BASE");
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del sistema de gestion de pila...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}

