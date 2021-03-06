// CADA LÌNEA DE CÒDIGO JAVA SIEMPRE DEBE ESTAR DENTRO DE UNA CLASE.
// UNA CLASE SIEMPRE DEBE COMENZAR LA PRIMERA LETRA EN MAYÙSCULA.
// JAVA DISTINGUE ENTRE MAYÙSCULAS Y MINÙSCULAS
// EL NOMBRE DEL ARCHIVO JAVA DEBE COINCIDIR CON EL NOMBRE DE LA CLASE. EN ESTE CASO "Main" --> Main.java
// "System" es una clase de Java incorporada que contiene miembros útiles, como "out", que es la abreviatura de "salida".

/*
    MÉTODOS:
        - EL MÈTODO "Main" ES IMPRESCINDIBLE. (public static void main(String[] args)
        - .println("IMPRIME UNA LÌNEA DE TEXTO EN PANTALLA");
        - .print("IMPRIME UNA LÌNEA DE TEXTO EN PANTALLA MÁS NO EL SALTO DE LÍNEA");
*/


// NOMBRE DE LA CLASE
public class Main {
    // MÉTODO IMPRESCINDIBLE (main)
  public static void main(String[] args) {
      
    String nombre = "Ángel";
    int num1 = 2;
    int num2 = 6;
      
  //  System.out.println("Hello World!!");
  //  System.out.println("Otra línea con el método para imprimir una línea");
    // TOMA LOS VALORES COMO ENTEROS SI ESTÁN SIN COMILLAS
    

    //System.out.println(num1 * num2); // (TIPO DE DATO "int")
    // SIN SALTO DE LÍNEA
    // System.out.print(nombre);
   // System.out.print("Hello World! ");
  //  System.out.print("I will print on the same line.");
  
    // También puede declarar una variable sin asignar el valor y asignar el valor más tarde:
//    int myNum;
//    myNum = 15;
//    System.out.println(myNum);
    
    // Tenga en cuenta que si asigna un nuevo valor a una variable existente, sobrescribirá el valor anterior:
//    int myNum2 = 15;
//    myNum2 = 20;  // myNum is now 20
//    System.out.println(myNum2);
    
    /*Si no desea que otros (o usted mismo) sobrescriban los valores existentes, use la palabra clave final (esto declarará la variable como "final" o "constante",
    lo que significa que no se puede modificar y es de solo lectura):*/
    //final int myNum3 = 15;
    //myNum3 = 20; /* con la palabra clave la "variable" básicamente cambia a "constante" */
    
    // Una demostración de cómo declarar variables de otros tip
//   boolean myBool = true;
//    String myText = "Hello";
//       int myNum4 = 5;
//    float myFloatNum = 5.99f;
//    char myLetter = 'D';
//    boolean myBool = true;
//    String myText = "Hello";
    
    // COMBINANDO TEXTO CON UNA VARIABLE CON EL OPERADOR "+"
//    String name = "Ángel";
//    System.out.println("Bienvenido: " + name);

//      String firstName = "John ";
//      String lastName = "Doe";
//      String fullName = firstName + lastName; // INTERESANTE
//      System.out.println(fullName);

//    También puede usar el carácter + para agregar una variable a otra variable:
//      int x = 12;
//      int y = 6;
//      System.out.println(x + y);

//      DECLARANDO MÁS DE UNA VARIABLE DEL MISMO TIPO
//        int x = 5;
//        int y = 6;
//        int z = 50;
//        System.out.println(x + y + z);
        
//        ES IGUAL A
//        int x = 5, y = 6, z = 50;
//        System.out.println(x + y + z);

//          Un valor para múltiples variables
//            int x, y, z;
//            x = y = z = 50;
//            System.out.println(x + y + z);

//      BUENAS PRÁCTICAS AL DECLARAR VARIABLES
        // Good
//        int minutesPerHour = 120;

        // OK pero no se entiende el motivo de su declración
//        int m = 60;
//
//        System.out.println(minutesPerHour);


//        TIPOS DE DATOS
//        byte myNum = 100;
//        System.out.println(myNum);
//        
//        short myNumShort = 5000;
//        System.out.println(myNumShort);
//        
//        long myNumLong = 15000000000L;
//        System.out.println(myNumLong);
//        
//
//        float myNumFloat = 5.75f;
//        System.out.println(myNumFloat);
//        
//        double myNumDouble = 19.99d;
//        System.out.println(myNumDouble);
//
////        NÚMEROS CIENTIFICOS, E/e INDICA EL VALOR A LA EXPONENCIA
//        float f1 = 35e3f;
//        double d1 = 12E4d;
//        System.out.println(f1);
//        System.out.println(d1);
//        
//        boolean isJavaFun = true;
//        boolean isFishTasty = false;
//        System.out.println(isJavaFun);     // Outputs true
//        System.out.println(isFishTasty);   // Outputs false
//
//        char myGrade = 'B';
//        System.out.println(myGrade);
//        
//        
////        código ascii
//        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
//        System.out.println(myVar1);
//        System.out.println(myVar2);
//        System.out.println(myVar3);
//        
//        String greeting = "Hello World";
//        System.out.println(greeting);

//        Widening Casting (pequeño a grande) es automático
//              int myInt = 9;
//              double myDouble = myInt; // Automatic casting: int to double
//
//        System.out.println(myInt);      // Outputs 9
//        System.out.println(myDouble);   // Outputs 9.0
        
//        Narrowing Casting (grande a pequeño) es manualmente

//        double myDouble = 9.78d;
//        int myInt = (int) myDouble; // Manual casting: double to int
//
//        System.out.println(myDouble);   // Outputs 9.78
//        System.out.println("El resultado de estrechamiento es;" + myInt);      // Outputs 9

//        JAVA STRINGS

//          TAMAÑO
//          String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//          System.out.println("EL TAMAÑO DE LA CADENA ES: " + txt.length());
          
//          MÉTODOS PARA USAR CON STRINGS
//            String txt = "Hello World";
//            System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
//            System.out.println(txt.toLowerCase());   // Outputs "hello world"

//          Buscando un char CON EL MÉTODO .INDEXOF()
//            String txt = "Por favor localizar en donde està ÉSTA palabra!";
//            System.out.println("La palabra buscada se encuentra en la posición: " + txt.indexOf("ÉSTA"));

//            NOTA: .indexof() cuenta los espacios en la cadena porque también se representa como un caracter (char)

//            CONCATENAR STRINGS

//            String firstName = "John";
//            String lastName = "Doe";
//            System.out.println(firstName + " " + lastName);
            
//            o
                    
//            String firstName = "John ";
//            String lastName = "Doe";
//            System.out.println(firstName.concat(lastName));

                // FORMA CORRECTA DE USAR CARÁCTERES ESPECIALES EN UN STRING:
//                String txt = "We are the so-called \"Vikings\" from the north.";
//                  String txt = "It\'s alright.";
//                  String txt = "The character \\ is called backslash.";

//                    System.out.println(txt);

//            CLASE MATH
               
               
//               System.out.println(Math.max(5, 10));// BUSCA EL VALOR MÁS ALTO
//               System.out.println(Math.min(5, 10));// BUSCA EL VALOR MÁS BAJO
//               System.out.println(Math.sqrt(64));// DEVUELVE RAÍZ CUADRADA DE L VALOR INDICADO
//               System.out.println(Math.abs(-4.7));// DEVUELVE EL VALOR ABOSOLUTO DEL PARÁMETRO INDICADO
//               System.out.println(Math.random());// DEVUELVE un nro aleatoreo
//               
////               CONTROLANDO EL RANGO
//               int randomNum = (int) (Math.random() * 101);  // 0 to 100
//               System.out.println(randomNum);

//               CONDICIONALES
                
    //              SENTENCIA IF
//                if(20 > 18) {
//                    System.out.println("20 es mayor que 18");
//                }
                
//                USANDO VARIABLES
//                int x = 20;
//                int y = 18;
//                if (x > y) {
//                System.out.println("x ES MAYOR QUE y");
//                }
//              SENTENCIA ELSE
//                int time = 20;
//                if (time < 18) {
//                    System.out.println("Good day.");
//                } else { // SINO
//                    System.out.println("Good evening.");
//                }

//                SENTENCIA ELSE IF
//                    int time = 22;
//      if (time < 10) {
//          System.out.println("Good morning.");
//      } else if (time < 20) {
//          System.out.println("Good day.");
//      } else {
//          System.out.println("Good evening.");
//      }
                
//                SENTENCIA IF...ELSE O MEJOR CONOCIDO COMO OPERADOR TERNARIO
//int time = 20;
//if (time < 18) {
//  System.out.println("Good day.");
//} else {
//  System.out.println("Good evening.");
//}
// UTILIZANDO EL OPERADOR TERNARIO SERIA:
//int time = 20;
//String result = (time < 18) ? "Good day." : "Good evening.";
//System.out.println(result);

//        SENTENCIA SWITCH
//            int day = 10;
//switch (day) {
//  case 1:
//    System.out.println("Monday");
//    break; // LE INDICA QUE NO DEBE SEGUIR BUSCANDO
//  case 2:
//    System.out.println("Tuesday");
//    break;
//  case 3:
//    System.out.println("Wednesday");
//    break;
//  case 4:
//    System.out.println("Thursday");
//    break;
//  case 5:
//    System.out.println("Friday");
//    break;
//  case 6:
//    System.out.println("Saturday");
//    break;
//  case 7:
//    System.out.println("Sunday");
//    break;
//    
//  default: // SINO EL VALOR NO CUMPLE CON NINGÚN CASO
//    System.out.println("EL VALOR INDICADO NO REPRESENTA UN DÍA DE LA SEMANA");
//
//    }

//        BUCLES

//            MIENTRAS
//                int i = 0;
//                while (i < 5) {
//                  System.out.println(i);
//                  i++; // SIN AUMENTAR EL VALOR DE LA VARIABLE EL CICLO NUNCA TERMINARÁ
//                }
                
//              HACER/MIENTRAS
//                int i = 3;
//                do {
//                  System.out.println(i);
//                  i++;
//                }

//                    int i = 0;
//                    while (i < 10) {
//                      System.out.println(i);
//                      i++;
//                      if (i == 4) {
//                        break;
//                      }
//                    }

//                    int i = 0;
//                    while (i < 10) {
//                    if (i == 4) {
//                      i++;
//                      continue;
//                    }
//                    System.out.println(i);
//                    i++;
//                  }

//                while (i < 5);

//                POR (recomendable para cuándo sé cuántas veces se debe recorrer)
//                    for (int i = 0; i < 5; i++) {
//                      System.out.println(i);
//                    }
                  
//                  NOTA: LA CONDICIÓN DE INCREMENTO SE CUMPLE DESPUÉS DE HACER EL RECORRIDO

//                    for (int i = 0; i <= 10; i = i + 2) {
//                      System.out.println(i);
//                    }



//                FOR-EACH
//                    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//                    for (String i : cars) {
//                      System.out.println(i);
//                    }
 
                    // USANDO EL BREAK EN UN CICLO
//                    for (int i = 0; i < 10; i++) {
//                        if (i == 4) {
//                          break;
//                        }
//                        System.out.println(i);
//                    }
                    
//                    USANDO CONTINUE
//                    for (int i = 0; i < 10; i++) {
//                        if (i == 4) {
//                          continue; // La declaración de continuar interrumpe una iteración (en el ciclo), si ocurre una
//                                    // condición específica, y continúa con la siguiente iteración en el ciclo.
//                        }
//                        System.out.println(i);
//                    }

//                    MATRICES
//                      Para declarar una matriz, defina el tipo de variable con corchetes:
//                        String[] cars = {"a","b","a", "a"};
//                        System.out.println(cars[1]);
                        
                        // CAMBIANDO EL VALOR DE UN ARRAY
//                        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//                        cars[0] = "Opel";
//                        System.out.println(cars[0]);
                        
//                      CONOCIENDO EL TAMAÑO DE UN ARRAY
//                        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Volvo"};
//                        System.out.println(cars.length);

//                      RECORRIENDO ARRAYS
//                        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//                            for (int i = 0; i < cars.length; i++) {
//                              System.out.println(cars[i]);
//                        }

//                        MATRICES MULTIDIMENSIONALES
//                        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

//                        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 8} };
//                        int x = myNumbers[1][2];
//                        System.out.println(x);
                        
//                        RECORRIENDO MATRICES MULTIDIMENSIONALES
                              int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
                                for (int i = 0; i < myNumbers.length; ++i) {
                                  for(int j = 0; j < myNumbers[i].length; ++j) {
                                    System.out.println(myNumbers[i][j]);
                                  }
                                }

                        
                        



  }
}

