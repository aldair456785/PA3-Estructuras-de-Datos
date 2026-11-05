# ACTIVIDAD 1: PILA LIFO

## 1. Descripción

Una pila es una estructura de datos que trabaja bajo el principio **LIFO (Last In, First Out)**, que significa que el último elemento en ingresar es el primero en salir.

En esta actividad se utiliza una pila para representar la gestión de solicitudes académicas, permitiendo agregar nuevas solicitudes y retirar primero la que se encuentra en el tope.

## 2. Objetivo

Comprender el funcionamiento de una pila LIFO mediante sus operaciones principales y desarrollar un programa en Java que permita registrar, consultar y retirar solicitudes, comprobando que el último elemento ingresado es el primero en salir.

## 3. Características de la pila LIFO

- **Último en entrar, primero en salir:** el elemento más reciente es el primero que se retira.
- **Tope:** es la posición donde se agregan y retiran los elementos.
- **Acceso:** las operaciones principales se realizan desde el tope.
- **Orden:** los elementos se retiran en orden inverso al que fueron ingresados.

## 4. Operaciones principales

| Operación | Descripción |
|---|---|
| Push | Agrega un nuevo elemento en el tope de la pila. |
| Pop | Retira el elemento que se encuentra en el tope. |
| Peek | Permite consultar el elemento del tope sin retirarlo. |
| isEmpty | Verifica si la pila está vacía. |

## 5. Representación gráfica

La pila se representa con tres solicitudes. La solicitud `#003` se encuentra en el tope porque fue la última en ingresar, por lo tanto, será la primera en salir.

```text
          TOPE
       ┌──────────────┐
       │ Solicitud #003│  ← Último en entrar
       ├──────────────┤
       │ Solicitud #002│
       ├──────────────┤
       │ Solicitud #001│  ← Primero en entrar
       └──────────────┘
```

**Principio LIFO:** el último elemento ingresado es el primero en retirarse.

## 6. Pseudocódigo

### 6.1. Apilar (Push)

```text
Apilar(Pila, Elemento):
    Agregar Elemento en el tope de la Pila
```

### 6.2. Desapilar (Pop)

```text
Desapilar(Pila):
    Si la Pila está vacía:
        Mostrar "La pila está vacía"
    Si no:
        Retirar y devolver el elemento del tope
```

### 6.3. Visualizar el tope (Peek)

```text
VisualizarTope(Pila):
    Si la Pila está vacía:
        Mostrar "La pila está vacía"
    Si no:
        Mostrar el elemento que está en el tope
```

### 6.4. Verificar si está vacía (isEmpty)

```text
VerificarPila(Pila):
    Si la Pila está vacía:
        Mostrar "La pila está vacía"
    Si no:
        Mostrar "La pila contiene elementos"
```

## 7. Implementación en Java

Para desarrollar esta actividad se utilizó el lenguaje Java y la clase `Stack`, que permite trabajar con una estructura de datos tipo pila.

El programa se encuentra en el archivo `PilaLIFO.java` y cuenta con un menú interactivo que permite realizar las siguientes operaciones:

1. Apilar una nueva solicitud.
2. Desapilar una solicitud.
3. Visualizar el elemento del tope.
4. Verificar si la pila está vacía.
5. Mostrar las solicitudes pendientes.
6. Mostrar la representación gráfica de la pila.
7. Salir del programa.

Al iniciar, el programa registra tres solicitudes: `#001`, `#002` y `#003`. Posteriormente, permite agregar nuevas solicitudes y retirarlas siguiendo el principio LIFO.

La implementación demuestra el funcionamiento de una pila mediante solicitudes académicas de ejemplo. Aunque el caso plantea deshacer acciones en orden inverso, el programa no revierte cambios reales de un sistema académico; permite comprobar el principio LIFO mediante las operaciones de apilamiento y desapilamiento.

## 8. Conclusión

Mediante esta actividad se comprendió cómo funciona una pila LIFO y cómo sus operaciones Push, Pop, Peek e isEmpty permiten agregar, retirar y consultar elementos desde el tope. La ejecución del programa en Java permitió comprobar que el último elemento ingresado es el primero en retirarse. Esta estructura resulta útil para gestionar un historial de acciones cuando se necesita deshacer primero el cambio más reciente.

## 9. Evidencia de ejecución

La siguiente imagen muestra la ejecución del programa desarrollado en Java y permite comprobar el funcionamiento de las operaciones de la pila.

**Archivo de evidencia:** `evidencias/actividad1.png`
