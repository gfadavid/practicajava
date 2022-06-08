/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author desarrollo
 */
public class Moto extends Vehiculo{

    @Override
    public void encender() {
        System.out.println("Encender Moto");
    }

    @Override
    public void sentarse() {
       System.out.println("Sentarse Moto");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar Moto");
    }
    
}
