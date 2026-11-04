import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Actividad 2: Cola FIFO (First In, First Out)
 * Caso: Unidad de servicios academicos - Atencion de solicitudes en orden de llegada.
 * Alumno: Luis Cristofer Siñani Yauri
 */
public class ColaFIFO {

    public static void main(String[] args) {
        Queue<String> colaSolicitudes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Datos iniciales para que la cola luzca bien en la captura
        colaSolicitudes.add("Solicitud #001");
        colaSolicitudes.add("Solicitud #002");
        colaSolicitudes.add("Solicitud #003");

        do {
            System.out.println("\n==========================================");
            System.out.println("   GESTION DE COLA FIFO: TRAMITES ACADEMICOS");
            System.out.println("==========================================");
            System.out.println("1. Encolar nueva solicitud (Registrar tramite)");
            System.out.println("2. Desencolar solicitud (Atender siguiente)");
            System.out.println("3. Visualizar el frente de la cola (Proximo)");
            System.out.println("4. Verificar si la cola esta vacia");
            System.out.println("5. Mostrar lista de solicitudes pendientes");
            System.out.println("6. Mostrar representacion grafica en consola");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
            } else {
                System.out.println("Error: Por favor, ingrese un numero valido.");
                scanner.next();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la solicitud (ej. Solicitud #004): ");
                    String solicitud = scanner.nextLine();
                    colaSolicitudes.add(solicitud);
                    System.out.println("-> Exito! [" + solicitud + "] se ha agregado al FINAL de la cola.");
                    break;

                case 2:
                    if (colaSolicitudes.isEmpty()) {
                        System.out.println("-> Advertencia: La cola esta vacia. No hay solicitudes que atender.");
                    } else {
                        String atendida = colaSolicitudes.poll();
                        System.out.println("-> Atendiendo y retirando del FRENTE: [" + atendida + "]");
                    }
                    break;

                case 3:
                    if (colaSolicitudes.isEmpty()) {
                        System.out.println("-> La cola esta vacia. No hay elementos al frente.");
                    } else {
                        System.out.println("-> Proxima solicitud a ser atendida (FRENTE): [" + colaSolicitudes.peek() + "]");
                    }
                    break;

                case 4:
                    if (colaSolicitudes.isEmpty()) {
                        System.out.println("-> Estado: La cola SI esta vacia.");
                    } else {
                        System.out.println("-> Estado: La cola NO esta vacia. Hay " + colaSolicitudes.size() + " tramite(s) en espera.");
                    }
                    break;

                case 5:
                    if (colaSolicitudes.isEmpty()) {
                        System.out.println("-> La cola se encuentra vacia actualmente.");
                    } else {
                        System.out.println("-> Solicitudes pendientes (Del Frente al Final):");
                        int i = 1;
                        for (String s : colaSolicitudes) {
                            System.out.println("   " + i + ". " + s);
                            i++;
                        }
                    }
                    break;

                case 6:
                    System.out.println("\n--- REPRESENTACION GRAFICA DE LA COLA FIFO ---");
                    if (colaSolicitudes.isEmpty()) {
                        System.out.println("[ FRENTE ] <--- [ COLA VACIA ] ---> [ FINAL ]");
                    } else {
                        System.out.println("SALIDA (Atencion) <------------------------ ENTRADA (Nuevos ingresos)");
                        System.out.print("[FRENTE] ");
                        int count = 0;
                        for (String s : colaSolicitudes) {
                            System.out.print("| " + s + " | ");
                            count++;
                        }
                        System.out.println("[FINAL]");
                        System.out.println("Total de elementos en espera: " + count);
                    }
                    System.out.println("----------------------------------------------");
                    break;

                case 7:
                    System.out.println("Saliendo del sistema de gestion de cola...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
