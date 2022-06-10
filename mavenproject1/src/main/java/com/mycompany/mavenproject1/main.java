package com.mycompany.mavenproject1;

//import java.util.Scanner; // IMPORTA SÓLO UNA CLASE DEL PAQUETE
import java.util.*; // IMPORTA TODAS LAS CLASES DEL PAQUETE

import java.time.LocalDate; // PAQUETE QUE FUNCIONA CON LA API DE FECHA Y HORA
import java.time.LocalTime; // PAQUETE QUE FUNCIONA CON LA API DE FECHA Y HORA
import java.time.LocalDateTime; // PAQUETE QUE FUNCIONA CON LA API DE FECHA Y HORA
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class
import java.util.LinkedList; // Import the LinkedList class
import java.util.HashMap; // import the HashMap class
import java.util.HashSet; // Import the HashSet class
import java.util.Iterator;

import mypack.MyPackageClass; // IMPORTANDO UN PAQUETE PERSONALIZADO

public class main {

    public static void main(String[] args) {

        // ABSTRACCIÓN
//      Moto moto = new Moto();
//      moto.acelerar();
//      
//      Carro carro = new Carro();
//      carro.acelerar();
        // ENCAPSULACIÓN
//      Person myObj = new Person();
//      myObj.name = "John";  // error (Porque no se puede acceder a una variable con el modificador "privatte")
//      System.out.println(myObj.name); // error  (desde orta clase como es éste el caso)
//      En su lugar, usamos los métodos getName() y setName() para acceder y actualizar la variable:
//        Person myObj = new Person();
//        myObj.setName("Ángel"); // Set the value of the name variable to "John"
//        System.out.println(myObj.getName());
        // PAQUETES
//      Scanner myObj = new Scanner(System.in);
//      System.out.println("Enter username");
//
//      String userName = myObj.nextLine(); // Método para leer una línea completa
//      System.out.println("Username is: " + userName);
//        MyPackageClass objetoPaquete = new MyPackageClass();
//        objetoPaquete.saludoPaquete();
        // HERENCIA
//        Carro miCarro = new Carro(); // Instancia de la clase carro
//        miCarro.honk(); // accedo al método definido en la clase padre a través del objeto que representa la clase hijo porque hereda.
//        
//        System.out.println(miCarro.brand + " " + miCarro.modelName);
//        System.out.println(miCarro.brand + " " + miCarro.getModelName());
        // accedo a la marca definida en la clase padre pero si marco como private el atributo modelName me generaría error
        //por que no lo ve
        // POLIFORMISMO
//        Animal myAnimal = new Animal();  // Create a Animal object
//        Animal myPig = new Pig();  // Create a Pig object
//        Animal myDog = new Dog();  // Create a Dog object
//        myAnimal.animalSound();
//        myPig.animalSound();
//        myDog.animalSound();
        // CLASES INTERNAS
//        claseExterna objetoExterna = new claseExterna();
//        claseExterna.claseInterna objetoInterna = objetoExterna.new claseInterna();
//        System.out.println(objetoExterna.x + objetoInterna.y);
        // CUANDO LA CLASE INTERNA ES PRIVADA
//            claseExterna objetoExterna = new claseExterna();
//            claseExterna.claseInterna objetoInterna = objetoExterna.new claseInterna(); // DA ERROR PORQUE NO PERMITO A LA CLASEEXTERNA ACCEDER A LA INTERNA
////            A TRAVÉS DEL MODIFICADOR DE ACCESO
//            System.out.println(objetoExterna.x + objetoInterna.y);
        // CUANDO LA CLASE INTERNA ES STATIC
//            claseExterna.claseInterna objetoInterna = new claseExterna.claseInterna();
//            System.out.println(objetoInterna.y);
        // ACCEDIENDO A LOS ATRIBUTOS Y/O MÉTODOS DE LA CLASE EXTERNA
//        claseExterna objetoExterna = new claseExterna();
//        claseExterna.claseInterna objetoInterna = objetoExterna.new claseInterna();
//        System.out.println(objetoInterna.metodoInterno());
        // INTERFACES
//         cerdo objetoCerdo = new cerdo();
//         objetoCerdo.animalSound();
//         objetoCerdo.sleep();
//        MULTIPLES INTERFACES
//           multiplesInterfaces objetoMultiplesInterfaces = new multiplesInterfaces();
//           objetoMultiplesInterfaces.animalSound(); // INTERFAZ ANIMALES
//           objetoMultiplesInterfaces.baloncesto(); // INTERFAZ DEPORTES
        // ENTRADA DE USUARIO (SCANNER)
//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter username");
//
//        String userName = myObj.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input
//        En el siguiente ejemplo, usamos diferentes métodos para leer datos de varios tipos:
//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Enter name, age and salary:");
//
//        // String input
//        String name = myObj.nextLine();
//
//        // Numerical input
//        int age = myObj.nextInt();
//        double salary = myObj.nextDouble();
//
//        // Output input by user
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);
        // FECHAS
//            Mostrar fecha actual Para mostrar la fecha actual, importe la clase java.time.LocalDate y utilice su método now():
//            LocalDate myObj = LocalDate.now(); // Create a date object
//            System.out.println(myObj); // Display the current date
//        Mostrar hora actual Para mostrar la hora actual (hora, minuto, segundo y nanosegundos ), importe la clase java 
//                .time.LocalTime y utilice su método now():
//            LocalTime myObj = LocalTime.now();
//            System.out.println(myObj);
//            Mostrar fecha y hora actuales Para mostrar la fecha y la hora actuales, importe la clase java 
//                    .time.LocalDateTime y utilice su método now():
//        LocalDateTime myObj = LocalDateTime.now();
//        System.out.println(myObj);
        // formateo de fechas y horas
//        LocalDateTime myDateObj = LocalDateTime.now();
//        System.out.println("Before formatting: " + myDateObj);
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//
//        String formattedDate = myDateObj.format(myFormatObj);
//        System.out.println("After formatting: " + formattedDate);
        // ArrayList
//        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
//           La clase ArrayList tiene muchos métodos útiles.Por ejemplo, para agregar elementos a ArrayList, use el método add()
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//        System.out.println(cars.get(2)); // Para acceder a un elemento en ArrayList , use el método get() y consulte el número de índice
//        cars.set(1, "Mercedes"); // Para modificar un elemento, use el método set() y consulte el número de índice:
//        System.out.println(cars);
//        System.out.println(cars.remove(2)); // Para eliminar un elemento, utilice el método remove() y consulte el número de índice
//        System.out.println(cars);
////        cars.clear(); // Limpia la lista
//        System.out.println(cars);
//        System.out.println(cars.size()); // Devuelve el tamaño de la lista
//        Bucle a través de una ArrayList
//        Recorra los elementos de una ArrayList con un bucle for y utilice el método {size()}
//        para especificar cuántas veces debe ejecutarse el bucle
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println("Posición: " + i + " Valor: " + cars.get(i));
//            }
//        }
        // RECORRIENDO LA LISTA CON FOR-EACH
//        for (String i : cars) {
//            System.out.println(i);
//        }
//        Ordenar una ArrayList
//            Otra clase útil en el paquete java.util es la clase Collections, que incluye el método sort() para ordenar
//                listas alfabética o numéricamente
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//        Collections.sort(myNumbers);  // La ordena de menor a mayor
//        for (Integer i : myNumbers) {
//            System.out.println(i);
//        }
//        Java LinkedList
//        En el capítulo anterior, aprendiste sobre la clase ArrayList. La clase LinkedList es casi idéntica a ArrayList
//        LinkedList<String> cars = new LinkedList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//          HASHMAP
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London"); // EL Método put se utiliza para agregar elementos
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        //        System.out.println(capitalCities);
        //        System.out.println(capitalCities.get("England"));
        //        capitalCities.remove("Norway");
        //        System.out.println(capitalCities);
        ////        capitalCities.clear();
        //        System.out.println(capitalCities);
        //        System.out.println(capitalCities.size());

