/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.*;
import java.util.function.Consumer;

interface StringFunction {

    String run(String str);
}

public class lambda {

    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(1);
//        numbers.forEach((n) -> {
//            System.out.println(n);
//        });

//        Las expresiones lambda se pueden almacenar en variables si el tipo de variable es una interfaz que tiene un solo método.
//        La expresión lambda debe tener la misma cantidad de parámetros y el mismo tipo de retorno que ese método.
//        Java tiene muchos de estos tipos de interfaces integrados, como la interfaz de consumidor (que se encuentra en el
//        paquete java.util) utilizada por las listas.
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(1);
//        Consumer<Integer> method = (n) -> {
//            System.out.println(n);
//        };

    }

}

/*
Expresiones Java Lambda

Una expresión lambda es un bloque corto de código que toma parámetros y devuelve un valor. Las expresiones lambda son
similares a los métodos, pero no necesitan un nombre y se pueden implementar directamente en el cuerpo de un método.

La expresión lambda más simple contiene un solo parámetro y una expresión:
parámetro -> expresión

Para usar más de un parámetro, envuélvalos entre paréntesis:
(parámetro1, parámetro2) -> expresión

Las expresiones son limitadas. Deben devolver inmediatamente un valor y no pueden contener variables, asignaciones o
declaraciones como if o for. Para realizar operaciones más complejas, se puede usar un bloque de código con llaves.
Si la expresión lambda necesita devolver un valor, entonces el bloque de código debe tener una declaración de devolución.

(parameter1, parameter2) -> { code block }
 */