/*
APUNTES:
    VARIABLES:
        Las variables son contenedores para almacenar valores de datos. En Java, existen diferentes tipos de variables, por ejemplo:

            STRING: almacena texto, como "Hola". Los valores de cadena están entre comillas dobles
            int: almacena enteros (números enteros), sin decimales, como 123 o -123
            float: almacena números de coma flotante, con decimales, como 19,99 o -19,99
            char: almacena caracteres individuales, como 'a' o 'B'. Los valores de char están entre comillas simples
            booleano - almacena valores con dos estados
        
Declarar (crear) variables

    Para crear una variable, debe especificar el tipo y asignarle un valor: type variableName = value;

Mostrar variables

    Para combinar texto y una variable, use el carácter +:

Declarar muchas variables

    Para declarar más de una variable del mismo tipo, puede usar una lista separada por comas:

Un valor para múltiples variables

    También puede asignar el mismo valor a múltiples variables en una línea:

Identificadores

    Todas las variables de Java deben identificarse con nombres exclusivos. Estos nombres únicos se denominan identificadores.

    Los identificadores pueden ser nombres cortos (como x e y) o nombres más descriptivos (edad, suma, volumen total).

    Nota: Se recomienda utilizar nombres descriptivos para crear un código comprensible y mantenible:

    Las reglas generales para nombrar variables son:

    Los nombres pueden contener letras, dígitos, guiones bajos y signos de dólar.
    Los nombres deben comenzar con una letra.
    Los nombres deben comenzar con una letra minúscula y no pueden contener espacios en blanco
    Los nombres también pueden comenzar con $ y _ (pero no lo usaremos en este tutorial)
    Los nombres distinguen entre mayúsculas y minúsculas ("myVar" y "myvar" son variables diferentes) --> IMPORTANTISIMO
    Las palabras reservadas (como las palabras clave de Java, como int o boolean) no se pueden usar como nombres

    Tipos de datos Java

    Los tipos de datos se dividen en dos grupos:

    Tipos de datos primitivos: incluye byte, short, int, long, float, double, boolean y char
    Tipos de datos no primitivos, como String, Arrays y Classes (aprenderá más sobre estos en un capítulo posterior)

    Tipos de datos primitivos

    Un tipo de datos primitivo especifica el tamaño y el tipo de los valores de las variables y no tiene métodos adicionales.

    Hay ocho tipos de datos primitivos en Java:
Data Type 	Size 	Description
byte 	1 byte 	Stores whole numbers from -128 to 127
short 	2 bytes 	Almacena números enteros de -32,768 to 32,767
int 	4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long 	8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float 	4 bytes 	Almacena números fraccionarios. Sufficient for storing 6 to 7 decimal digits
double 	8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean 	1 bit 	Stores true or false values
char 	2 bytes 	Almacena un solo carácter/letra o valores ASCII

Tipos de datos Java

Los tipos de datos se dividen en dos grupos:

     Tipos de datos primitivos: incluye byte, short, int, long, float, double, boolean y char
     Tipos de datos no primitivos, como String, Arrays y Classes (aprenderá más sobre estos en un capítulo posterior)

Tipos de datos primitivos

Un tipo de datos primitivo especifica el tamaño y el tipo de los valores de las variables y no tiene métodos adicionales.

Hay ocho tipos de datos primitivos en Java:
Almacena números enteros de
Almacena números fraccionarios
Almacena un solo carácter/letra o valores ASCII

Números

Los tipos de números primitivos se dividen en dos grupos:

    Los tipos enteros almacenan números enteros, positivos o negativos (como 123 o -456), sin decimales. Los tipos válidos son byte, short, int y long. El tipo que debe usar depende del valor numérico.

    Los tipos de punto flotante representan números con una parte fraccionaria, que contienen uno o más decimales. Hay dos tipos: flotante y doble.

Tipos de enteros

Byte
El tipo de datos byte puede almacenar números enteros de -128 a 127. Esto se puede usar en lugar de int u otros tipos de enteros para ahorrar memoria cuando 
está seguro de que el valor estará entre -128 y 127:

Short
El tipo de datos corto puede almacenar números enteros desde -32768 hasta 32767:

Long

The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value.
Note that you should end the value with an "L":

Tipos de datos Java

Los tipos de datos se dividen en dos grupos:

    Tipos de datos primitivos: incluye byte, short, int, long, float, double, boolean y char
    Tipos de datos no primitivos, como String, Arrays y Classes (aprenderá más sobre estos en un capítulo posterior)

Tipos de datos primitivos

Un tipo de datos primitivo especifica el tamaño y el tipo de los valores de las variables y no tiene métodos adicionales.

Hay ocho tipos de datos primitivos en Java:
Almacena números enteros de
Almacena números fraccionarios
Almacena un solo carácter/letra o valores ASCII

Números

Los tipos de números primitivos se dividen en dos grupos:

Los tipos enteros almacenan números enteros, positivos o negativos (como 123 o -456), sin decimales. Los tipos válidos son byte, short, int y long. El tipo que debe usar depende del valor numérico.

Los tipos de punto flotante representan números con una parte fraccionaria, que contienen uno o más decimales. Hay dos tipos: flotante y doble.

Aunque hay muchos tipos numéricos en Java, los más usados ​​para números son int (para números enteros) y double (para números de punto flotante). Sin embargo, los describiremos todos a medida que continúes leyendo.
Tipos de enteros
Byte

El tipo de datos byte puede almacenar números enteros de -128 a 127. Esto se puede usar en lugar de int u otros tipos de enteros para ahorrar memoria cuando está seguro de que el valor estará entre -128 y 127:

Corto

El tipo de datos corto puede almacenar números enteros desde -32768 hasta 32767:

Largo

El tipo de datos largo puede almacenar números enteros desde -9223372036854775808 hasta 9223372036854775807. Esto se usa cuando int no es lo suficientemente grande para almacenar el valor. Tenga en cuenta que debe terminar el valor con una "L":

Tipos de punto flotante

Debe usar un tipo de punto flotante cada vez que necesite un número con un decimal, como 9,99 o 3,14515.

Los tipos de datos float y double pueden almacenar números fraccionarios. Tenga en cuenta que debe terminar el valor con una "f" para flotantes y una "d" para dobles:

float o double
La precisión de un valor de punto flotante indica cuántos dígitos puede tener el valor después del punto decimal. La precisión de float es de solo seis o siete
dígitos decimales, mientras que las variables dobles tienen una precisión de alrededor de 15 dígitos. Por lo tanto, es más seguro usar el doble para la mayoría de los cálculos.

números científicos

Un número de punto flotante también puede ser un número científico con una "e" para indicar la potencia de 10:

Tipos booleanos

Un tipo de dato booleano se declara con la palabra clave "boolean" y solo puede tomar los valores verdadero o falso:

Tipos de datos Java

Los tipos de datos se dividen en dos grupos:

    Tipos de datos primitivos: incluye byte, short, int, long, float, double, boolean y char
    Tipos de datos no primitivos, como String, Arrays y Classes (aprenderá más sobre estos en un capítulo posterior)

Tipos de datos primitivos

Un tipo de datos primitivo especifica el tamaño y el tipo de los valores de las variables y no tiene métodos adicionales.

Hay ocho tipos de datos primitivos en Java:
Almacena números enteros de
Almacena números fraccionarios
Almacena un solo carácter/letra o valores ASCII

Números

Los tipos de números primitivos se dividen en dos grupos:

Los tipos enteros almacenan números enteros, positivos o negativos (como 123 o -456), sin decimales. Los tipos válidos son byte, short, int y long. El tipo que debe usar depende del valor numérico.

Los tipos de punto flotante representan números con una parte fraccionaria, que contienen uno o más decimales. Hay dos tipos: flotante y doble.

Aunque hay muchos tipos numéricos en Java, los más usados ​​para números son int (para números enteros) y double (para números de punto flotante). Sin embargo, los describiremos todos a medida que continúes leyendo.
Tipos de enteros
Byte

El tipo de datos byte puede almacenar números enteros de -128 a 127. Esto se puede usar en lugar de int u otros tipos de enteros para ahorrar memoria cuando está seguro de que el valor estará entre -128 y 127:

Corto

El tipo de datos corto puede almacenar números enteros desde -32768 hasta 32767:

Largo

El tipo de datos largo puede almacenar números enteros desde -9223372036854775808 hasta 9223372036854775807. Esto se usa cuando int no es lo suficientemente grande para almacenar el valor. Tenga en cuenta que debe terminar el valor con una "L":

Tipos de punto flotante

Debe usar un tipo de punto flotante cada vez que necesite un número con un decimal, como 9,99 o 3,14515.

Los tipos de datos float y double pueden almacenar números fraccionarios. Tenga en cuenta que debe terminar el valor con una "f" para flotantes y una "d" para dobles:

se flota o doble?

La precisión de un valor de punto flotante indica cuántos dígitos puede tener el valor después del punto decimal. La precisión de float es de solo seis o siete dígitos decimales, mientras que las variables dobles tienen una precisión de alrededor de 15 dígitos. Por lo tanto, es más seguro usar el doble para la mayoría de los cálculos.

números científicos

Un número de punto flotante también puede ser un número científico con una "e" para indicar la potencia de 10:

Bolloean

Un tipo de dato booleano se declara con la palabra clave booleana y solo puede tomar los valores verdadero o falso:

char

El tipo de datos char se utiliza para almacenar un solo carácter. El carácter debe estar entre comillas simples, como 'A' o 'c':

Alternativamente, si está familiarizado con los valores ASCII, puede usarlos para mostrar ciertos caracteres:

Strings

El tipo de datos String se utiliza para almacenar una secuencia de char

Tipos de datos Java

Los tipos de datos se dividen en dos grupos:

    Tipos de datos primitivos: incluye byte, short, int, long, float, double, boolean y char
    Tipos de datos no primitivos, como String, Arrays y Classes (aprenderá más sobre estos en un capítulo posterior)

Tipos de datos primitivos

Un tipo de datos primitivo especifica el tamaño y el tipo de los valores de las variables y no tiene métodos adicionales.

Hay ocho tipos de datos primitivos en Java:
Almacena números enteros de
Almacena números fraccionarios
Almacena un solo carácter/letra o valores ASCII

Números

Los tipos de números primitivos se dividen en dos grupos:

Los tipos enteros almacenan números enteros, positivos o negativos (como 123 o -456), sin decimales. Los tipos válidos son byte, short, int y long. El tipo que debe usar depende del valor numérico.

Los tipos de punto flotante representan números con una parte fraccionaria, que contienen uno o más decimales. Hay dos tipos: flotante y doble.

Aunque hay muchos tipos numéricos en Java, los más usados ​​para números son int (para números enteros) y double (para números de punto flotante). Sin embargo, los describiremos todos a medida que continúes leyendo.
Tipos de enteros
Byte

El tipo de datos byte puede almacenar números enteros de -128 a 127. Esto se puede usar en lugar de int u otros tipos de enteros para ahorrar memoria cuando está seguro de que el valor estará entre -128 y 127:

Corto

El tipo de datos corto puede almacenar números enteros desde -32768 hasta 32767:

Largo

El tipo de datos largo puede almacenar números enteros desde -9223372036854775808 hasta 9223372036854775807. Esto se usa cuando int no es lo suficientemente grande para almacenar el valor. Tenga en cuenta que debe terminar el valor con una "L":

Tipos de punto flotante

Debe usar un tipo de punto flotante cada vez que necesite un número con un decimal, como 9,99 o 3,14515.

Los tipos de datos float y double pueden almacenar números fraccionarios. Tenga en cuenta que debe terminar el valor con una "f" para flotantes y una "d" para dobles:

se flota o doble?

La precisión de un valor de punto flotante indica cuántos dígitos puede tener el valor después del punto decimal. La precisión de float es de solo seis o siete dígitos decimales, mientras que las variables dobles tienen una precisión de alrededor de 15 dígitos. Por lo tanto, es más seguro usar el doble para la mayoría de los cálculos.

números científicos

Un número de punto flotante también puede ser un número científico con una "e" para indicar la potencia de 10:

Tipos booleanos

Un tipo de dato booleano se declara con la palabra clave booleana y solo puede tomar los valores verdadero o falso:

Caracteres

El tipo de datos char se utiliza para almacenar un solo carácter. El carácter debe estar entre comillas simples, como 'A' o 'c':

Alternativamente, si está familiarizado con los valores ASCII, puede usarlos para mostrar ciertos caracteres:

Instrumentos de cuerda

El tipo de datos String se utiliza para almacenar una secuencia de char. El tipo String es tan usado e integrado en Java, que algunos lo llaman "el noveno tipo especial".

Una cadena en Java es en realidad un tipo de datos no primitivo, porque se refiere a un objeto. El objeto String tiene métodos que se utilizan para realizar
ciertas operaciones en cadenas.

Tipos de datos no primitivos

Los tipos de datos no primitivos se denominan tipos de referencia porque se refieren a objetos.

La principal diferencia entre los tipos de datos primitivos y no primitivos son:

    Los tipos primitivos están predefinidos (ya definidos) en Java. Los tipos no primitivos son creados por el programador y no están definidos por Java
    (excepto String).
    Los tipos no primitivos se pueden usar para llamar a métodos para realizar ciertas operaciones, mientras que los tipos primitivos no pueden.
    Un tipo primitivo siempre tiene un valor, mientras que los tipos no primitivos pueden ser nulos. (null)
    Un tipo primitivo comienza con una letra minúscula, mientras que los tipos no primitivos comienzan con una letra mayúscula.
    El tamaño de un tipo primitivo depende del tipo de datos, mientras que los tipos no primitivos tienen todos el mismo tamaño.

Ejemplos de tipos no primitivos son Strings, Arrays, Classes, Interface, etc. Aprenderá más sobre estos en un capítulo posterior.

Conversión de tipos de Java

La conversión de tipos es cuando asigna un valor de un tipo de datos primitivo a otro tipo. En Java, hay dos tipos de conversión:

En Java, hay dos tipos de conversión:

    Ampliación de fundición (automáticamente): conversión de un tipo más pequeño a un tamaño de tipo más grande
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manualmente): convertir un tipo más grande en un tipo de tamaño más pequeño
    double -> float -> long -> int -> char -> short -> byte

Operadores Java

Los operadores se utilizan para realizar operaciones en variables y valores.

Java divide los operadores en los siguientes grupos:

     Operadores aritméticos
     Operator 	Name 	Description 	Example 	
+ 	Addition 	Adds together two values 	x + y 	
- 	Subtraction 	Subtracts one value from another 	x - y 	
* 	Multiplication 	Multiplies two values 	x * y 	
/ 	Division 	Divides one value by another 	x / y 	
% 	Modulus 	Returns the division remainder 	x % y 	
++ 	Increment 	Increases the value of a variable by 1 	++x 	
-- 	Decrement 	Decreases the value of a variable by 1 	--x 	

     Operadores de Asignación
     Operator 	Example 	Same As 	
= 	x = 5 	x = 5 	
+= 	x += 3 	x = x + 3 	
-= 	x -= 3 	x = x - 3 	
*= 	x *= 3 	x = x * 3 	
/= 	x /= 3 	x = x / 3 	
%= 	x %= 3 	x = x % 3 	
&= 	x &= 3 	x = x & 3 	
|= 	x |= 3 	x = x | 3 	
^= 	x ^= 3 	x = x ^ 3 	
>>= 	x >>= 3 	x = x >> 3 	
<<= 	x <<= 3 	x = x << 3

     Operadores de comparación
     Operator 	Name 	Example 	
== 	Equal to 	x == y 	
!= 	Not equal 	x != y 	
> 	Greater than 	x > y 	
< 	Less than 	x < y 	
>= 	Greater than or equal to 	x >= y 	
<= 	Less than or equal to 	x <= y

     Operadores logicos
     Operator 	Name 	Description 	Example 	
&&  	Logical and 	Returns true if both statements are true 	x < 5 &&  x < 10 	
||  	Logical or 	Returns true if one of the statements is true 	x < 5 || x < 4 	
! 	Logical not 	Reverse the result, returns false if the result is true 	!(x < 5 && x < 10)

     Operadores bit a bit
     
     JAVA STRINGS

     Las cadenas se utilizan para almacenar texto. Una variable de cadena contiene una colección de caracteres entre comillas dobles: String greeting = "Hello";

     JAVA LENGTH (Longitud de la cuerda)
     
     Una cadena en Java es en realidad un OBJETO, que contiene métodos que pueden realizar ciertas operaciones en cadenas. Por ejemplo, la longitud
     de una cadena se puede encontrar con el método length():

     Más métodos de cadena

     Hay muchos métodos de cadena disponibles, por ejemplo, toUpperCase() y toLowerCase():

     Encontrar un caracter en una cadena

     El método indexOf() devuelve el índice (la posición) de la primera aparición de un texto específico en una cadena (incluidos los espacios en blanco):

     También puedes usar el método concat() para concatenar dos cadenas

     Caracteres especiales

        Debido a que las cadenas deben escribirse entre comillas, Java malinterpretará esta cadena y generará un error: 

        String txt = "We are the so-called "Vikings" from the north.";


        La solución para evitar este problema es utilizar el carácter de escape de barra invertida.

        El carácter de escape de barra invertida (\) convierte los caracteres especiales en caracteres de cadena:

Escape character 	Result 	Description
\' 	' 	Single quote
\" 	" 	Double quote
\\ 	\ 	Backslash

        La secuencia \" inserta una comilla doble en una cadena:

        Six other escape sequences are valid in Java:
Code 	Result
\n 	New Line 	
\r 	Carriage Return 	
\t 	Tab 	
\b 	Backspace 	
\f 	Form Feed

        JAVA MATH

        La clase Java Math tiene muchos métodos que le permiten realizar tareas matemáticas con números.

        Condiciones de Java y sentencias If

 Java admite las condiciones lógicas habituales de las matemáticas:

    Menos que: a < b
    Menor o igual que: a <= b
    Mayor que: a > b
    Mayor o igual que: a >= b
    Igual a a == b
    No igual a: a != b

Puede usar estas condiciones para realizar diferentes acciones para diferentes decisiones.

Java tiene las siguientes declaraciones condicionales:

    Use if para especificar un bloque de código que se ejecutará, si una condición especificada es verdadera
    Use else para especificar un bloque de código a ejecutar, si la misma condición es falsa
    Use else if para especificar una nueva condición para probar, si la primera condición es falsa
    Use el interruptor para especificar muchos bloques de código alternativos para ejecutar

La declaración IF

Use la declaración if para especificar un bloque de código Java que se ejecutará si una condición es verdadera.

La declaración ELSE

Use la declaración else para especificar un bloque de código que se ejecutará si la condición es falsa.

La declaración else if 

    Use la declaración else if para especificar una nueva condición si la primera condición es falsa.

sHORT hAND IF...ELSE (OPERADOR TERNARIO)

    También hay un if else abreviado, que se conoce como operador ternario porque consta de tres operandos.

    Se puede usar para reemplazar varias líneas de código con una sola línea, y se usa con mayor frecuencia para reemplazar declaraciones if else simples:

    variable = (condition) ? expressionTrue :  expressionFalse;

    SENTENCIA SWITCH

    Utilice la instrucción switch para seleccionar uno de los muchos bloques de código que se ejecutarán.

    Así es como funciona:

     La expresión de cambio se evalúa una vez.
     El valor de la expresión se compara con los valores de cada caso.
     Si hay una coincidencia, se ejecuta el bloque de código asociado.
     Las palabras clave break y default son opcionales y se describirán más adelante en este capítulo.

    LOOPS (BUCLES)
    Los bucles pueden ejecutar un bloque de código siempre que se alcance una condición específica.

    Los bucles son útiles porque ahorran tiempo, reducen los errores y hacen que el código sea más legible.
    
    Ciclo while (MIENTRAS)

    El ciclo while recorre un bloque de código siempre que una condición específica sea verdadera:

while (condition) {
  // code block to be executed
}

    CICLO DO/WHILE
    El bucle do/while es una variante del bucle while. Este ciclo ejecutará el bloque de código una vez, antes de verificar si la condición es verdadera,
    luego repetirá el ciclo mientras la condición sea verdadera.

    do {
        // code block to be executed
    }
    while (condition);


    CICLO FOR
    Cuando sepa exactamente cuántas veces desea recorrer un bloque de código, use el bucle for en lugar de un bucle while:

La declaración 1 se ejecuta (una vez) antes de la ejecución del bloque de código.

La declaración 2 define la condición para ejecutar el bloque de código.

La declaración 3 se ejecuta (todas las veces) después de que se haya ejecutado el bloque de código.

for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
    FOR-EACH LOOP (PARA CADA BUCLE)
    También hay un ciclo "para cada uno", que se usa exclusivamente para recorrer elementos en una matriz:

    for (type variableName : arrayName) {
        // code block to be executed
    }

    ARRAYS (MATRICES)

    Las matrices se utilizan para almacenar múltiples valores en una sola variable, en lugar de declarar variables separadas para cada valor.

    Para declarar una matriz, defina el tipo de variable con corchetes:

    Matrices multidimensionales

    Una matriz multidimensional es una matriz de matrices. Para crear una matriz bidimensional, agregue cada matriz dentro de su propio conjunto de llaves:

*/