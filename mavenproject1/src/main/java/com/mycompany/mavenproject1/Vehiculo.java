/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

// SUPERCLASE
public abstract class Vehiculo {
//    NO EXISTE LÍMITE PARA CREAR LA CANTIDAD DE ATRIBUTOS Y/O CAMPOS QUE CONSIDERE NECESARIA

//    ATRIBUTOS
//    String nombre = "Ángel David";
//    final String color = "Moreno";
//    double altura = 1.75;
//    int edad = 31;

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
    
    ¿Por qué y cuándo usar clases y métodos abstractos?

    Para lograr la seguridad, oculte ciertos detalles y solo muestre los detalles importantes de un objeto.
     */
    
    // HERENCIA
    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
    
    /*
    ¿Notaste el modificador protegido en Vehículo?

    Establecemos el atributo de marca en Vehículo en un modificador de acceso protegido. Si se configuró como privado,
    la clase Car no podría acceder a él.
    ¿Por qué y cuándo usar "herencia"?
    - Es útil para la reutilización de código: reutiliza atributos y métodos de una clase existente cuando creas una nueva clase.
    */
}
