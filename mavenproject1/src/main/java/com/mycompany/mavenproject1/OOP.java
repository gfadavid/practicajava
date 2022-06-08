/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author desarrollo
 */

// PARA CREAR UNA CLASE SE UTILIZA LA PALABRA RESERVADA "class". ADEMÁS DE COMENZAR CON LA PRIMERA LETRA EN MAYÚCULA Y TAMBIÉN COINCIDIR CON EL NOMBRE EDL ARCHIVO
//.java
public class OOP {
    
    int x = 789;
    int y = 3;
    final int z = 400; // UTILIZO "FINAL" (QUE ES UN MODIFICADOR) PARA NO PERMITER QUE PUEDAN MODICAR EL VALOR ASIGNADO
    
}

    /*
        APUNTES:
Java - ¿Qué es la programación orientada a objetos?

OOP significa Programación Orientada a Objetos.

La programación procedimental se trata de escribir procedimientos o métodos que realizan operaciones en los datos, mientras que la programación
    orientada a objetos se trata de crear objetos que contienen tanto datos como métodos.

La programación orientada a objetos tiene varias ventajas sobre la programación procedimental:

     OOP es más rápido y más fácil de ejecutar
     OOP proporciona una estructura clara para los programas.
     OOP ayuda a mantener el código Java (DRY) "No se repita", y hace que el código sea más fácil de mantener, modificar y depurar
     OOP hace posible crear aplicaciones reutilizables completas con menos código y un tiempo de desarrollo más corto

Sugerencia: el principio "No se repita" (DRY) se trata de reducir la repetición del código. Debe extraer los códigos que son comunes
    para la aplicación, colocarlos en un solo lugar y reutilizarlos en lugar de repetirlos.

Java: ¿Qué son las clases y los objetos?

Las clases y los objetos son los dos aspectos principales de la programación orientada a objetos.
Entonces, una clase es una plantilla para objetos y un objeto es una instancia de una clase.
Cuando se crean los objetos individuales, heredan todas las variables y métodos de la clase.

Clases/Objetos Java

Java es un lenguaje de programación orientado a objetos. Todo en Java está asociado con clases y objetos, junto con sus atributos y métodos.
Por ejemplo: en la vida real, un automóvil es un objeto. El automóvil tiene atributos, como el peso y el color, y métodos, como la conducción y el freno.
Una clase es como un constructor de objetos o un "modelo" para crear objetos.

Crear un objeto

En Java, un objeto se crea a partir de una clase. Ya hemos creado la clase llamada Main, por lo que ahora podemos usarla para crear objetos.
Para crear un objeto de OOP, especifique el nombre de la clase, seguido del nombre del objeto y use la palabra clave new:

Atributos de clase de Java

En el capítulo anterior, usamos el término "variable" para x en el ejemplo (como se muestra a continuación). En realidad es un
atributo de la clase. O podría decir que los atributos de clase son variables dentro de una clase
Otro término para atributos de clase es campos.

Modify Attributes

También puede modificar los valores de los atributos O anular los valores existentes
Si no desea tener la capacidad de anular los valores existentes, declare el atributo como final

Objetos Múltiples

Si crea varios objetos de una clase, puede cambiar los valores de atributo en un objeto, sin afectar los valores de
atributo en el otro

Puede especificar tantos atributos como desee

Java - ¿Qué es la programación orientada a objetos?

OOP significa Programación Orientada a Objetos.

La programación procedimental se trata de escribir procedimientos o métodos que realizan operaciones en los datos, mientras que la programación orientada a objetos se trata de crear objetos que contienen tanto datos como métodos.

La programación orientada a objetos tiene varias ventajas sobre la programación procedimental:

    OOP es más rápido y más fácil de ejecutar
    OOP proporciona una estructura clara para los programas.
    OOP ayuda a mantener el código Java SECO "No se repita", y hace que el código sea más fácil de mantener, modificar y depurar
    OOP hace posible crear aplicaciones reutilizables completas con menos código y un tiempo de desarrollo más corto

Sugerencia: el principio "No se repita" (DRY) se trata de reducir la repetición del código. Debe extraer los códigos que son comunes para la aplicación, colocarlos en un solo lugar y reutilizarlos en lugar de repetirlos.

Java: ¿Qué son las clases y los objetos?

Las clases y los objetos son los dos aspectos principales de la programación orientada a objetos.

Mire la siguiente ilustración para ver la diferencia entre clase y objetos:

Entonces, una clase es una plantilla para objetos y un objeto es una instancia de una clase.

Cuando se crean los objetos individuales, heredan todas las variables y métodos de la clase.

Aprenderá mucho más sobre clases y objetos en el próximo capítulo.

Clases/Objetos Java

Java es un lenguaje de programación orientado a objetos.

Todo en Java está asociado con clases y objetos, junto con sus atributos y métodos. Por ejemplo: en la vida real, un automóvil es un objeto. El automóvil tiene atributos, como el peso y el color, y métodos, como la conducción y el freno.

Una clase es como un constructor de objetos o un "modelo" para crear objetos.

Crear una clase

Para crear una clase, use la palabra clave clase:
Recuerde del capítulo Sintaxis de Java que una clase siempre debe comenzar con una primera letra mayúscula y que el nombre del archivo java debe coincidir con el nombre de la clase.

Crear un objeto

En Java, un objeto se crea a partir de una clase. Ya hemos creado la clase llamada Main, por lo que
ahora podemos usarla para crear objetos.

Para crear un objeto de Main, especifique el nombre de la clase, seguido del nombre del objeto y use la palabra clave new:

Uso de varias clases

También puede crear un objeto de una clase y acceder a él en otra clase. Esto se usa a menudo para
una mejor organización de las clases (una clase tiene todos los atributos y métodos, mientras que la otra clase
contiene el método main() (código a ejecutar)).

Recuerde que el nombre del archivo java debe coincidir con el nombre de la clase. En este ejemplo, hemos creado dos archivos en el mismo directorio/carpeta:

Atributos de clase de Java

En el capítulo anterior, usamos el término "variable" para x en el ejemplo (como se muestra a continuación). En realidad es un atributo de la clase. O podría decir que los atributos de clase son variables dentro de una clase:

Cree una clase llamada "Principal" con dos atributos: x e y:

Otro término para atributos de clase es campos.

Accediendo a los Atributos

Puede acceder a los atributos creando un objeto de la clase y usando la sintaxis de punto (.):

El siguiente ejemplo creará un objeto de la clase Main, con el nombre myObj. Usamos el atributo x en el objeto para imprimir su valor:

Si no desea tener la capacidad de anular los valores existentes, declare el atributo como final:
También puede modificar los valores de los atributos:
O anular los valores existentes:
Si no desea tener la capacidad de anular los valores existentes, declare el atributo como final:

no poder



La palabra clave final es útil cuando desea que una variable almacene siempre el mismo valor, como PI (3.14159...).

La palabra clave final se llama "modificador". Aprenderá más sobre estos en el capítulo Modificadores de Java.

Objetos Múltiples

Si crea varios objetos de una clase, puede cambiar los valores de atributo en un objeto, sin afectar los valores de atributo en el otro:

Atributos Múltiples

Puede especificar tantos atributos como desee:
Atributos Múltiples

Puede especificar tantos atributos como desee:

Métodos de clase Java

En el capítulo Métodos de Java, aprendió que los métodos se declaran dentro de una clase y que se utilizan para
realizar ciertas acciones:

Estático vs no estático

A menudo verá programas Java que tienen atributos y métodos estáticos o públicos.

En el ejemplo anterior, creamos un método estático, lo que significa que se puede acceder a él sin crear un objeto de la clase, a diferencia de public, al que solo pueden acceder los objetos:

Un ejemplo para demostrar las diferencias entre los métodos estáticos y públicos:

El punto (.) se utiliza para acceder a los atributos y métodos del objeto.

Constructores Java

Un constructor en Java es un método especial que se usa para inicializar objetos. Se llama al constructor cuando se crea un
objeto de una clase. Se puede utilizar para establecer valores iniciales para atributos de objetos.
Puedes tener tantos parámetros como quieras:

Tenga en cuenta que el nombre del constructor debe coincidir con el nombre de la clase y no puede tener un tipo de retorno (como void).
También tenga en cuenta que se llama al constructor cuando se crea el objeto.
Todas las clases tienen constructores por defecto: si no crea un constructor de clase usted mismo, Java crea uno para usted. Sin embargo, no podrá

establecer valores iniciales para los atributos del objeto.

modificadores

A estas alturas, está bastante familiarizado con la palabra clave pública que aparece en casi todos nuestros ejemplos

public class Main

La palabra clave pública es un modificador de acceso, lo que significa que se utiliza para establecer el nivel de acceso para clases,
atributos, métodos y constructores.

Dividimos los modificadores en dos grupos:

     Modificadores de acceso: controla el nivel de acceso
     Modificadores sin acceso (Non-Access Modifiers): no controlan el nivel de acceso, pero proporcionan otra funcionalidad

Modificadores de acceso

Para las clases, puede usar public o default:
Modificador Descripción 
public La clase es accesible por cualquier otra clase
default La clase solo es accesible por clases en el mismo paquete. Esto se usa cuando no especifica un modificador.

Para atributos, métodos y constructores, puede usar uno de los siguientes:
Modificador Descripción
public El código es accesible para todas las clases.
private El código solo es accesible dentro de la clase declarada
default El código solo es accesible en el mismo paquete. Esto se usa cuando no especifica un modificador. Aprenderá más sobre los paquetes en el capítulo Paquetes
protected El código es accesible en el mismo paquete y subclases. Aprenderá más sobre subclases y superclases en el capítulo Herencia.

Modificadores de no acceso

Para las clases, puede usar final o abstract:

Modificador Descripción
final La clase no puede ser heredada por otras clases
abstract La clase no se puede usar para crear objetos (para acceder a una clase abstracta, debe heredarse de otra clase)

Para atributos y métodos, puede utilizar uno de los siguientes:

Modificador Descripción
final Los atributos y métodos finales no se pueden anular/modificar
static Los atributos y métodos estáticos pertenecen a la clase, en lugar de un objeto
abstract Solo se puede usar en una clase abstracta y solo se puede usar en métodos. El método no tiene cuerpo, por ejemplo, abstract void run();. El cuerpo lo proporciona la subclase (heredada de). Aprenderá más sobre la herencia y la abstracción en los capítulos Herencia y Abstracción.
transient Los atributos y métodos transitorios se omiten al serializar el objeto que los contiene.
synchronized Los métodos sincronizados solo pueden ser accedidos por un subproceso a la vez
volatile El valor de un atributo no se almacena en caché localmente y siempre se lee desde la "memoria principal"
*/
