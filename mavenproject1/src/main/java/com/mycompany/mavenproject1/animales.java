/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1;

public interface animales {

    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

/*
Interfaces
Otra forma de lograr la abstracción en Java es con animales. Una interfaz es una "clase abstracta" completamente que se utiliza 
para agrupar métodos relacionados con cuerpos vacíos:

Para acceder a los métodos de la interfaz, la interfaz debe ser "implementada" (algo así como heredada) por otra clase con la palabra clave "implements"
(en lugar de extends). El cuerpo del método de interfaz lo proporciona la clase "implement"

Notas sobre las interfaces:

     Al igual que las clases abstractas, las interfaces no se pueden usar para crear objetos (en el ejemplo anterior, no es posible crear un objeto "Animal" en MyMainClass)
     Los métodos de interfaz no tienen cuerpo: el cuerpo lo proporciona la clase "implementar"
     En la implementación de una interfaz, debe anular todos sus métodos
     Los métodos de interfaz son por defecto abstractos y públicos.
     Los atributos de la interfaz son públicos, estáticos y finales de forma predeterminada.
     Una interfaz no puede contener un constructor (ya que no se puede usar para crear objetos)

¿Por qué y cuándo usar interfaces?

1) Para lograr la seguridad, oculte ciertos detalles y solo muestre los detalles importantes de un objeto (interfaz).
2) Java no admite "herencia múltiple" (una clase solo puede heredar de una superclase). Sin embargo, se puede lograr con interfaces, porque la clase
puede implementar múltiples interfaces.

Nota: Para implementar múltiples interfaces, sepárelas con una coma (vea el ejemplo a continuación).

NOTA: LA DIFERENCIA ENTRE UNA CLASE ABSTRACTA Y UNA INTERFACE ES QUE NO, LA INTERFAZ TODOS LOS MÉTODOS QUE ALMACENEN DEBE SER ABSTRACTOS
 */
