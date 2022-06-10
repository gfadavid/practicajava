/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author desarrollo
 */
public class arrayList {
    
}

/*

La clase ArrayList es una matriz de tamaño variable, que se puede encontrar en el paquete java.util.

La diferencia entre una matriz integrada y una ArrayList en Java es que el tamaño de una matriz no se puede modificar (si desea agregar o
eliminar elementos de una matriz, debe crear uno nuevo). Mientras que los elementos se pueden agregar y eliminar de un ArrayList cuando lo desee.
La sintaxis también es ligeramente diferente:

Los elementos de una ArrayList son en realidad objetos. En los ejemplos anteriores, creamos elementos (objetos) de tipo "String".
Recuerda que un String en Java es un objeto (no un tipo primitivo). Para usar otros tipos, como int, debe especificar una clase contenedora
equivalente: Integer. Para otros tipos primitivos, use: Boolean para boolean, Character para char, Double para double, etc.:

*/

/*
ArrayList frente a LinkedList

La clase LinkedList es una colección que puede contener muchos objetos del mismo tipo, al igual que ArrayList.
La clase LinkedList tiene todos los mismos métodos que la clase ArrayList porque ambas implementan la interfaz List.
Esto significa que puede agregar elementos, cambiar elementos, eliminar elementos y borrar la lista de la misma manera.

Sin embargo, aunque la clase ArrayList y la clase LinkedList se pueden usar de la misma manera, se construyen de manera muy diferente.

Cómo funciona ArrayList
La clase ArrayList tiene una matriz regular en su interior. Cuando se agrega un elemento, se coloca en la matriz. Si la matriz no es lo suficientemente grande, se crea una nueva matriz más grande para reemplazar la anterior y se elimina la anterior.
Cómo funciona LinkedList
LinkedList almacena sus elementos en "contenedores". La lista tiene un enlace al primer contenedor y cada contenedor tiene un enlace al siguiente contenedor de la lista. Para agregar un elemento a la lista, el elemento se coloca en un nuevo contenedor y ese contenedor se vincula a uno de los otros contenedores de la lista.

Cuándo usar
Utilice una ArrayList para almacenar y acceder a datos y LinkedList para manipular datos.

Métodos de lista enlazada
Para muchos casos, ArrayList es más eficiente ya que es común necesitar acceso a elementos aleatorios en la lista, pero LinkedList
proporciona varios métodos para realizar ciertas operaciones de manera más eficiente:

Method 	Description (LinkedList)
addFirst() 	Adds an item to the beginning of the list. 	
addLast() 	Add an item to the end of the list 	
removeFirst() 	Remove an item from the beginning of the list. 	
removeLast() 	Remove an item from the end of the list 	
getFirst() 	Get the item at the beginning of the list 	
getLast() 	Get the item at the end of the list

Mapa hash de Java (HashMap)

En el capítulo ArrayList, aprendiste que los Arrays almacenan elementos como una colección ordenada y tienes que acceder
a ellos con un número de índice (tipo int). Sin embargo, un HashMap almacena elementos en pares de "clave/valor", y
puede acceder a ellos mediante un índice de otro tipo (por ejemplo, una cadena).

Un objeto se utiliza como clave (índice) para otro objeto (valor). Puede almacenar diferentes tipos: claves de
cadena y valores enteros, o del mismo tipo, como: claves de cadena y valores de cadena:

Java HashSet

n HashSet es una colección de elementos donde cada elemento es único y se encuentra en el paquete java.util:

Iterador de Java

Un iterador es un objeto que se puede usar para recorrer colecciones, como ArrayList y HashSet. Se llama "iterador" porque "iterar" es el término técnico para bucle.

Para usar un iterador, debe importarlo desde el paquete java.util.
*/