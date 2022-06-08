/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author desarrollo
 */
public abstract class Vehiculo {
//    NO EXISTE LÍMITE PARA CREAR LA CANTIDAD DE ATRIBUTOS Y/O CAMPOS QUE CONSIDERE NECESARIA

//    ATRIBUTOS
    String nombre = "Ángel David";
    final String color = "Moreno";
    double altura = 1.75;
    int edad = 31;

    public abstract void encender(); // abstract method

    public abstract void sentarse(); // abstract method

    public abstract void acelerar(); // abstract method

//    static void Bienvenida() {
//        System.out.println("ESTE ES UN SALUDO DE BIENVENIDA de la clase persona");
//    }
    /*
    - La principal diferencia entre una clases convencional y una clase abstracta es que la clase abstracta debe poseer por lo
      menos un método abstracto.
    - La utilidad de un método abstracto es definir qué se debe hacer pero no el cómo se debe hacer.
     */
}
