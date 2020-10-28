
/**
 * Crear un proyecto nuevo llamado P009_VehiculosDeCiudad. Dentro de dicho
 * proyecto crearemos la siguiente jerarquía de paquetes: •
 * Com.ipartek.interfaces • Com.ipartek.clases • Com.ipartek.principal Una vez
 * creada esta jerarquía, se procederá a crear una interfaz llamada Vehiculo.
 * Dicha interfaz tendrá las siguientes constantes: • VEL_MAX_COCHE=150 •
 * VEL_MAX_BICI=50 • VEL_MAX_PATINETE=80. Asimismo también contendrá la
 * definición de los siguientes métodos • Arrancar() • Acelerar(int
 * incrementoVel) • Frenar(int decrementoVel) • Apagar() Una vez creada se
 * creara una clase patinete, con los atributos velocidadActual (int) y
 * estaArrancado (boolean) y el método toString(), que implementara la interfaz
 * vehiculo. Dicha clase redefinirá los métodos anteriores para que realicen las
 * siguientes tareas • Arrancar: pondrá el atributo estaArrancado a true. Debe
 * estar apagado para poder arrancarse • Acelerar: incrementara la velocidad
 * actual con el valor que se le pasa por parámetro sin sobrepasar el limite
 * máximo de velocidad. Solo acelerara si el patinete esta encendido • Frenar:
 * decrementara la velocidad actual con el valor que se le pasa por parámetro
 * sin llegar a bajar de 0. Solo frenara si el patinete esta encendido • Apagar:
 * pondrá el atributo estaArrancado a false, solo si la velocidadActual es 0 •
 * toString: mostrara una cadena de texto con el siguiente formato: “Soy un
 * patinete, estoy (encendido/apagado) y mi velocidad es de (velocidadActual)
 * Km/h” De la misma manera que se ha creado una clase patinete, se crearan dos
 * clases llamadas Bici y Coche, con los mismos atributos. También definirán los
 * mismos métodos de la interfaz En un programa principal, se probaran los
 * métodos con los tres objetos de cada tipo de vehiculo, arrancándolos,
 * acelerando varias veces hasta que lleguen a velocidad máxima, frenando hasta
 * detenerse en varias veces y apagándose. El proceso deberá seguir la lógica
 * del mundo real. No se podrá apagar si ya está encendido, no podrá acelerar ni
 * frenar si esta apagado… realizar las modificaciones pertinentes en el
 * programa para que los atributos arrancado y velocidadActual se hereden de una
 * clase vehiculo, y que no se pueda heredar de las clases patinete bici y coche
 * 
 */
package com.ipartek.ejercicios.interfaces.app.clases;