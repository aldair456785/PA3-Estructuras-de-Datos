# Actividad 2. Cola FIFO (First In, First Out)

**Responsable:** Luis Cristofer Siñani Yauri  
**Curso:** Algoritmo y Estructura de Datos Basados en Inteligencia Artificial  
**Sección / Grupo:** Equipo 6  

---

## 1. Caracterización de una Estructura FIFO

Una estructura de datos **FIFO** (*First In, First Out* / *Primero en entrar, primero en salir*) es un tipo de datos abstracto lineal donde el primer elemento que ingresa a la cola es el primer elemento en ser atendido y retirado.

### Características Principales:
- **Principio de Funcionamiento:** Los elementos son procesados estrictamente en el mismo orden secuencial en el que fueron registrados.
- **Puntos de Acceso Separados:**
  - **Frente (Front / Head):** Extremo por el cual se extraen o atienden los elementos (operación de desencolar).
  - **Final (Rear / Tail):** Extremo por el cual se insertan los nuevos elementos (operación de encolar).
- **Acceso Restringido:** No se permite el acceso directo a elementos intermedios sin haber desencolado previamente los elementos anteriores.
- **Complejidad Temporal:** Las operaciones básicas de inserción y extracción tienen una complejidad de $O(1)$.

---

## 2. Representación Gráfica del Caso Propuesto

En el contexto del caso propuesto (atención de solicitudes en orden de llegada en una unidad de servicios académicos), la representación lógica de la cola se visualiza de la siguiente manera:

```text
               [ NUEVAS SOLICITUDES ]
                         │
                         ▼ (Encolar / Enqueue)
                   +-----------+
                   |  FINAL    |
                   |  (Rear)   |
                   +-----------+
                         │
      +──────────────────┼──────────────────+
      │                  │                  │
      ▼                  ▼                  ▼
┌───────────┐      ┌───────────┐      ┌───────────┐
│ Solicitud │      │ Solicitud │      │ Solicitud │
│   #003    │ ───► │   #002    │ ───► │   #001    │ ───► [ ATENCIÓN DE SOLICITUD ]
└───────────┘      └───────────┘      └───────────┘        (Desencolar / Dequeue)
                                            │
                                            ▼
                                     +───────────+
                                     |  FRENTE   |
                                     |  (Front)  |
                                     +───────────+
```

---

## 3. Diseño de Algoritmos (Pseudocódigo)

A continuación se presentan los algoritmos para las cuatro operaciones fundamentales sobre la cola:

### 3.1. Encolar (Enqueue)
Agrega un nuevo elemento al final de la cola.

```pseudocode
Procedimiento Encolar(cola, elemento, capacidad_maxima)
    Si (cola.final == capacidad_maxima - 1) Entonces
        Escribir "Error: Desbordamiento de Cola (Queue Overflow)"
    Sino
        Si (cola.frente == -1) Entonces
            cola.frente = 0
        Fin Si
        cola.final = cola.final + 1
        cola.elementos[cola.final] = elemento
        Escribir "Solicitud registrada con éxito en el final de la cola."
    Fin Si
Fin Procedimiento
```

### 3.2. Desencolar (Dequeue)
Retira y retorna el elemento que se encuentra al frente de la cola.

```pseudocode
Funcion Desencolar(cola)
    Si (cola.frente == -1 O cola.frente > cola.final) Entonces
        Escribir "Error: Subdesbordamiento de Cola (Queue Underflow)"
        Retornar Nulo
    Sino
        elemento_atendido = cola.elementos[cola.frente]
        cola.frente = cola.frente + 1
        
        // Reiniciar punteros si la cola queda totalmente vacía
        Si (cola.frente > cola.final) Entonces
            cola.frente = -1
            cola.final = -1
        Fin Si
        
        Retornar elemento_atendido
    Fin Si
Fin Funcion
```

### 3.3. Visualizar el Frente (Peek)
Muestra la primera solicitud pendiente sin removerla de la estructura.

```pseudocode
Funcion VisualizarFrente(cola)
    Si (cola.frente == -1 O cola.frente > cola.final) Entonces
        Escribir "La cola está vacía. No hay solicitudes pendientes."
        Retornar Nulo
    Sino
        Retornar cola.elementos[cola.frente]
    Fin Si
Fin Funcion
```

### 3.4. Verificar si la Cola está Vacía (IsEmpty)
Determina si la cola carece de elementos guardados.

```pseudocode
Funcion EstaVacia(cola)
    Si (cola.frente == -1 O cola.frente > cola.final) Entonces
        Retornar Verdadero
    Sino
        Retornar Falso
    Fin Si
Fin Funcion
```

---

## 4. Aplicación Concreta en el Caso Propuesto

### Caso de Aplicación: **Sistema de Atención de Trámites y Solicitudes Académicas en Línea**

- **Justificación Técnica:**  
  En la unidad de servicios académicos, los alumnos registran solicitudes como expedición de certificados, rectificación de matrícula o reclamos de notas. Para mantener la transparencia y equidad institucional, el sistema debe garantizar que el primer estudiante en enviar su solicitud sea el primero en ser atendido (*First Come, First Served*).

- **Por qué FIFO es la estructura más adecuada:**
  1. **Justicia Temporal:** Evita el favorecimiento o la postergación arbitraria de solicitudes antiguas.
  2. **Predictibilidad:** Permite calcular de manera precisa los tiempos de espera aproximados en función de la posición actual del trámite en la cola.
  3. **Eficiencia Operativa:** Permite procesar de manera ordenada flujos continuos e intensivos de solicitudes sin pérdida de orden de llegada.
