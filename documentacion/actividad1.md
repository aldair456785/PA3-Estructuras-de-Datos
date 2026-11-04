# ACTIVIDAD 1: PILA LIFO



## 1. Descripción de la estructura Pila LIFO

Una pila LIFO (Last In, First Out) es una estructura de datos que funciona bajo el principio de último en entrar, primero en salir.

Esto significa que el último elemento agregado a la pila será el primero en retirarse.

Un ejemplo de la vida cotidiana es una pila de platos: el último plato colocado encima es el primero que se retira.

## 2. Objetivo

Comprender e implementar la estructura de datos Pila LIFO mediante el lenguaje Java, utilizando sus operaciones principales para gestionar solicitudes académicas.

## 3. Características principales

- Los elementos se agregan y retiran desde la parte superior.
- Sigue el principio LIFO.
- El último elemento ingresado es el primero en salir.
- Permite organizar información de manera ordenada.

## 4. Operaciones principales

| Operación | Descripción |
|---|---|
| Push | Agrega un elemento al tope de la pila. |
| Pop | Retira el elemento que está en el tope. |
| Peek | Muestra el elemento que está en el tope sin retirarlo. |
| isEmpty | Comprueba si la pila está vacía. |

## 5. Representación gráfica

Ejemplo de una pila con tres solicitudes:

```text
          TOPE
      +-------------+
      | Solicitud 003 | ← Último en entrar
      +-------------+
      | Solicitud 002 |
      +-------------+
      | Solicitud 001 | ← Primero en entrar
      +-------------+
          BASE
```

Cuando se realiza la operación Pop, primero se retira la Solicitud 003, después la Solicitud 002 y finalmente la Solicitud 001.

## 6. Pseudocódigo de las operaciones

### Apilar (Push)

```text
Algoritmo Apilar
    Escribir "Ingrese una solicitud"
    Leer solicitud
    Insertar solicitud en el tope de la pila
    Escribir "Solicitud agregada correctamente"
FinAlgoritmo
```

### Desapilar (Pop)

```text
Algoritmo Desapilar
    Si Pila no esta vacia Entonces
        Retirar elemento del tope
        Escribir "Solicitud retirada correctamente"
    SiNo
        Escribir "La pila esta vacia"
    FinSi
FinAlgoritmo
```

### Visualizar el tope (Peek)

```text
Algoritmo VisualizarTope
    Si Pila no esta vacia Entonces
        Escribir elemento del tope
    SiNo
        Escribir "La pila esta vacia"
    FinSi
FinAlgoritmo
```

## 7. Implementación en Java

La estructura se implementa utilizando la clase Stack de Java. El programa permite agregar, retirar y visualizar solicitudes, además de comprobar si la pila está vacía y mostrar su representación gráfica.

Archivo del programa: `PilaLIFO.java`.

## 8. Conclusión

La estructura de datos Pila LIFO permite gestionar elementos siguiendo el orden de último en entrar y primero en salir. Mediante esta actividad se comprendió el funcionamiento de las operaciones Push, Pop, Peek e isEmpty y su aplicación en la gestión de solicitudes académicas.

## 9. Evidencia

Se presenta la captura de pantalla del programa Java ejecutándose y demostrando las operaciones de la pila.

**Archivo:** `evidencias/actividad1.png`
