# Ejercicio 1: Clase Pelicula

## 📌 Descripción

Este ejercicio consiste en desarrollar una clase llamada `Pelicula` utilizando los conceptos de **Programación Orientada a Objetos (POO)** en Java.

La clase representa una película y almacena su título, director y duración en minutos. Además, incorpora validaciones para evitar que se creen objetos con datos incorrectos, utilizando excepciones `IllegalArgumentException`.

## ⚙️ Validaciones y excepciones

Se establecen las siguientes condiciones:

- El título no puede ser `null` ni estar vacío.
- El director no puede ser `null` ni estar vacío.
- La duración debe ser un número mayor que `0`.

Cuando se introduce un valor que no cumple estas condiciones, se lanza una excepción `IllegalArgumentException` con un mensaje que explica claramente el error.

El constructor utiliza los setters para evitar repetir las validaciones y garantizar que una película no se cree con atributos inválidos.

## ✅ Conclusión

Con este ejercicio se refuerza el uso de clases y objetos en Java, aprendiendo a controlar el acceso y la modificación de los atributos mediante métodos públicos.

Además, se aprende a centralizar las validaciones utilizando los setters dentro del constructor y a gestionar los errores mediante excepciones `IllegalArgumentException`.

De esta forma, se garantiza que los objetos creados mantengan siempre un estado válido.
