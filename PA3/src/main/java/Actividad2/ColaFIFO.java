/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColaFIFO {

    public static void main(String[] args) {
        // Estructura de datos Cola FIFO usando Queue y LinkedList
        Queue<String> colaSolicitudes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Cargar algunos datos iniciales para la prueba
        colaSolicitudes.add("Solicitud #001");
        colaSolicitudes.add("Solicitud #002");
        colaSolicitudes.add("Solicitud #003");

        do {
            System.out.println("\n==============================================");
            System.out.println("  GESTION DE COLA FIFO: TRAMITES ACADEMICOS   ");
            System.out.println("==============================================");
            System.out.println("1. Encolar nueva solicitud (Registrar tramite)");
            System.out.println("2. Desencolar solicitud (Atender siguiente)");
            System.out.println("3. Visualizar el frente de la cola (Proximo)");
            System.out.println("4. Verificar si la cola esta vacia");
            System.out.println("5. Mostrar lista de solicitudes pendientes");
            System.out.println("6. Mostrar representacion grafica en consola");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    // 2.4 Algoritmo para encolar (add)
                    System.out.print("\nIngrese el nombre de la solicitud (ej. Solicitud #004): ");
                    String nuevaSolicitud = scanner.nextLine();
                    if (!nuevaSolicitud.trim().isEmpty()) {
                        colaSolicitudes.add(nuevaSolicitud);
                        System.out.println("[EXITO]: '" + nuevaSolicitud + "' agregada al final de la cola (Rear).");
                    } else {
                        System.out.println("[AVISO]: No se puede ingresar una solicitud vacia.");
                    }
                    break;

                case 2:
                    // 2.5 Algoritmo para desencolar (poll)
                    if (colaSolicitudes.isEmpty()) {
                        System.out.println("\n[AVISO]: La cola esta vacia, no hay solicitudes que atender.");
                    } else {
                        String atendido = colaSolicitudes.poll();
                        System.out.println("\n[EXITO] Atendiendo tramite: " + atendido);
                        System.out.println("  El elemento fue removido del frente (Front) de la cola.");
                    }
                    break;

                case 3:
                    // 2.6 Algoritmo para visualizar el frente (peek)
                    if (colaSolicitudes.isEmpty()) {
                        System.out.println("\n[AVISO]: La cola esta vacia, no hay elementos al frente.");
                    } else {
                        System.out.println("\n[INFO] Proximo tramite en cola (Frente): " + colaSolicitudes.peek());
                    }
                    break;

                case 4:
                    // 2.7 Algoritmo para verificar si esta vacia (isEmpty)
                    if (colaSolicitudes.isEmpty()) {
                        System.out.println("\n-> Estado: La cola esta VACIA.");
                    } else {
                        System.out.println("\n-> Estado: La cola CONTIENE elementos. (Total: " + colaSolicitudes.size() + ")");
                    }
                    break;

                case 5:
                    // Mostrar lista simple
                    if (colaSolicitudes.isEmpty()) {
                        System.out.println("\nNo hay solicitudes pendientes.");
                    } else {
                        System.out.println("\n--- SOLICITUDES PENDIENTES EN ORDEN FIFO ---");
                        int contador = 1;
                        for (String solicitud : colaSolicitudes) {
                            System.out.println("Turno " + contador + ": " + solicitud);
                            contador++;
                        }
                    }
                    break;

                case 6:
                    // Representacion grafica en consola
                    if (colaSolicitudes.isEmpty()) {
                        System.out.println("\n[ COLA VACIA ]");
                    } else {
                        System.out.println("\n--- REPRESENTACION GRAFICA DE LA COLA FIFO ---");
                        System.out.println("SALIDA (Atencion) <----------------------------- ENTRADA (Nuevos ingresos)");
                        System.out.print("[FRENTE] | ");
                        for (String solicitud : colaSolicitudes) {
                            System.out.print(solicitud + " | ");
                        }
                        System.out.println("[FINAL]");
                        System.out.println("Total de elementos en espera: " + colaSolicitudes.size());
                    }
                    break;

                case 7:
                    System.out.println("\nSaliendo del sistema de Gestion de Cola FIFO...");
                    break;

                default:
                    System.out.println("\n[ERROR]: Opcion no valida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }
}