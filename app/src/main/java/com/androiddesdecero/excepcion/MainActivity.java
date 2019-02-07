package com.androiddesdecero.excepcion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Excepcion.ejemploExcepcion();




        /*
        ExcepcionesPersonalizadas
         */
        int velocidad = 304;
        try{
            if(velocidad<300){
                Log.d("TAG1", "velocidad aceptada");
            }else{
                throw new ExcepcionPersonalizada("Velocidad no aceptada");
            }
        }catch (Exception e){
            Log.d("TAG1", e.getMessage());
        }
    }
}
