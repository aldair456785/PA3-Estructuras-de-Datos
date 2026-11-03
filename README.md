# README — Evaluación PA3

> **Curso:** ALGORITMO Y ESTRUCTURA DE DATOS BASADOS EN INTELIGENCIA ARTIFICIAL  
> **Código:** 30710  
> **Evaluación:** PA3  
> **Equipo:** Equipo 6

## 1. Integrantes

| **Integrante** | **Responsabilidad principal** | **Aporte realizado** |
|---|---|---|
| Geraldine Ana Paola Gómez Atanacio | Actividad 3 – Situaciones 1 y 2 | Desarrolló la selección y justificación de las estructuras pila y cola para las dos primeras situaciones, incluyendo su implementación en Java. |
| Luisanni Andreina Oviedo Woscichowski | Actividad 4 – Comparación de estructuras | Desarrolló la comparación entre las estructuras pila y cola y su demostración mediante Java. |
| Milthom Wilbert Flórez Somcco | Actividad 1 – Pila LIFO | Responsable del desarrollo de los fundamentos, representación y operaciones de la estructura pila. |
| Carlos César Jiménez Jáuregui | Actividad 3 – Situaciones 3 y 4 | Responsable del análisis y justificación de las estructuras de datos para las dos situaciones asignadas. |
| Luis Cristofer Siñani Yauri | Actividad 2 – Cola FIFO | Responsable del desarrollo de los fundamentos, representación y operaciones de la estructura cola. |

## 2. Descripción y objetivo

**Problema:**

Una unidad de servicios académicos necesita gestionar acciones que deben deshacerse en orden inverso al que fueron registradas y atender solicitudes respetando el orden en que llegan. Para resolver estas necesidades, se propone utilizar estructuras de datos que permitan organizar los elementos según el orden en que deben procesarse.

**Objetivo:**

Aplicar los conocimientos de estructuras de datos mediante el uso de pilas (LIFO) y colas (FIFO), desarrollando representaciones gráficas, algoritmos y programas que permitan resolver situaciones prácticas y justificar la selección de cada estructura.

**Solución desarrollada:**

Se plantea una solución basada en las estructuras pila y cola. Se consideran sus características, operaciones principales y aplicaciones en situaciones reales. Asimismo, se desarrollan programas en Java para demostrar su funcionamiento y se realiza una comparación para identificar sus diferencias y ventajas.

### Actividad 1. Pila LIFO

Se desarrolla el funcionamiento de una estructura LIFO (Last In, First Out), donde el último elemento que ingresa es el primero en salir. Se considera su representación gráfica y las operaciones de apilar, desapilar, visualizar el tope y verificar si la pila está vacía.

**Documentación complementaria:** [Ver Actividad 1](documentacion/actividad%201.md)

### Actividad 2. Cola FIFO

Se desarrolla el funcionamiento de una estructura FIFO (First In, First Out), donde el primer elemento que ingresa es el primero en salir. Se considera su representación gráfica y las operaciones de encolar, desencolar, visualizar el frente y verificar si la cola está vacía.

**Documentación complementaria:** [Ver Actividad 2](documentacion/actividad%202.md)

### Actividad 3. Selección de estructuras para situaciones reales

Se analizan cuatro situaciones para determinar si corresponde utilizar una pila o una cola:

- Registro de acciones recientes para revertir cambios.
- Atención de solicitudes en orden de llegada.
- Procesamiento donde el último elemento ingresado debe atenderse primero.
- Flujo de espera de trámites pendientes.

Se justifica técnicamente la elección de cada estructura según el orden de procesamiento requerido. También se incluyen demostraciones en Java para las situaciones desarrolladas.

**Documentación complementaria:** [Ver Actividad 3](documentacion/actividad%203.md)

### Actividad 4. Comparación y argumentación

Se realiza una comparación académica entre las estructuras pila y cola, considerando sus principios de funcionamiento, operaciones principales, forma de acceso y ventajas en diferentes contextos de aplicación. Se complementa con una demostración en Java para observar las diferencias entre LIFO y FIFO.

**Documentación complementaria:** [Ver Actividad 4](documentacion/actividad%204.md)

## 3. Cómo ejecutar o revisar

### Requisitos previos

