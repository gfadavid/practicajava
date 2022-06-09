/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author desarrollo
 */
public class multiplesInterfaces implements animales, deportes {
    
    public void animalSound() {
        System.out.println("Cerdo: wee we");
    }
    
    public void sleep() {
        System.out.println("animal durmiendo");
    }
    
    public void baloncesto() {
        System.out.println("Baloncesto");
    }
    
}
