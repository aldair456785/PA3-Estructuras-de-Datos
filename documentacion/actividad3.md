# ACTIVIDAD 3: SELECCIÓN DE ESTRUCTURAS DE DATOS

## 3.1. Situación 1: Registro de acciones recientes para revertir cambios

En esta situación, el sistema académico necesita registrar las acciones que realiza un usuario para poder deshacerlas cuando sea necesario. Por ejemplo, si una persona modifica el título de un documento, elimina un párrafo y después cambia el formato, el sistema debe permitir revertir esas acciones en orden inverso.

Para resolver este caso utilizamos una **pila (LIFO)**, porque el último cambio realizado debe ser el primero que se deshaga. De esta manera, el sistema puede regresar paso a paso al estado anterior sin alterar el orden de las acciones.

**Estructura seleccionada: Pila (LIFO)**

**Operaciones utilizadas:**

- **Apilar (push):** registra una nueva acción en el tope de la pila.
- **Desapilar (pop):** retira la última acción registrada para deshacerla.
- **Ver tope (peek):** permite consultar cuál es la última acción sin retirarla.
- **Verificar si está vacía:** comprueba si existen acciones pendientes de deshacer.

**Ejemplo de funcionamiento:**

| Orden | Acción registrada |
|---|---|
| 1 | Modificar título |
| 2 | Eliminar párrafo |
| 3 | Cambiar formato |

Al deshacer los cambios, el sistema retira primero **Cambiar formato**, después **Eliminar párrafo** y finalmente **Modificar título**.

**Justificación:**

La pila es la estructura adecuada porque permite recuperar las acciones en orden inverso al que fueron realizadas. Si se utilizara una cola, se desharía primero la acción más antigua, lo cual no correspondería al funcionamiento esperado de la opción de deshacer.

## 3.2. Situación 2: Atención de solicitudes en orden de llegada

En esta situación, la unidad de servicios académicos recibe solicitudes de los estudiantes, como constancias, certificados y otros trámites. El sistema debe organizarlas para que sean atendidas respetando el orden en que fueron registradas.

Para resolver este caso utilizamos una **cola (FIFO)**, porque la primera solicitud que ingresa debe ser la primera en ser atendida. Las nuevas solicitudes se agregan al final y la atención se realiza desde el frente.

**Estructura seleccionada: Cola (FIFO)**

**Operaciones utilizadas:**

- **Encolar (enqueue):** agrega una nueva solicitud al final de la cola.
- **Desencolar (dequeue):** retira la solicitud que se encuentra al frente para atenderla.
- **Ver frente (peek):** permite consultar cuál es la siguiente solicitud sin retirarla.
- **Verificar si está vacía:** comprueba si existen solicitudes pendientes de atención.

**Ejemplo de funcionamiento:**

| Orden de llegada | Solicitud |
|---|---|
| 1 | Solicitud del estudiante 1 |
| 2 | Solicitud del estudiante 2 |
| 3 | Solicitud del estudiante 3 |

Al atender las solicitudes, el sistema procesa primero la **Solicitud del estudiante 1**, después la del estudiante 2 y finalmente la del estudiante 3.

**Justificación:**

La cola es la estructura adecuada porque respeta el orden de llegada de las solicitudes y permite organizar la atención de manera ordenada. Si se utilizara una pila, se atendería primero la última solicitud registrada, dejando esperando a quienes llegaron antes.

## 3.3. Demostración en Java

Para comprobar la selección de las estructuras, desarrollamos un programa en Java que representa las dos situaciones planteadas. En la primera, utilizamos una pila para registrar acciones y revertir la última acción realizada, demostrando el principio LIFO. En la segunda, utilizamos una cola para registrar solicitudes y atenderlas según su orden de llegada, aplicando el principio FIFO.

En la ejecución, la pila revierte primero la acción «Cambiar formato», mientras que la cola atiende primero la «Solicitud del estudiante 1». De esta manera, comprobamos que cada estructura responde correctamente al orden de procesamiento requerido en su respectiva situación.

**Resultado de la ejecución:**

```text
=== SITUACION 1: PILA ===

Accion registrada: Modificar titulo
Accion registrada: Eliminar parrafo
Accion registrada: Cambiar formato

Acciones recientes (Tope -> Base):
Cambiar formato
Eliminar parrafo
Modificar titulo

Accion revertida: Cambiar formato


=== SITUACION 2: COLA ===

Solicitud recibida: Solicitud del estudiante 1
Solicitud recibida: Solicitud del estudiante 2
Solicitud recibida: Solicitud del estudiante 3

Solicitudes pendientes (Frente -> Final):
Solicitud del estudiante 1
Solicitud del estudiante 2
Solicitud del estudiante 3

Solicitud atendida: Solicitud del estudiante 1
```

