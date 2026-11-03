public class ComparacionPilaCola {

    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // PILA: se agrega y se saca por el tope
    static class PilaLista {
        private Nodo tope;

        public PilaLista() {
            tope = null;
        }

        public void push(int dato) {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = tope;
            tope = nuevo;
            System.out.println("Nodo apilado: " + dato);
        }

        public void pop() {
            if (tope == null) return;
            System.out.println("Sale de la pila: " + tope.dato);
            tope = tope.siguiente;
        }

        public void mostrar() {
            Nodo actual = tope;
            System.out.println("Pila (Tope -> Base):");
            while (actual != null) {
                System.out.println(actual.dato + " ");
                actual = actual.siguiente;
            }
        }
    }

    // COLA: se agrega por el final y se saca por el frente
    static class ColaLista {
        private Nodo frente;
        private Nodo fin;

        public ColaLista() {
            frente = null;
            fin = null;
        }

        public void encolar(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (frente == null) {
                frente = nuevo;
            } else {
                fin.siguiente = nuevo;
            }
            fin = nuevo;
            System.out.println("Nodo encolado: " + dato);
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
                System.out.println(actual.dato + " ");
                actual = actual.siguiente;
            }
        }
    }

    public static void main(String[] arg) {
        PilaLista pila = new PilaLista();
        pila.push(20);
        pila.push(40);
        pila.push(60);
        pila.mostrar();
        pila.pop();

        System.out.println();

        ColaLista cola = new ColaLista();
        cola.encolar(20);
        cola.encolar(40);
        cola.encolar(60);
        cola.mostrar();
        cola.desencolar();
    }
}
