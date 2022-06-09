/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author desarrollo
 */
public class fechas {
    
}

/*
Fechas Java

Java no tiene una clase de fecha incorporada, pero podemos importar el paquete java.time para que
funcione con la API de fecha y hora. El paquete incluye muchas clases de fecha y hora. Por ejemplo:

Descripción de la clase
LocalDate Representa una fecha (año, mes, día (aaaa-MM-dd))
LocalTime Representa una hora (hora, minuto, segundo y nanosegundos (HH-mm-ss-ns))
LocalDateTime Representa tanto una fecha como una hora (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter Formateador para mostrar y analizar objetos de fecha y hora

Formateo de fecha y hora

La "T" en el ejemplo anterior se usa para separar la fecha de la hora. Puede usar la clase DateTimeFormatter con el método ofPattern() en el mismo
paquete para formatear o analizar objetos de fecha y hora. El siguiente ejemplo eliminará tanto la "T" como los nanosegundos de la fecha y hora:

El método ofPattern() acepta todo tipo de valores, si desea mostrar la fecha y la hora en un formato diferente. Por ejemplo:
Value 	Example 	Tryit
yyyy-MM-dd 	"1988-09-29" 	
dd/MM/yyyy 	"29/09/1988" 	
dd-MMM-yyyy 	"29-Sep-1988" 	
E, MMM dd yyyy 	"Thu, Sep 29 1988"

*/