        //        Bucle a través de un HashMap
        //        Recorra los elementos de un HashMap con un bucle for-each. Nota: Usa el método keySet() si solo quieres las claves
        //        , y usa el método values() si solo quieres los valores:
        // Print keys
        //            for (String i : capitalCities.keySet()) { // Claves
        //            for (String i : capitalCities.values()) { // Valores
        //                System.out.println(i);
        //            }
        // Print keys and values
        //        for (String i : capitalCities.keySet()) {
        //            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        //        }
        //        Otros tipos
        //        Las claves y los valores en un HashMap son en realidad objetos
        //        . En los ejemplos anteriores, usamos objetos de tipo "String". Recuerda que un String en Java es un objeto(no un tipo primitivo
        //        ). Para usar otros tipos, como int
        //        , debe especificar una clase contenedora equivalente
        //        : Integer.Para otros tipos primitivos, use
        //        : Boolean para boolean
        //        , Character para char
        //        , Double para double, etc.
        //            // Create a HashMap object called people
        //            HashMap<String, Integer> people = new HashMap<String, Integer>();
        //
        //            // Add keys and values (Name, Age)
        //            people.put("John", 32);
        //            people.put("Steve", 30);
        //            people.put("Angie", 33);
        //
        //            for (String i : people.keySet()) {
        //                System.out.println("key: " + i + " value: " + people.get(i));
        //            }
        // HashSet
        //            HashSet<String> cars = new HashSet<String>();
        //            cars.add("Volvo");
        //            cars.add("BMW");
        //            cars.add("Ford");
        //            cars.add("BMW");
        //            cars.add("Mazda");
        //            System.out.println(cars);
        ////            Comprobar si existe un elemento Para comprobar si existe un elemento en un HashSet, utilice el método contains():
        //            System.out.println(cars.contains("Mazda"));
        //            cars.remove("Volvo");
        //            cars.clear();
        //            System.out.println(cars);
        // iterador
        //        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //        numbers.add(12);
        //        numbers.add(8);
        //        numbers.add(2);
        //        numbers.add(23);
        //        Iterator<Integer> it = numbers.iterator();
        //        while (it.hasNext()) {
        //            Integer i = it.next();
        //            if (i < 10) {
        //                it.remove();
        //            }
        //        }
        //        System.out.println(numbers);
        // CLASES CONTENEDORAS
        //        ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
        //        ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
        //        Creación de objetos de envoltorio (Wrapper Objects)
        //        Para crear un objeto contenedor, use la clase contenedora en lugar del tipo primitivo
        //        . Para obtener el valor, puede simplemente imprimir el objeto
        //        Integer myInt = 5; 
        //        Double myDouble = 5.99;
        //        Character myChar = 'A';
        //        System.out.println(myInt);
        //        System.out.println(myDouble);
        //        System.out.println(myChar);
        //        nota: SON CLASES CONTENEDORAS NO DATOS PRIMITIVOS

        //        Como ahora está trabajando con objetos, puede usar ciertos métodos para obtener información sobre el objeto específico.
        //        Por ejemplo, los siguientes métodos se utilizan para obtener el valor asociado con el objeto contenedor correspondiente:
        //        intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue() .
        //        Este ejemplo generará el mismo resultado que el ejemplo anterior:

        //          Integer myInt = 5;
        //          Double myDouble = 5.99;
        //          Character myChar = 'A';
        //          System.out.println(myInt.intValue());
        //          System.out.println(myDouble.doubleValue());
        //          System.out.println(myChar.charValue());

        //            Otro método útil es el método toString(), que se utiliza para convertir objetos envoltorios en cadenas.
        //            En el siguiente ejemplo, convertimos un entero en una cadena y usamos el método length() de la clase String
        //            para generar la longitud de la "cadena":
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());

    }
}
