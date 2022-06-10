/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

public class Excepciones {
    
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            //            BÁSICAMENTE ES UNA FORMA DE PODER DESCRIBIR UN ERROR Y EVITAR EL MENSAJE GENÉRICO DEL INTERPRETE.
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {

//        try {
//          int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
//        }
//        catch (Exception e) {
//          System.out.println("Something went wrong.");
//        }

//        Finalmente (Finally)
//        La declaración finalmente le permite ejecutar código, después de intentar... atrapar
//        , independientemente del resultado:
//        try {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
//        } catch (Exception e) {
//            System.out.println("Something went wrong.");
//        } finally {
//            System.out.println("The 'try catch' is finished.");
//        }

//        La palabra clave de lanzamiento (throw)
//          La instrucción throw le permite crear un error personalizado.La instrucción throw se usa junto con un
//          tipo de excepción. Hay muchos tipos de excepciones disponibles en Java: ArithmeticException,
//          FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.

            checkAge(15); // Set age to 15 (which is below 18...)

    }

}

//Excepciones de Java - Try... Catch
//
//Excepciones de Java
//
//Al ejecutar código Java, pueden ocurrir diferentes errores: errores de codificación por parte del programador,
//errores debido a una entrada incorrecta u otros imprevistos.
//Cuando ocurre un error, Java normalmente se detendrá y generará un mensaje de error. El término técnico para esto es:
//Java lanzará una excepción (arrojará un error).
//Java prueba y captura
//La declaración de prueba le permite definir un bloque de código para probar errores mientras se ejecuta.
//La instrucción catch le permite definir un bloque de código que se ejecutará si ocurre un error en el bloque try.
//Las palabras clave de try y catch vienen en pares:
//try {
//  //  Block of code to try
//}
//catch(Exception e) {
//  //  Block of code to handle errors
//}
