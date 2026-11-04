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

    // PILA (LIFO)
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

        public void procesarAccion() {
            if (tope == null) {
                System.out.println("No hay acciones pendientes.");
                return;
            }

            System.out.println("Accion procesada: " + tope.dato);
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

    // COLA (FIFO)
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

        public void registrarTramite(String tramite) {
            Nodo nuevo = new Nodo(tramite);

            if (fin == null) {
                frente = nuevo;
                fin = nuevo;
            } else {
                fin.siguiente = nuevo;
                fin = nuevo;
            }

            System.out.println("Tramite recibido: " + tramite);
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

        public void atenderTramite() {
            if (frente == null) {
                System.out.println("No hay tramites pendientes.");
                return;
            }

            System.out.println("Tramite atendido: " + frente.dato);
            frente = frente.siguiente;

            if (frente == null) {
                fin = null;
            }
        }

        public void mostrarSolicitudes() {
            Nodo actual = frente;

            System.out.println("Solicitudes pendientes (Frente -> Final):");

            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }

        public void mostrarTramites() {
            Nodo actual = frente;

            System.out.println("Tramites pendientes (Frente -> Final):");

            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }

    public static void main(String[] args) {

        // SITUACION 1: Revertir acciones recientes
        System.out.println("=== SITUACION 1: PILA ===");

        Pila pila1 = new Pila();

        pila1.registrarAccion("Registrar solicitud de matricula");
        pila1.registrarAccion("Modificar datos de la solicitud");
        pila1.registrarAccion("Actualizar estado de la solicitud");

        pila1.mostrar();
        pila1.deshacerAccion();

        System.out.println();

        // SITUACION 2: Atender solicitudes en orden de llegada
        System.out.println("=== SITUACION 2: COLA ===");

        Cola cola1 = new Cola();

        cola1.registrarSolicitud("Solicitud del estudiante 1");
        cola1.registrarSolicitud("Solicitud del estudiante 2");
        cola1.registrarSolicitud("Solicitud del estudiante 3");

        cola1.mostrarSolicitudes();
        cola1.atenderSolicitud();

        System.out.println();

        // SITUACION 3: Ultimo ingresado, primero en procesarse
        System.out.println("=== SITUACION 3: PILA LIFO - CARLOS ===");

        Pila pila2 = new Pila();

        pila2.registrarAccion("Registrar matricula");
        pila2.registrarAccion("Modificar curso");
        pila2.registrarAccion("Actualizar nota");

        pila2.mostrar();

        System.out.println("\nProcesando acciones en orden inverso:");
        pila2.procesarAccion();
        pila2.procesarAccion();
        pila2.procesarAccion();

        System.out.println();

        // SITUACION 4: Tramites atendidos por orden de llegada
        System.out.println("=== SITUACION 4: COLA FIFO - CARLOS ===");

        Cola cola2 = new Cola();

        cola2.registrarTramite("Solicitud de constancia");
        cola2.registrarTramite("Solicitud de certificado");
        cola2.registrarTramite("Solicitud de matricula");

        cola2.mostrarTramites();

        System.out.println("\nAtendiendo tramites por orden de llegada:");
        cola2.atenderTramite();
        cola2.atenderTramite();
        cola2.atenderTramite();
    }
}
