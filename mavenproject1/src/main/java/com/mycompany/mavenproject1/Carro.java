/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author desarrollo
 */
// CLASE HIJA DE VEHÍCULO
public class Carro extends Vehiculo {

    // ABSTRACCIÓN
    @Override
    public void encender() {
        System.out.println("Enceder Carro");
    }

    @Override
    public void sentarse() {
        System.out.println("Sentarse Carro");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar Carro");
    }

    // HERENCIA
    protected String modelName = "Mustang";    // Car attribute

//    public String getModelName() {
//        return modelName;
//    }
}
