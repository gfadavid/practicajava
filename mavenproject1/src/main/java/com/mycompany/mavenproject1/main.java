
package com.mycompany.mavenproject1;


public class main {
  
  public static void main(String[] args) {
      
      // ABSTRACCIÓN
//      Moto moto = new Moto();
//      moto.acelerar();
//      
//      
//      Carro carro = new Carro();
//      carro.acelerar();

      // ENCAPSULACIÓN
//      Person myObj = new Person();
//      myObj.name = "John";  // error (Porque no se puede acceder a una variable con el modificador "privatte")
//      System.out.println(myObj.name); // error  (desde orta clase como es éste el caso)
        
//      En su lugar, usamos los métodos getName() y setName() para acceder y actualizar la variable:
        Person myObj = new Person();
        myObj.setName("Ángel"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
  }
}