**Interpretación del resultado:**

En la primera situación, se observa que la acción «Cambiar formato» fue la última en registrarse y también la primera en revertirse. Esto demuestra el funcionamiento LIFO de la pila.

En la segunda situación, la «Solicitud del estudiante 1» fue la primera en registrarse y también la primera en atenderse. Esto demuestra el funcionamiento FIFO de la cola.

## 3.3. Situación 3: Procesamiento donde el último ingresado debe atenderse primero

En esta situación se necesita procesar los elementos de manera que el último que ingresa sea el primero en atenderse. Por ejemplo, en un sistema académico se pueden registrar diferentes acciones, como registrar una matrícula, modificar un curso y actualizar una nota. Si estas acciones deben procesarse en orden inverso, es necesario utilizar una estructura que permita acceder primero al elemento más reciente.

**Estructura seleccionada: Pila (LIFO)**

Para resolver esta situación utilizamos una pila, porque sigue el principio LIFO (*Last In, First Out*), que significa que el último elemento en ingresar es el primero en salir.

**Operaciones utilizadas:**

- **Apilar:** agrega una nueva acción en el tope de la pila.
- **Desapilar:** retira y procesa la última acción registrada.
- **Mostrar:** permite visualizar las acciones pendientes desde el tope hasta la base.

**Ejemplo de funcionamiento:**

| Orden de registro | Acción |
|---|---|
| 1 | Registrar matrícula |
| 2 | Modificar curso |
| 3 | Actualizar nota |

Al procesar las acciones, el sistema atiende primero **Actualizar nota**, después **Modificar curso** y finalmente **Registrar matrícula**.

**Justificación técnica:**

La pila es la estructura adecuada porque permite procesar primero el elemento más reciente. De esta manera, se cumple el orden inverso requerido en esta situación. Si se utilizara una cola, se procesaría primero la acción más antigua, lo que no correspondería al comportamiento esperado.

## 3.4. Situación 4: Flujo de espera de trámites pendientes

En esta situación se necesita organizar los trámites pendientes para que sean atendidos respetando el orden en que se reciben. Por ejemplo, en una unidad de servicios académicos pueden llegar solicitudes de constancia, certificado y matrícula, las cuales deben atenderse según su orden de llegada.

**Estructura seleccionada: Cola (FIFO)**

Para resolver esta situación utilizamos una cola, porque sigue el principio FIFO (*First In, First Out*), que significa que el primer elemento en ingresar es el primero en salir.

**Operaciones utilizadas:**

- **Encolar:** agrega un nuevo trámite al final de la cola.
- **Desencolar:** retira y atiende el trámite que se encuentra al frente.
- **Mostrar:** permite visualizar los trámites pendientes desde el frente hasta el final.

**Ejemplo de funcionamiento:**

| Orden de llegada | Trámite |
|---|---|
| 1 | Solicitud de constancia |
| 2 | Solicitud de certificado |
| 3 | Solicitud de matrícula |

Al atender los trámites, el sistema procesa primero la **Solicitud de constancia**, después la **Solicitud de certificado** y finalmente la **Solicitud de matrícula**.

**Justificación técnica:**

La cola es la estructura adecuada porque respeta el orden de llegada de los trámites y permite organizar la atención de manera ordenada. Si se utilizara una pila, se atendería primero el último trámite registrado, dejando esperando a quienes llegaron antes.

## 3.5. Comprobación en Java

Para comprobar las situaciones 3 y 4, desarrollamos un programa en Java utilizando pilas y colas implementadas mediante nodos enlazados. La ejecución se realizó en Apache NetBeans, dentro del proyecto `PA3Actividad3`.

En la situación 3 se registran tres acciones y se procesan en orden inverso, demostrando el principio LIFO. En la situación 4 se registran tres trámites y se atienden en el mismo orden en que ingresaron, demostrando el principio FIFO.

### Resultado de la situación 3: Pila LIFO

```text
=== SITUACION 3: PILA LIFO - CARLOS ===
Accion registrada: Registrar matricula
Accion registrada: Modificar curso
Accion registrada: Actualizar nota
Acciones pendientes (Tope -> Base):
Actualizar nota
Modificar curso
Registrar matricula

Procesando acciones en orden inverso:
Accion procesada: Actualizar nota
Accion procesada: Modificar curso
Accion procesada: Registrar matricula

**Conclusión:**

La selección de la estructura depende de cómo debe procesarse la información. Para revertir cambios utilizamos una pila, porque necesitamos recuperar primero la acción más reciente. En cambio, para atender solicitudes utilizamos una cola, porque debemos respetar el orden en que llegan los estudiantes. Ambas estructuras permiten organizar la información, pero cada una responde a una necesidad diferente del sistema académico.
