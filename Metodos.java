/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author desarrollo
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
//        UN MÉTODO SIMPLE
//      static void myMethod() {
//        System.out.println("I just got executed!");
//      }
//        DEFINIENDO UN MÉTODO con PARÁMETROS
//      static void myMethod2(String fname) {
//          System.out.println("Hola! " + fname);
//      }
//        MULTIPLES PARÁMETROS
//          static void myMethod3(String fname, int age) {
//            System.out.println(fname + " is " + age);   
//      }
//          DEVOLVIENDO VALORES
//          static int myMethod4(int x) {
//            return 5 + x;
//          }
//            static int myMethod5(int x, int y) {
//                return x + y;
//            }
//            static int myMethod6(int x, int y) {
//                return x + y;
//            }
//            MÉTODO CON IF...ELSE
//            static void checkAge(int age) {
//              if (age < 18) {
//                System.out.println("Access denied - You are not old enough!");
//              } else {
//                System.out.println("Access granted - You are old enough!");
//              }
//            }
//            SOBRECARGA DE MÉTODOS
//                SIN SOBRECARGA
//              static int plusMethodInt(int x, int y) {
//                    return x + y;
//              }
//
//              static double plusMethodDouble(double x, double y) {
//                    return x + y;
//              }
////                CON SOBRECARGA
//              static int plusMethod(int x, int y) {
//                    return x + y;
//              }
//
//              static double plusMethod(double x, double y) {
//                    return x + y;
//              }
    
    public static void main(String args[]) {
        // TODO code application logic here
//        myMethod();

//          myMethod2("Ángel");
//          myMethod3("Ángel", 31);
//          NOTA: CUÁNDO SE LE PASA PARÁMETRO A UN MÉTODO, SE LLE LLAMA ARGUMENTO, EN ESTE CASO "ÁNGEL"
            
//          System.out.println(myMethod4(20));
//          System.out.println(myMethod5(20,40));

//            ALMACENANDO EL RETURN EN UN VARIABLE (SE RECOMIENDA)
//            int z = myMethod6(20,60);
//            System.out.println(z);

//            checkAge(31);

//                SIN SOBRECARGA DE MÉTODOS
//                int myNum1 = plusMethodInt(8, 5);
//                double myNum2 = plusMethodDouble(4.3, 6.26);
//                System.out.println("int: " + myNum1);
//                System.out.println("double: " + myNum2);
//                CON SOBRECARGA DE MÉTODOS
//                int myNum1 = plusMethod(8, 5);
//                double myNum2 = plusMethod(4.3, 6.26);
//                System.out.println("int: " + myNum1);
//                System.out.println("double: " + myNum2);

//            SCOPE JAVA
//                // Code here CANNOT use x
//                int x = 100;
//                // Code here can use x
//                System.out.println(x);
    // Code here CANNOT use x
//        { // This is a block
//
//            // Code here CANNOT use x
//            int x = 100;
//
//            // Code here CAN use x
//            System.out.println(x);
//
//        } // The block ends here

        // Code here CANNOT use x
        
        //                RECURSIÒN DE JAVA
//        int result = sum(10);
//        System.out.println(result);
        
//        OTRO EJEMPLO
        int result = sum(5, 10);
        System.out.println(result);
        
    }
    
//    public static int sum(int k) {
//        int i = 0;
//        
//        if (k > 0) {
//            i++;
//            System.out.println("n=" + i);
//            return k + sum(k - 1); // acà se llama así misma y realiza la resta para cumplir con la condición.
//        } else {
//            return 0;
//        }
//    }
    
      public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
      }
    
    
}


/*
    MÉTODOS
    Puede pasar datos, conocidos como parámetros, a un método. Los métodos se utilizan para realizar ciertas acciones y también se conocen como funciones.

    ¿Por qué usar métodos? Para reutilizar el código: defina el código una vez y utilícelo muchas veces.

    Crear un método

        Un método debe declararse dentro de una clase. Se define con el nombre del método, seguido de paréntesis (). Java proporciona algunos métodos predefinidos, como System.out.println(),
        pero también puede crear sus propios métodos para realizar determinadas acciones:

    Ejemplo dentro de MAIN:
        public class Main {
            static void myMethod() {
            // code to be executed
            }
        }

     
     - myMethod() es el nombre del método
     - static significa que el método pertenece a la clase principal y no a un objeto de la clase principal.
     - Aprenderá más sobre objetos y cómo acceder a métodos a través de objetos más adelante en este tutorial.
     void significa que este método no tiene un valor de retorno.

     Llamar a un método

    Para llamar a un método en Java, escriba el nombre del método seguido de dos paréntesis () y un punto y coma; 
    En el siguiente ejemplo, myMethod() se usa para imprimir un texto (la acción), cuando se llama:

    Parámetros y Argumentos

    La información se puede pasar a los métodos como parámetro. Los parámetros actúan como variables dentro del método.
    Los parámetros se especifican después del nombre del método, entre paréntesis. Puede agregar tantos parámetros como desee, simplemente sepárelos con una coma.
    El siguiente ejemplo tiene un método que toma como parámetro un String llamado fname. Cuando se llama al método, pasamos un nombre, que se usa dentro del
    método para imprimir el nombre completo

    Tenga en cuenta que cuando trabaja con varios parámetros, la llamada al método debe tener la misma cantidad de argumentos que parámetros, y
    los argumentos deben pasarse en elmismo orden.

    Valores devueltos

    La palabra clave void, utilizada en los ejemplos anteriores, indica que el método no debe devolver un valor. Si desea que el método devuelva un valor, puede usar un tipo de datos primitivo (como int, char, etc.)
    en lugar de void y usar la palabra clave return dentro del método:

    Un método con If...Else

    Es común usar sentencias if...else dentro de métodos:

    Sobrecarga de métodos

    Con la sobrecarga de métodos, varios métodos pueden tener el mismo nombre con diferentes parámetros:
    int myMethod(int x)
    float myMethod(float x)
    double myMethod(double x, double y)

    Alcance de Java (Scope)

    En Java, solo se puede acceder a las variables dentro de la región en la que se crearon. Esto se llama alcance.

    Alcance del método

    Las variables declaradas directamente dentro de un método están disponibles en cualquier parte del método siguiendo la línea de código en la que fueron declaradas:

    Ámbito de bloque

    Un bloque de código se refiere a todo el código entre llaves {}. Solo se puede acceder a las variables declaradas dentro de bloques de código
    mediante el código entre llaves, que sigue la línea en la que se declaró la variable:

    Un bloque de código puede existir por sí mismo o puede pertenecer a una declaración if, while o for. En el caso de sentencias for, las variables
    declaradas en la sentencia misma también están disponibles dentro del alcance del bloque.

    Recursión de Java

    La recursividad es la técnica de hacer que una función se llame a sí misma. Esta técnica proporciona una forma de dividir problemas complicados en problemas
    simples que son más fáciles de resolver.

    La recursión puede ser un poco difícil de entender. La mejor manera de averiguar cómo funciona es experimentar con él.
    Ejemplo de recursividad

    Sumar dos números juntos es fácil de hacer, pero sumar un rango de números es más complicado. En el siguiente ejemplo, la recursividad se usa para sumar
    un rango de números al dividirlo en la simple tarea de sumar dos números:

*/