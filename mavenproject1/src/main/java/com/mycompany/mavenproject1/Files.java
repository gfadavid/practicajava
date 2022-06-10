/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors



public class Files {
    
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    
}


/*
Archivos Java
El manejo de archivos es una parte importante de cualquier aplicación.
Java tiene varios métodos para crear, leer, actualizar y eliminar archivos.

Manejo de archivos Java
La clase File del paquete java.io, nos permite trabajar con archivos.

Para usar la clase File, cree un objeto de la clase y especifique el nombre del archivo o del directorio:

Manejo de archivos Java
La clase File del paquete java.io, nos permite trabajar con archivos.
Para usar la clase File, cree un objeto de la clase y especifique el nombre del archivo o del directorio:

La clase File tiene muchos métodos útiles para crear y obtener información sobre archivos. Por ejemplo:

La clase File tiene muchos métodos útiles para crear y obtener información sobre archivos. Por ejemplo:
Método Tipo Descripción
canRead() Boolean Prueba si el archivo es legible o no
canWrite() Boolean Prueba si el archivo es escribible o no
createNewFile() Booleano Crea un archivo vacío
delete() Booleano Elimina un archivo
existe() Booleano Prueba si el archivo existe
getName() Cadena Devuelve el nombre del archivo
getAbsolutePath() String Devuelve la ruta absoluta del archivo
length() Long Devuelve el tamaño del archivo en bytes
list() String[] Devuelve una matriz de los archivos en el directorio
mkdir() Booleano Crea un directorio

Crear un archivo

Para crear un archivo en Java, puede usar el método createNewFile(). Este método devuelve un valor booleano: verdadero si
el archivo se creó correctamente y falso si el archivo ya existe. Tenga en cuenta que el método está encerrado en un bloque
try...catch. Esto es necesario porque lanza una IOException si ocurre un error (si el archivo no se puede crear por alguna razón)
*/