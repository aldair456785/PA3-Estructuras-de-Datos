# ACTIVIDAD 4: COMPARACIÓN Y ARGUMENTACIÓN

## 4.1. Comparación entre pila y cola

En esta actividad comparamos la pila y la cola, que son las dos estructuras que usamos en el caso de la unidad de servicios académicos. Las dos guardan datos en orden, pero la diferencia está en cuál sale primero: en la pila sale el último que entró y en la cola sale el primero que llegó.

Para el caso, la pila sirve para guardar las acciones que se registran y poder deshacerlas en orden inverso, y la cola sirve para atender las solicitudes de los alumnos en el mismo orden en que llegan.

| Criterio | Pila (LIFO) | Cola (FIFO) |
|---|---|---|
| **Principio de funcionamiento** | El último en entrar es el primero en salir (Last In, First Out). | El primero en entrar es el primero en salir (First In, First Out). |
| **Operaciones principales** | Apilar (push), desapilar (pop), ver el tope (peek) y verificar si está vacía. | Encolar (enqueue), desencolar (dequeue), ver el frente y verificar si está vacía. |
| **Forma de acceso** | Por un solo extremo: el tope. Se agrega y se saca por el mismo lado. | Por dos extremos: se agrega por el final y se saca por el frente. |
| **Elemento que se atiende** | Siempre el más reciente. | Siempre el más antiguo. |
| **Eficiencia de las operaciones** | O(1): apilar y desapilar solo trabajan con el tope. | O(1): encolar y desencolar solo trabajan con el frente y el final. |
| **Ejemplo de la vida diaria** | Una pila de platos: se saca primero el de arriba. | La fila de un banco: se atiende primero al que llegó antes. |
| **Aplicación en el caso** | Historial de cambios para deshacer acciones en el sistema académico. | Atención de solicitudes de constancias, certificados y trámites pendientes. |
| **Ventaja principal** | Permite volver atrás paso a paso, deshaciendo primero lo último que se hizo. | Es justa: respeta el orden de llegada y nadie se adelanta. |

## 4.2. Principio de funcionamiento

La pila funciona como una pila de platos: el último plato que ponemos encima es el primero que sacamos. Por eso se dice que es LIFO.

La cola funciona como la fila de un banco: la primera persona que llega es la primera que atienden y los que llegan después se ponen al final. Por eso se dice que es FIFO.

## 4.3. Operaciones principales

En la pila las operaciones son apilar, que agrega un elemento en el tope; desapilar, que saca el elemento del tope; ver el tope sin sacarlo; y verificar si la pila está vacía antes de desapilar.

En la cola las operaciones son encolar, que agrega un elemento al final; desencolar, que saca el elemento del frente; ver el frente sin sacarlo; y verificar si la cola está vacía antes de desencolar.

Las dos estructuras tienen operaciones parecidas, pero cambian el lugar por donde se saca el elemento.

## 4.4. Forma de acceso

En la pila solo se puede trabajar con el elemento del tope. Para llegar a uno que está abajo, primero hay que sacar los que tiene encima.

En la cola se trabaja con dos extremos: los elementos nuevos entran por el final y el que se atiende sale por el frente. No se puede atender a alguien que está en medio sin que antes pasen los que llegaron primero.

## 4.5. Ventajas en contextos de aplicación

La pila conviene cuando lo importante es lo más reciente. Por ejemplo, si en el sistema académico se registra un alumno, luego se modifica su curso y después se actualiza su nota, y queremos deshacer, lo correcto es deshacer primero la nota, que fue lo último. Lo mismo pasa con el botón deshacer de Word o con el botón atrás del navegador.

La cola conviene cuando lo importante es respetar el orden de llegada. Por ejemplo, si llegan pedidos de constancia, certificado y matrícula, se atienden en ese mismo orden. Así nadie se queda esperando más de lo justo. Lo mismo pasa con la cola de impresión o con la atención en ventanilla.

Si las usamos al revés, el sistema falla: con una cola para deshacer se revertiría primero el cambio más antiguo, y con una pila para atender solicitudes se atendería primero al último que llegó, dejando esperando a los primeros.

## Demostración en Java
Resultado:
```
Apilado: 20
Apilado: 40
Apilado: 60
Pila (Tope -> Base):
60
40
20
Sale de la pila: 60

Encolado: 20
Encolado: 40
Encolado: 60
Cola (Frente -> Final):
20
40
60
Sale de la cola: 20
```

Con los mismos datos, de la pila sale primero el 60 (el último que entró) y de la cola sale primero el 20 (el primero que llegó).

## 4.6. Conclusión grupal

Elegir bien la estructura hace que la solución funcione como el caso lo necesita. Para deshacer acciones usamos una pila, porque así siempre se revierte primero el último cambio y se puede volver atrás en orden, sin dañar los datos. Para atender las solicitudes usamos una cola, porque así se respeta el orden de llegada y la atención es justa para todos. Las dos estructuras tienen operaciones sencillas y rápidas, pero la diferencia está en qué elemento sale primero. Por eso, antes de programar, hay que analizar el flujo del problema: si lo importante es lo más reciente, se usa una pila; si lo importante es el orden de llegada, se usa una cola. Elegir mal la estructura haría que el sistema deshaga cambios equivocados o atienda a las personas en un orden injusto.
