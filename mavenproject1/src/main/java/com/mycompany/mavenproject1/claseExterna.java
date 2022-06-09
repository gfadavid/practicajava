/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

// CLASES INTERNAS
public class claseExterna {

    int x = 10;

//    public class claseInterna {
//
//        int y = 5;
//    }
//    private class claseInterna {
//
//        int y = 5;
//    }
//    static class claseInterna {
//
//        int y = 5;
//    }
    
    public class claseInterna {
        int metodoInterno() {
            return x;
        }
    }
}

/*
Clases internas de Java

En Java, también es posible anidar clases (una clase dentro de una clase). El propósito de las clases anidadas es agrupar clases que
pertenecen juntas, lo que hace que su código sea más legible y fácil de mantener.
Para acceder a la clase interna, cree un objeto de la clase externa y luego cree un objeto de la clase interna:

Clase interna estática

Una clase interna también puede ser estática, lo que significa que puede acceder a ella sin crear un objeto de la clase externa:

Nota: al igual que los atributos y métodos estáticos, una clase interna estática no tiene acceso a los miembros de la clase externa.

Acceder a la clase exterior desde la clase interior

Una ventaja de las clases internas es que pueden acceder a atributos y métodos de la clase externa
 */
