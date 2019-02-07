package com.androiddesdecero.excepcion;

/**
 * Created by albertopalomarrobledo on 7/2/19.
 */

/*
Las Excepciones Personalizadas nos permiten lanzar excepciones propias y
personalizadas.
Imaginemos una clase que pueden lanzar excepciones.
Tenemos un progroma que gestiona la velocidad máxima de coches,
y no vamos a permitir que se introduzca un valor superior a 300Km/h
 */

public class ExcepcionPersonalizada extends Exception {

    //Le pasamos el mensaje al constructor de la clase Excepcion
    public ExcepcionPersonalizada(String mensaje){
        super(mensaje);
    }
}
