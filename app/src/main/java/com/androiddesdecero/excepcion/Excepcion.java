package com.androiddesdecero.excepcion;

import android.util.Log;

/**
 * Created by albertopalomarrobledo on 5/2/19.
 */

public class Excepcion {
    /*
    Las Excepciones en java son errores en tiempo de ejecución.
    Es decir que cuando nuestro programa esta en marcha.
    Ejemplo de excepción
    1.- Dividir por cero
    2.- Cuando un objeto es null y no debería serlo.
    Este es un problema del día a día de los programadores,
    puesto que si ocurre una excepcion la ejecución de nuestro programa se para
     */

    public static void ejemploExcepcion(){
        /*
        Para manejar una excepción en Java hay tres palabras clave
         */

        try{
            //Vamos a intentar hacer este bloque de código
        }catch (Exception e){
            //Si hay un problema en el try pasamo a cachear la excepción
            //y la manejamos
        }finally {
            //Finalmente se ejecuta este codigo
        }

        /*
        Pero se puede hacer con solo un
        try{

        }finally{

        }
        ó
        try{

        }catch(Exception e){

        }
         */


        /*
        Primer Ejemplo Dividir por 0
         */

        try{
            //Vamos a intentar hacer este bloque de código
            double resultado = dividir(3,0);
        }catch (Exception e){
            //Si hay probelmas en try pasamos al Catch
            Log.d("TAG1", "Excepcion: " + e.getMessage());
        }finally {
            //Siempre se ejecuta, pero lo podemos obviar.
        }


        /*
        Ahora vamos a ver cuando nuestro codigo en try puede lanzar
        dos excepciones.
        Si pones NullPointerException solo vamos a cachear la excepcion
        null pointer, pero si hay por ejemplo otra excepción, por
        ejeplo la dividir por cero se nos cae el programa.
        Para ello hay dos soluciones.
        1. Hacer un Catch adicional por cada caso de excepcion
        2.- Tirar de la raíz de Excepciones
        Excepción -> Generaliza muchas excepciones.
        Tiene la ventaja que con un solo cacth las controlamos
         */
        Log.d("TAG1", "Comienzo");

        try{
            double resultado2 = dividir(3, 0);

            Integer numero3 = null;
            resultado2 = dividir(3, numero3);
        }catch (NullPointerException e){
            Log.d("TAG1", "Excepcion: " + e.getMessage());
        }catch (ArithmeticException e){
            Log.d("TAG1", "Excepcion: " + e.getMessage());
        }
        finally {
            //Finalmente se ejecuta este codigo
        }

        /*
        Throw y Throws
        Sirve para delegar una excepción a un metodo que esta en un
        nivel superior y gestionar la excepción más arriba.
         */

        metodoThrowNivel1();


    }

    private static double dividir(int numero1, int numero2){
        return numero1/numero2;
    }

    /*
    Throw y Throws
    Como delegar una excepción a un nivel superior
    Esto es muy importante a la hora de programar, puesto que al final
    queremos que el último bloque sea el que lo gestiona.
     */

    private static void metodoThrowNivel1(){
        try{
            metodoThrowNivel2();
        }catch (Exception e){
            Log.d("TAG1", "Nivel superior -> " + e.getMessage());
        }
    }

    /*
    Throws -> Es con Clase de Excepcion
    Thorw -> Es la instancia de la clase
     */
    private static void metodoThrowNivel2(){
        try{
            double resultado = 20/0;
        }catch (Exception e){
            //throw e -> Enviar la Excepcion a la capa superior
            throw e;
        }
    }
}
