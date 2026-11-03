package pa3actividad4;

public class PA3Actividad4 {

    // Nodo: guarda un dato y el enlace al siguiente
    static class Nodo {
        String dato;
        Nodo siguiente;

        public Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // PILA (LIFO): se entra y se sale por el tope
    static class Pila {
        Nodo tope;

        public void apilar(String dato) {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = tope;
            tope = nuevo;
            System.out.println("Apilado: " + dato);
        }

        public void desapilar() {
            if (tope == null) return;
            System.out.println("Sale de la pila: " + tope.dato);
            tope = tope.siguiente;
        }

        public void mostrar() {
            Nodo actual = tope;
            System.out.println("Pila (Tope -> Base):");
            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }

    // COLA (FIFO): se entra por el final y se sale por el frente
    static class Cola {
        Nodo frente;
        Nodo fin;

        public void encolar(String dato) {
            Nodo nuevo = new Nodo(dato);
            if (frente == null) {
                frente = nuevo;
            } else {
                fin.siguiente = nuevo;
            }
            fin = nuevo;
            System.out.println("Encolado: " + dato);
        }

        public void desencolar() {
            if (frente == null) return;
            System.out.println("Sale de la cola: " + frente.dato);
            frente = frente.siguiente;
        }

        public void mostrar() {
            Nodo actual = frente;
            System.out.println("Cola (Frente -> Final):");
            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }

    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.apilar("20");
        pila.apilar("40");
        pila.apilar("60");
        pila.mostrar();
        pila.desapilar();

        System.out.println();

        Cola cola = new Cola();
        cola.encolar("20");
        cola.encolar("40");
        cola.encolar("60");
        cola.mostrar();
        cola.desencolar();
    }
}
