/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pa3actividad3;

/**
 *
 * @author Ana
 */
public class PA3Actividad3 {

    // Nodo: almacena un dato y el enlace al siguiente
    static class Nodo {
        String dato;
        Nodo siguiente;

        public Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // PILA (LIFO): para revertir acciones recientes
    static class Pila {
        Nodo tope;

        public void registrarAccion(String accion) {
            Nodo nuevo = new Nodo(accion);
            nuevo.siguiente = tope;
            tope = nuevo;
            System.out.println("Accion registrada: " + accion);
        }

        public void deshacerAccion() {
            if (tope == null) {
                System.out.println("No hay acciones para deshacer.");
                return;
            }

            System.out.println("Accion revertida: " + tope.dato);
            tope = tope.siguiente;
        }

        public void mostrar() {
            Nodo actual = tope;
            System.out.println("Acciones recientes (Tope -> Base):");

            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }

    // COLA (FIFO): para atender solicitudes por orden de llegada
    static class Cola {
        Nodo frente;
        Nodo fin;

        public void registrarSolicitud(String solicitud) {
            Nodo nuevo = new Nodo(solicitud);

            if (frente == null) {
                frente = nuevo;
            } else {
                fin.siguiente = nuevo;
            }

            fin = nuevo;
            System.out.println("Solicitud recibida: " + solicitud);
        }

        public void atenderSolicitud() {
            if (frente == null) {
                System.out.println("No hay solicitudes pendientes.");
                return;
            }

            System.out.println("Solicitud atendida: " + frente.dato);
            frente = frente.siguiente;

            if (frente == null) {
                fin = null;
            }
        }

        public void mostrar() {
            Nodo actual = frente;
            System.out.println("Solicitudes pendientes (Frente -> Final):");

            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }

    public static void main(String[] args) {

        // SITUACION 1: Revertir acciones recientes
        System.out.println("=== SITUACION 1: PILA ===");

        Pila pila = new Pila();

        pila.registrarAccion("Modificar titulo");
        pila.registrarAccion("Eliminar parrafo");
        pila.registrarAccion("Cambiar formato");

        pila.mostrar();
        pila.deshacerAccion();

        System.out.println();

        // SITUACION 2: Atender solicitudes en orden de llegada
        System.out.println("=== SITUACION 2: COLA ===");

        Cola cola = new Cola();

        cola.registrarSolicitud("Solicitud del estudiante 1");
        cola.registrarSolicitud("Solicitud del estudiante 2");
        cola.registrarSolicitud("Solicitud del estudiante 3");

        cola.mostrar();
        cola.atenderSolicitud();
    }
}
