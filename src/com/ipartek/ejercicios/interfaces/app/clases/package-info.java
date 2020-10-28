
/**
 * Crear un proyecto nuevo llamado P009_VehiculosDeCiudad. Dentro de dicho
 * proyecto crearemos la siguiente jerarqu�a de paquetes: �
 * Com.ipartek.interfaces � Com.ipartek.clases � Com.ipartek.principal Una vez
 * creada esta jerarqu�a, se proceder� a crear una interfaz llamada Vehiculo.
 * Dicha interfaz tendr� las siguientes constantes: � VEL_MAX_COCHE=150 �
 * VEL_MAX_BICI=50 � VEL_MAX_PATINETE=80. Asimismo tambi�n contendr� la
 * definici�n de los siguientes m�todos � Arrancar() � Acelerar(int
 * incrementoVel) � Frenar(int decrementoVel) � Apagar() Una vez creada se
 * creara una clase patinete, con los atributos velocidadActual (int) y
 * estaArrancado (boolean) y el m�todo toString(), que implementara la interfaz
 * vehiculo. Dicha clase redefinir� los m�todos anteriores para que realicen las
 * siguientes tareas � Arrancar: pondr� el atributo estaArrancado a true. Debe
 * estar apagado para poder arrancarse � Acelerar: incrementara la velocidad
 * actual con el valor que se le pasa por par�metro sin sobrepasar el limite
 * m�ximo de velocidad. Solo acelerara si el patinete esta encendido � Frenar:
 * decrementara la velocidad actual con el valor que se le pasa por par�metro
 * sin llegar a bajar de 0. Solo frenara si el patinete esta encendido � Apagar:
 * pondr� el atributo estaArrancado a false, solo si la velocidadActual es 0 �
 * toString: mostrara una cadena de texto con el siguiente formato: �Soy un
 * patinete, estoy (encendido/apagado) y mi velocidad es de (velocidadActual)
 * Km/h� De la misma manera que se ha creado una clase patinete, se crearan dos
 * clases llamadas Bici y Coche, con los mismos atributos. Tambi�n definir�n los
 * mismos m�todos de la interfaz En un programa principal, se probaran los
 * m�todos con los tres objetos de cada tipo de vehiculo, arranc�ndolos,
 * acelerando varias veces hasta que lleguen a velocidad m�xima, frenando hasta
 * detenerse en varias veces y apag�ndose. El proceso deber� seguir la l�gica
 * del mundo real. No se podr� apagar si ya est� encendido, no podr� acelerar ni
 * frenar si esta apagado� realizar las modificaciones pertinentes en el
 * programa para que los atributos arrancado y velocidadActual se hereden de una
 * clase vehiculo, y que no se pueda heredar de las clases patinete bici y coche
 * 
 */
package com.ipartek.ejercicios.interfaces.app.clases;