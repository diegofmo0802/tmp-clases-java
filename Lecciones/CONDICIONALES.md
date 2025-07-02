# Condicionales y operadores
Las condicionales son estructuras de control que permiten dirigir el flujo del código en base a una condición.
**por ejemplo**: Si es de dia `ocurrirá cierta acción` de lo contrario `ocurrirá algo distinto`

## Sintaxis
La sintaxis de las condicionales es la siguiente:
```java
if (<condición>) {
    // Lo que sucederá en caso de que se cumpla
} else {
    // Lo que sucederá en caso contrario
}
```
También tenemos la sentencia `else if` que nos sirve para encadenar condiciones
```java
if (<condición>) {
    // Lo que sucederá en caso de que se cumpla
} else if (condición que debe cumplirse si la primera no paso) {
    // Lo que sucederá en caso de que se cumpla
} else if (condición que debe cumplirse si la primera y segunda no pasaron) {
    // Lo que sucederá en caso de que se cumpla
} else {
    // Lo que sucederá en caso de que ninguna se cumpla
}
```

## Operadores condicionales
Los operadores condicionales comparan dos campos y nos dice si la comparación es cierta (true) o falsa (false)

|Operador|Descripción|
|:-------|:----------|
|**==**|Es un numero enteros|
|**>**|Es un numero con decimales|
|**<**|Es un carácter único ("A")|
|**>=**|Es un valor 0 o 1 (false o true)|
|**<=**|Es una cadena de texto ("Hola mundo")|

Ejemplo:
```java
public esMayorDeEdad(int edad) {
    if (edad >= 18) {
          System.out.println("Es mayor de edad");
    } else {
          System.out.println("Es menor de edad");
    }
}
```

y pueden encadenarse varias condiciones usando `and` u `or`

|Union|Sintaxis|Descripción|
|:---|:-------:|:----------|
|**And**|`A && B`|Es un numero enteros|
|**Or**|`A \|\| B`|Es un numero con decimales|
|**Negación**|`!A`|Niega la condición|

> [!NOTE]
> A y B se refiere a 2 condiciones diferentes

Ejemplo:
```java
public prestaServicioMilitar(int edad, boolean hijoUnico) {
    if (edad >= 18 && !hijoUnico) {
          System.out.println("Presta servicio militar");
    } else {
          System.out.println("No presta servicio");
    }
}
```