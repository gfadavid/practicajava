/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
    
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        
//        En este ejemplo
//        , se busca la palabra "w3schools" en una oración.Primero
//        , el patrón se crea utilizando el método Pattern.compile().El primer parámetro indica qué patrón se está
//buscando y el segundo parámetro tiene un indicador que indica que la búsqueda no debe distinguir
//entre mayúsculas y minúsculas.El segundo parámetro es opcional.El método matcher() se usa para buscar el patrón en una
//        cadena.Devuelve un objeto Matcher que contiene información sobre la búsqueda realizada.El método find() devuelve
//                verdadero si se encontró el patrón en la cadena y falso si no se encontró
    }
    
}

/*
¿Qué es una expresión regular?
Una expresión regular es una secuencia de caracteres que forma un patrón de búsqueda. Cuando busca datos en un texto,
puede usar este patrón de búsqueda para describir lo que está buscando.
Una expresión regular puede ser un solo carácter o un patrón más complicado.
Las expresiones regulares se pueden utilizar para realizar todo tipo de operaciones de búsqueda y reemplazo de texto.
Java no tiene una clase de expresión regular incorporada, pero podemos
importar el paquete java.util.regex para trabajar con expresiones regulares. El paquete incluye las siguientes clases:

     Clase de patrón: define un patrón (que se utilizará en una búsqueda)
     Matcher Class: se utiliza para buscar el patrón
     Clase PatternSyntaxException: indica un error de sintaxis en un patrón de expresión regular

banderas

Los indicadores en el método compile() cambian la forma en que se realiza la búsqueda. Éstos son algunos de ellos:

    Pattern.CASE_INSENSITIVE: se ignorarán las mayúsculas y minúsculas al realizar una búsqueda.
    Patrón.LITERAL: los caracteres especiales en el patrón no tendrán ningún significado especial y
    se tratarán como caracteres normales al realizar una búsqueda.
    Pattern.UNICODE_CASE: utilícelo junto con el indicador CASE_INSENSITIVE para ignorar también las mayúsculas
    y minúsculas de las letras fuera del alfabeto inglés.

Patrones de expresiones regulares

El primer parámetro del método Pattern.compile() es el patrón. Describe lo que se busca.

Los corchetes se utilizan para encontrar un rango de caracteres:
Expresión Descripción
[abc] Encuentra un carácter de las opciones entre corchetes
[^abc] Encuentra un carácter que NO esté entre corchetes
[0-9] Encuentra un carácter del rango de 0 a 9
Metacaracteres

Los metacaracteres son caracteres con un significado especial:
Descripción del metacarácter
| Encuentra una coincidencia para cualquiera de los patrones separados por | como en: gato|perro|pez
. Encuentra solo una instancia de cualquier personaje
^ Encuentra una coincidencia como el comienzo de una cadena como en: ^Hola
$ Encuentra una coincidencia al final de la cadena como en: Mundo$
\d Encuentra un dígito
\s Encuentra un carácter de espacio en blanco
\b Encuentra una coincidencia al principio de una palabra como esta: \bPALABRA, o al final de una palabra como esta: PALABRA\b
cuantificadores

Los cuantificadores definen cantidades:
Cuantificador Descripción
n+ Coincide con cualquier cadena que contenga al menos una n
n* Coincide con cualquier cadena que contenga cero o más ocurrencias de n
¿norte? Coincide con cualquier cadena que contenga cero o una ocurrencia de n
n{x} Coincide con cualquier cadena que contenga una secuencia de X n
n{x,y} Coincide con cualquier cadena que contenga una secuencia de X a Y n
n{x,} Coincide con cualquier cadena que contenga una secuencia de al menos X n
*/
