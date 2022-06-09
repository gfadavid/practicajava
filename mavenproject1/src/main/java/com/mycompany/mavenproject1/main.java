package com.mycompany.mavenproject1;

//import java.util.Scanner; // IMPORTA SÓLO UNA CLASE DEL PAQUETE
import java.util.*; // IMPORTA TODAS LAS CLASES DEL PAQUETE

import java.time.LocalDate; // PAQUETE QUE FUNCIONA CON LA API DE FECHA Y HORA
import java.time.LocalTime; // PAQUETE QUE FUNCIONA CON LA API DE FECHA Y HORA
import java.time.LocalDateTime; // PAQUETE QUE FUNCIONA CON LA API DE FECHA Y HORA
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.ArrayList; // import the ArrayList class

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
           ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
    }
}
