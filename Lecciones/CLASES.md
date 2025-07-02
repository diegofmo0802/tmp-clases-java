# GLOSARIO

- **<MA>**: Modificadores de acceso

# PALABRAS CLAVE

## Modificadores de acceso

- **public**: Hace que los atributos o métodos sean visibles desde cualquier parte del código.
- **private**: Hace que los atributos o métodos sean visibles solo dentro de la clase.
- **protected**: Hace que los atributos o métodos sean visibles dentro de la clase y en las clases que heredan de ella.

# DEFINICIÓN DE ATRIBUTOS

**Sintaxis:**  
`<MA> <Tipo> <Nombre> (= <valor por defecto>);`

# ¿QUÉ ES EL CONSTRUCTOR?

El constructor es un método especial que permite inicializar los valores de los atributos en una clase.

**Sintaxis:**  
`<MA> <NombreDeLaClase>(<parámetros>) { <cuerpo del constructor> }`

# DEFINICIÓN DE MÉTODOS

Los métodos son funciones que permiten realizar acciones con los atributos de la clase.

**Sintaxis:**  
`<MA> <TipoDeRetorno> <NombreDelMétodo>(<parámetros>) { <cuerpo del método> }`

# GETTERS Y SETTERS

Los getters y setters son métodos que permiten acceder y modificar los valores de los atributos de una clase.  
Se suelen usar cuando los atributos son privados y se quiere controlar el acceso a ellos.

La sintaxis es igual a la de los métodos, pero suelen ser públicos.

- **Sintaxis getter:**  
  `<MA> <TipoDelAtributo> get<NombreDelAtributo>() { return this.<NombreDelAtributo>; }`
- **Sintaxis setter:**  
  `<MA> void set<NombreDelAtributo>(<TipoDelAtributo> <NombreDelAtributo>) { this.<NombreDelAtributo> = <NombreDelAtributo>; }`

**Ejemplo para el atributo `nombre`:**
- `public String getNombre() { return this.nombre; }`
- `public void setNombre(String nombre) { this.nombre = nombre; }`

# CAMEL CASE

El camel case es una convención de nomenclatura donde cada palabra inicia con mayúscula, excepto la primera en el caso de atributos y métodos.

- Para atributos: la primera palabra inicia con minúscula.  
  Ejemplo: `cantidadDePatas`
- Para métodos y clases: la primera palabra inicia con mayúscula.  
  Ejemplo: `ClasesJava`, `getNombre()`