- Apache NetBeans.
- JDK compatible con la configuración del proyecto.
- Git, si se desea clonar el repositorio desde la terminal.

### Pasos para revisar el proyecto

1. **Clonar el repositorio:** ejecutar el siguiente comando en CMD desde la carpeta donde se desea guardar el proyecto.

   ```bash
   git clone https://github.com/aldair456785/PA3-Estructuras-de-Datos.git
   ```

2. **Abrir el proyecto:** iniciar Apache NetBeans, seleccionar `File > Open Project` y buscar la carpeta del repositorio.

3. **Seleccionar la actividad:** abrir el proyecto Java correspondiente dentro de la carpeta de cada actividad.

4. **Revisar el código:** comprobar los archivos Java y la documentación complementaria.

5. **Ejecutar las actividades:** abrir la clase principal correspondiente y ejecutarla para comprobar los resultados en la consola.

**Nota:** La carpeta principal del repositorio contiene las actividades organizadas por separado. Los proyectos Java deben abrirse desde sus respectivas carpetas.

## 4. Evidencias

En esta sección se presentan las capturas de pantalla que evidencian el desarrollo, la ejecución y los resultados de las actividades.

- [Actividad 1](evidencias/actividad1.png)
- [Actividad 2](evidencias/actividad2.png)
- [Actividad 3 – Situaciones 1 y 2](evidencias/actividad3_parte1.png)
- [Actividad 3 – Situaciones 3 y 4](evidencias/actividad3_parte2.png)
- [Actividad 4](evidencias/actividad4.png)

Las evidencias se organizarán en la carpeta `evidencias` del repositorio.

## 5. Matriz de participación

| **Integrante** | **Desarrollo** | **Pruebas** | **Documentación** | **Exposición** | **Evidencia de participación** |
|---|---|---|---|---|---|
| Geraldine Ana Paola Gómez Atanacio | Alta | Alta | Alta | Pendiente | Desarrollo de las situaciones 1 y 2 de la Actividad 3, implementación en Java y aporte al repositorio. |
| Luisanni Andreina Oviedo Woscichowski | Alta | Alta | Alta | Pendiente | Desarrollo de la comparación entre pila y cola y demostración en Java. |
| Milthom Wilbert Flórez Somcco | Pendiente | Pendiente | Pendiente | Pendiente | Responsable del desarrollo de la Actividad 1: Pila LIFO. |
| Carlos César Jiménez Jáuregui | Pendiente | Pendiente | Pendiente | Pendiente | Responsable del desarrollo de las situaciones 3 y 4 de la Actividad 3. |
| Luis Cristofer Siñani Yauri | Pendiente | Pendiente | Pendiente | Pendiente | Responsable del desarrollo de la Actividad 2: Cola FIFO. |

## 6. Video de exposición

**Video de YouTube:** [ENLACE DEL VIDEO](PENDIENTE_DE_ENLACE)

**Contenido del video:**

- Presentación del equipo (todos con cámaras prendidas).
- Explicación de cómo se resolvió cada actividad.
- Demostración de ejecución de los programas.
- Justificación de las estructuras de datos seleccionadas.
- Conclusiones del trabajo.

## 7. Conclusiones

**Conclusión 1:** Las estructuras de datos pila y cola permiten organizar elementos de acuerdo con diferentes criterios de procesamiento. La pila utiliza el principio LIFO, mientras que la cola utiliza el principio FIFO.

**Conclusión 2:** La estructura pila resulta adecuada para situaciones donde se necesita recuperar primero el último elemento ingresado, como en el registro de acciones que deben revertirse.

**Conclusión 3:** La estructura cola permite atender solicitudes respetando el orden de llegada, lo que facilita la organización de procesos donde se requiere una atención secuencial.

**Conclusión 4:** La comparación entre ambas estructuras permite reconocer sus diferencias en cuanto al funcionamiento, las operaciones principales y la forma de acceder a los elementos.

**Conclusión 5:** La aplicación de pilas y colas mediante algoritmos y programas en Java permite desarrollar soluciones acordes con las necesidades de cada situación y fortalecer los conocimientos sobre estructuras de datos.

---

**Última actualización:** 03/11/2026
## Repositorio
**PA3 – Estructuras de Datos**
