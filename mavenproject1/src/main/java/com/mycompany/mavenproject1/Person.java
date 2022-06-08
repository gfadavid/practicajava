/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

// PARA EJEMPLOS DE ENCAPSULACIÓN
public class Person {
    
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
  
}

/*
Encapsulación

    El significado de Encapsulación es asegurarse de que los datos "sensibles" estén ocultos para los usuarios. Para lograr esto, debes

     declarar variables/atributos de clase como privados
     proporcionar métodos públicos get y set para acceder y actualizar el valor de una variable privada

Obtener y establecer

En el capítulo anterior aprendió que solo se puede acceder a las variables privadas dentro de la misma clase (una clase 
externa no tiene acceso a ellas). Sin embargo, es posible acceder a ellos si proporcionamos métodos públicos de obtención
y configuración.
El método get devuelve el valor de la variable y el método set establece el valor. 
La sintaxis de ambos es que comienzan con get o set, seguido del nombre de la variable, con la primera letra en mayúscula:

El método get devuelve el valor del nombre de la variable. 
El método set toma un parámetro (nuevoNombre) y lo asigna a la variable de nombre. La palabra clave this se utiliza para
referirse al objeto actual.
Sin embargo, como la variable de nombre se declara privada, no podemos acceder a ella desde fuera de esta clase:

¿Por qué encapsulación?

    Mejor control de los atributos y métodos de clase.
    Los atributos de clase pueden ser de solo lectura (si solo usa el método get) o de solo escritura (si solo usa el método set)
    Flexible: el programador puede cambiar una parte del código sin afectar otras partes
    Mayor seguridad de los datos
*/