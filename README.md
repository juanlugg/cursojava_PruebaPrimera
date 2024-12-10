# PRIMERA PRUEBA CURSO JAVA
## Juan Luis Guerra Gennich 10/12/2024

### Descripción
Proyecto que consiste en la utilización de la jerarquia de herencias donde heredarán de la clase Vehiculo e implementaran la interfaz Conducible.
Vehiculo tendrá las variables que luego heredarán las clases hijas (en este caso Coche y Camion) y las funcionalidades básicas que se necesita y que se ha 
implementado de la interfaz Conducible.

### Funcionalidades
* Interfaz Conducible:
    Contiene 4 funciones que tendrán toda clase que sea conducible, que en principio serán todas las clases que heredan de Vehiculo.
    Dos de las funciones tiene una variable de entrada que servirá para determinar la distancia en metros que estará la clase.
* Clase abstracta Vehiculo:
    Está clase será la clase padre de las demás, donde tendrá todas las variables y los setters y getters correspondientes.
    La variable matricula no tendrá un set porque una vez instanciado no será posible su cambio.
    toString(): Dará una pequeña descripción de los datos del vehiculo.
    arrancar(): El vehiculo se prepara para iniciar el movimiento.
    avanzar(int metros): El vehiculo avanzará x metros según se la indique.
    retroceder(int metros): El vehiculo retrocederá x metros según se le indique.
    parar(): El vehiculo finaliza el trayecto e indicará cuantos metros ha avanzado en total.
* Clase Coche:
    Está clase hereda de Vehiculo y sobreescribirá las funciones implementadas en dicha clase padre para dar un mensaje personalizado.
    Tendrá la variable N_RUEDAS que indica la cantidad de ruedas que tendrán absolutamente todos los coches, siendo cuatro en este caso.
* Clase Camión:
    Está clase hereda de la misma forma que Coche en la clase Vehiculo.
    Tendrá la variable N_RUEDAS que indica la cantidad de ruedas que tendrán absolutamente todos los camiones, siendo ocho en este caso.
    Tendrá una variable tacometro que será una lista de velocidades del recorrido del camión.
    
