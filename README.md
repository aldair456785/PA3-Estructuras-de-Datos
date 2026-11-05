# README — Evaluación PA3

**Curso:** ALGORITMO Y ESTRUCTURA DE DATOS BASADOS EN INTELIGENCIA ARTIFICIAL  
**Código:** 30710  
**NRC:** 2014  
**Evaluación:** PROCESO DE APRENDIZAJE 3  
**Equipo:** 6  
**Docente:** ESPINOZA BRAVO WILDER JULIO

## 1. Integrantes

| **Integrante** | **Responsabilidad principal** | **Aporte realizado** |
|---|---|---|
| Geraldine Ana Paola Gomez Atanacio | Actividad 3 – Situaciones 1 y 2 | Desarrolló la selección y justificación de las estructuras pila y cola para las dos primeras situaciones, incluyendo su comprobación en Java. |
| Luisanni Andreina Oviedo Woscichowski | Actividad 4 – Comparación de estructuras | Desarrolló la comparación entre las estructuras pila y cola y su demostración mediante Java. |
| Milthom Wilbert Florez Somcco | Actividad 1 – Pila LIFO | Desarrolló los fundamentos, la representación y las operaciones principales de la estructura pila. |
| Carlos César Jiménez Jáuregui | Actividad 3 – Situaciones 3 y 4 | Desarrolló el análisis y la justificación de las estructuras de datos para las dos situaciones asignadas. |
| Luis Cristofer Siñani Yauri | Actividad 2 – Cola FIFO | Desarrolló los fundamentos, la representación y las operaciones principales de la estructura cola. |

## 2. Descripción y objetivo

**Problema:**

Una unidad de servicios académicos necesita gestionar acciones que deben deshacerse en orden inverso al que fueron registradas y atender solicitudes respetando el orden en que llegan. Para resolver estas necesidades, se propone utilizar estructuras de datos que permitan organizar los elementos según el orden en que deben procesarse.

**Objetivo:**

Aplicar los conocimientos de estructuras de datos mediante el uso de pilas (LIFO) y colas (FIFO), desarrollando representaciones gráficas, algoritmos y programas que permitan resolver situaciones prácticas y justificar la selección de cada estructura.

**Solución desarrollada:**

Se plantea una solución basada en las estructuras pila y cola. Se consideran sus características, operaciones principales y aplicaciones en situaciones reales. Asimismo, se desarrollan programas en Java para demostrar su funcionamiento y se realiza una comparación para identificar sus diferencias y ventajas.

### Actividad 1. Pila LIFO

Se desarrolla el funcionamiento de una estructura LIFO (*Last In, First Out*), donde el último elemento que ingresa es el primero en salir. Se presenta su representación gráfica y las operaciones de apilar, desapilar, visualizar el tope y verificar si la pila está vacía.

**Documentación complementaria:** [Ver Actividad 1](documentacion/actividad1.md)

### Actividad 2. Cola FIFO

Se desarrolla el funcionamiento de una estructura FIFO (*First In, First Out*), donde el primer elemento que ingresa es el primero en salir. Se presenta su representación gráfica y las operaciones de encolar, desencolar, visualizar el frente y verificar si la cola está vacía.

**Documentación complementaria:** [Ver Actividad 2](documentacion/actividad2.md)

### Actividad 3. Selección de estructuras para situaciones reales

Se analizan cuatro situaciones para determinar si corresponde utilizar una pila o una cola:

- Registro de acciones recientes para revertir cambios.
- Atención de solicitudes en orden de llegada.
- Procesamiento donde el último elemento ingresado debe atenderse primero.
- Flujo de espera de trámites pendientes.

Se justifica técnicamente la elección de cada estructura según el orden de procesamiento requerido. También se incluyen demostraciones en Java para las situaciones desarrolladas.

**Documentación complementaria:** [Ver Actividad 3](documentacion/actividad3.md)

### Actividad 4. Comparación y argumentación

Se realiza una comparación académica entre las estructuras pila y cola, considerando sus principios de funcionamiento, operaciones principales, forma de acceso y ventajas en diferentes contextos de aplicación. Se complementa con una demostración en Java para observar las diferencias entre LIFO y FIFO.

**Documentación complementaria:** [Ver Actividad 4](documentacion/actividad4.md)

## 3. Cómo ejecutar o revisar

### Requisitos previos

- Apache NetBeans.
- JDK compatible con la configuración de los proyectos.
- Git, si se desea clonar el repositorio desde la terminal.

### Pasos para revisar el proyecto

1. **Clonar el repositorio:** ejecutar el siguiente comando en CMD desde la carpeta donde se desea guardar el proyecto.

   ```bash
   git clone https://github.com/aldair456785/PA3-Estructuras-de-Datos.git
   ```

2. **Abrir NetBeans:** iniciar Apache NetBeans y seleccionar `File > Open Project`.

