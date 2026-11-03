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

public class PA3Actividad3 {

    // Nodo: guarda un dato y apunta al siguiente
    static class Nodo {
        String dato;
        Nodo siguiente;

        public Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // PILA LIFO: el ultimo en entrar es el primero en salir
    static class Pila {
        Nodo tope;

        public void registrarAccion(String accion) {
            Nodo nuevo = new Nodo(accion);
            nuevo.siguiente = tope;
            tope = nuevo;

            System.out.println("Accion registrada: " + accion);
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

            System.out.println("Acciones pendientes (Tope -> Base):");

            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }

    // COLA FIFO: el primero en entrar es el primero en salir
    static class Cola {
        Nodo frente;
        Nodo fin;

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

        public void mostrar() {
            Nodo actual = frente;

            System.out.println("Tramites pendientes (Frente -> Final):");

            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }

        // SITUACION 3: ultimo ingresado, primero en procesarse
        System.out.println("=== SITUACION 3: PILA LIFO - CARLOS ===");

        Pila pila = new Pila();

        pila.registrarAccion("Registrar matricula");
        pila.registrarAccion("Modificar curso");
        pila.registrarAccion("Actualizar nota");

        pila.mostrar();

        System.out.println("\nProcesando acciones en orden inverso:");
        pila.procesarAccion();
        pila.procesarAccion();
        pila.procesarAccion();

        // SITUACION 4: tramites atendidos por orden de llegada
        System.out.println("\n=== SITUACION 4: COLA FIFO - CARLOS ===");

        Cola cola = new Cola();

        cola.registrarTramite("Solicitud de constancia");
        cola.registrarTramite("Solicitud de certificado");
        cola.registrarTramite("Solicitud de matricula");

        cola.mostrar();

        System.out.println("\nAtendiendo tramites por orden de llegada:");
        cola.atenderTramite();
        cola.atenderTramite();
        cola.atenderTramite();
    }
}



