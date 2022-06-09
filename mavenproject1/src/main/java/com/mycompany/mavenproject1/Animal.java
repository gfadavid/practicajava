/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

// POLIFORMISMO
public class Animal {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}


class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

/*
Polimorfismo de Java

Polimorfismo significa "muchas formas", y ocurre cuando tenemos muchas clases que están relacionadas entre sí por herencia.
Como especificamos en el capítulo anterior; La herencia nos permite heredar atributos y métodos de otra clase. El polimorfismo
usa esos métodos para realizar diferentes tareas. Esto nos permite realizar una misma acción de diferentes maneras.

Por ejemplo, piense en una superclase llamada Animal que tiene un método llamado animalSound(). Las subclases de animales
pueden ser cerdos, gatos, perros, pájaros, y también tienen su propia implementación de un sonido Animal (el cerdo gruñe
y el gato maúlla, etc.):

Ahora podemos crear objetos Pig y Dog y llamar al método animalSound() en ambos

¿Por qué y cuándo usar "herencia" y "polimorfismo"?
- Es útil para la reutilización de código: reutiliza atributos y métodos de una clase existente cuando creas una nueva clase.
 */