3. **Seleccionar la actividad:** buscar la carpeta del repositorio y abrir el proyecto Java correspondiente a cada actividad.

4. **Revisar el código:** ingresar a los archivos fuente para consultar los algoritmos y las operaciones implementadas.

5. **Ejecutar el programa:** abrir la clase principal de cada proyecto y utilizar la opción `Run` para comprobar su funcionamiento en la consola.

**Nota:** Las actividades están organizadas por separado. Cada proyecto Java debe abrirse desde su respectiva carpeta en NetBeans.

## 4. Evidencias

En esta sección se presentan las capturas de pantalla que permiten verificar el desarrollo y la ejecución de las actividades.

- [Actividad 1 – Pila LIFO](evidencias/actividad1.png)
- [Actividad 2 – Cola FIFO](evidencias/actividad2.PNG)
- [Actividad 3 – Situación 1](evidencias/actividad3_1.png)
- [Actividad 3 – Situación 2](evidencias/actividad3_2.png)
- [Actividad 3 – Situaciones 3 y 4](evidencias/actividad3_3.png)
- [Actividad 4 – Comparación de estructuras](evidencias/actividad4.png)

Las evidencias están organizadas en la carpeta `evidencias` del repositorio.

## 5. Matriz de participación

La siguiente matriz resume el nivel de participación y los aportes realizados por cada integrante durante el desarrollo de la evaluación.

| **Integrante** | **Desarrollo** | **Pruebas** | **Documentación** | **Exposición** | **Evidencia de participación** |
|---|---|---|---|---|---|
| Geraldine Ana Paola Gomez Atanacio | Alta | Alta | Alta | Alta | Desarrollo de las situaciones 1 y 2 de la Actividad 3, justificación e implementación en Java. |
| Luisanni Andreina Oviedo Woscichowski | Alta | Alta | Alta | Alta | Desarrollo de la comparación entre pila y cola y demostración en Java. |
| Milthom Wilbert Florez Somcco | Alta | Alta | Alta | Alta | Desarrollo de los fundamentos, algoritmos y ejecución de la Actividad 1: Pila LIFO. |
| Carlos César Jiménez Jáuregui | Alta | Alta | Alta | Alta | Desarrollo y justificación de las situaciones 3 y 4 de la Actividad 3. |
| Luis Cristofer Siñani Yauri | Alta | Alta | Alta | Alta | Desarrollo de los fundamentos, algoritmos y ejecución de la Actividad 2: Cola FIFO. |

## 6. Video de exposición

**Video de YouTube:** [Ver video de exposición](https://www.youtube.com/watch?v=NYTra19Gv4M)

**Contenido del video:**

- Presentación de los integrantes del equipo, con las cámaras encendidas.
- Explicación del caso planteado y de la solución desarrollada.
- Desarrollo de las cuatro actividades.
- Demostración de la ejecución de los programas en Java.
- Justificación de la selección de las estructuras de datos.
- Presentación de las conclusiones del trabajo.

## 7. Conclusiones

**Conclusión 1 – Actividad 1: Pila LIFO**

El desarrollo de la pila permitió comprender cómo funcionan las operaciones `push`, `pop` y `peek`. Mediante la ejecución en Java se comprobó que el último elemento agregado es el primero en retirarse. Esta estructura resulta adecuada para gestionar un historial de acciones cuando se necesita deshacer primero el cambio más reciente.

**Conclusión 2 – Actividad 2: Cola FIFO**

La implementación de la cola permitió comprobar que los elementos se agregan al final y se retiran desde el frente. De esta manera, las solicitudes académicas pueden atenderse respetando su orden de llegada, evitando que los trámites nuevos pasen delante de los anteriores.

**Conclusión 3 – Actividad 3: Situaciones 1 y 2**

El análisis de las dos primeras situaciones permitió identificar que no todos los procesos requieren la misma estructura. Para revertir acciones se utiliza una pila, mientras que para atender solicitudes según su llegada se utiliza una cola. La elección depende del orden en que deben procesarse los elementos.

**Conclusión 4 – Actividad 3: Situaciones 3 y 4**

Las situaciones analizadas confirmaron que la pila es apropiada cuando se necesita procesar primero el último elemento ingresado, mientras que la cola permite mantener el orden de llegada de los trámites pendientes. Aplicar correctamente estos principios ayuda a organizar los procesos y evitar alteraciones en su secuencia.

**Conclusión 5 – Actividad 4: Comparación y argumentación**

La comparación permitió reconocer que las pilas y las colas tienen operaciones de inserción y eliminación, pero se diferencian en la forma de acceder a los elementos. La pila trabaja desde el tope y la cola utiliza el frente y el final. Por ello, seleccionar la estructura de acuerdo con las necesidades del problema permite desarrollar soluciones más ordenadas y adecuadas.

---

**Última actualización:** 04/11/2026
