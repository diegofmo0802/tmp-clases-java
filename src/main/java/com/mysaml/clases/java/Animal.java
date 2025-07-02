package com.mysaml.clases.java;

/*
GLOSARIO
- <MA> Modificadores de acceso

PALABRAS CLAVE
- Modificadores de acceso
- - public hace que los atributos o métodos sean visibles desde cualquier parte del código
- - private hace que los atributos o métodos sean visibles solo dentro de la clase
- - protected hace que los atributos o métodos sean visibles dentro de la clase y en las clases que her

DEFINICIÓN DE ATRIBUTOS
sintaxis: <MA> <Tipo> <Nombre> (= <valor por defecto>);

QUE ES EL CONSTRUCTOR?
El constructor es un método que nos permite inicializar los valores de los atributos en una clase.
sintaxis: <MA> <Nombre de la clase>(<parámetros>) { <cuerpo del constructor> }

DEFINICIÓN DE MÉTODOS
Los métodos son funciones que nos permiten realizar acciones con los atributos de la clase.
sintaxis: <MA> <Tipo de retorno> <Nombre del método>(<parámetros>) { <cuerpo del método> }


GETTERS Y SETTERS
Los getters y setters son métodos que nos permiten
acceder y modificar los valores de los atributos de una clase

Suelen usarse cuando los atributos son privados
y queremos controlar el acceso a ellos.

La sintaxis es exactamente igual a la de los métodos, pero hacemos que sean públicos
sintaxis getter: <MA> <Tipo del atributo> get<Nombre del atributo>() { return this.<Nombre del atributo>; }
sintaxis setter: <MA> void set<Nombre del atributo>(<Tipo del atributo> <Nombre del atributo>) { this.<Nombre del atributo> = <Nombre del atributo>; }
Ejemplos:
- Para el atributo nombre:
- - public String getNombre() { return this.nombre; }
- - public void setNombre(String nombre) { this.nombre = nombre; }

CAMEL CASE
El camel case es una convención de nomenclatura que consiste en escribir los nombres de las variables
y de las clases con cada palabra iniciando con mayúsculas.
- En el caso de los atributos la primer palabra se inicia con minúscula
- En el caso de los métodos y clases la primer palabra se inicia con mayúscula

Ejemplos:
 - cantidadDePatas

*/
public class Animal {
    public String especie;
    private Integer edad;
    public Integer cantidadPatas;
    public Animal(String especie, Integer edad, Integer cantidadPatas) {
        this.especie = especie;
        this.edad = edad;
        this.cantidadPatas = cantidadPatas;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void cazar(Animal presa) {
        System.out.println("El " + this.especie + " esta cazando a un\\a " + presa.especie);
    }
    public void comer(String comida) {
        System.out.println("El " + this.especie + " esta comiendo " + comida);
    }
    public void dormir() {
        System.out.println("El " + this.especie + " esta durmiendo");
    }
    public void sobrevivir(Animal presa) {
        this.cazar(presa);
        this.comer(presa.especie);
        this.dormir();
    }
    @Override
    public String toString() {
        return "+-------------------" +
        "\n| Especie: " + this.especie +
        "\n| Edad: " + this.edad +
        "\n| Cantidad de patas: " + this.cantidadPatas +
        "\n+-------------------";
    }
}
