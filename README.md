# Trabajo de Repaso II – POO

Ejercicios de Programación Orientada a Objetos en Java.

## Ejercicio 1 – Jugador
Clase `Jugador` con atributos privados `nombre`, `nivel` y `puntos`.
- Constructor que recibe el nombre y establece `nivel = 1` y `puntos = 0`.
- Getters para los tres atributos (no hay setters, por lo que `Main` no puede modificar `puntos` ni `nivel` directamente).
- `ganarPuntos(int cantidad)`: solo acepta cantidades positivas.
- `subirNivel()`: aumenta el nivel en una unidad.

## Ejercicio 2 – Persona, Docente y Preceptor
- `Persona`: atributos privados `nombre` y `edad`, constructor, getters y setters. La edad no puede ser negativa.
- `Docente` (hereda de `Persona`): agrega `materia`.
- `Preceptor` (hereda de `Persona`): agrega `cursoAsignado`.
- Cada subclase tiene su constructor y `mostrarInformacion()`, que muestra los atributos heredados y los propios.

## Cómo ejecutar
```bash
cd src
javac *.java
java Main
```
