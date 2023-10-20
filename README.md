# Proyecto - Examen II unidad tipo A

## Descripción del Problema

Este ejercicio crea un objeto Accion y muestra su porcentaje de cambio de precio de un día a otro

## Ejecución

Tu programa debería ejecutarse de la siguiente manera:

```
Accion
======

Proporcione el simbolo de la accion:L3R
Proporcione el nombre de la accion:Refresco Rojo y Refrescante
Proporcione el precio al cierre previo de la accion:200
Proporcione el precio actual de la accion:180

Accion: Simbolo: L3R, Nombre: Refresco Rojo y Refrescante, Precio Cierre: $200.00, Precio Actual: $180.00
Porcentaje de cambio: -10.00%
```

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Accion
---
classDiagram
      class Accion
      Accion: -simbolo
      Accion: -nombre
      Accion: -preciocierrePrevio
      Accion: -precioActual
      Accion: +getPorcentajeCambio()
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
