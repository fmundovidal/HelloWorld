package com.example.a5alumno.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends Activity {

    private static final String TAG = SecondActivity.class.getSimpleName(); //Se crea para debugear, devuelve un nombre sencillo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       /* Intent myIntent = new Intent(this,MainActivity.class); //declarar una intención de hacer algo, y quien va a empezar
       // startActivity(myIntent);

        startActivityForResult(myIntent,0);
        //startActivity(new Intent(this,MainActivity.class)); // segunda forma*/

        //Log.e(SecondActivity.TAG,savedInstanceState==null ? "is null":"not null"); //en una línea un if/else, si saveInstanceState es null sale lo primero, sino lo segundo
        /*if savedInstanceState.equals(null)
             System.out.println("is null");
          else
            System.out.println("not null");


        */

        Intent resultIntent = new Intent();
        resultIntent.putExtra("returnValue","string value");

        setResult(Activity.RESULT_OK,resultIntent);
        finish();

       /* Log.e(SecondActivity.TAG,"onCreate()"); //Enseñar en el log
        Toast.makeText(this,"onCreate()",Toast.LENGTH_SHORT).show();  //enseñar en pantalla del dispositivo*/
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e(SecondActivity.TAG,"onStart()"); //Enseñar en el log
        Toast.makeText(this,"onStart()",Toast.LENGTH_SHORT).show();  //enseñar en pantalla del dispositivo
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(SecondActivity.TAG,"onResume()"); //Enseñar en el log
        Toast.makeText(this,"onResume()",Toast.LENGTH_SHORT).show();  //enseñar en pantalla del dispositivo
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(SecondActivity.TAG,"onPause()"); //Enseñar en el log
        Toast.makeText(this,"onPause()",Toast.LENGTH_SHORT).show();  //enseñar en pantalla del dispositivo
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(SecondActivity.TAG,"onStop()"); //Enseñar en el log
        Toast.makeText(this,"onStop()",Toast.LENGTH_SHORT).show();  //enseñar en pantalla del dispositivo
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(SecondActivity.TAG,"onRestart()"); //Enseñar en el log
        Toast.makeText(this,"onRestart()",Toast.LENGTH_SHORT).show();  //enseñar en pantalla del dispositivo
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(SecondActivity.TAG,"onDestroy()"); //Enseñar en el log
        Toast.makeText(this,"onDestroy()",Toast.LENGTH_SHORT).show();  //enseñar en pantalla del dispositivo
    }

  /*  @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(SecondActivity.TAG,"onSaveInstantState()"); //Enseñar en el log
        Toast.makeText(this,"onSaveInstantState()",Toast.LENGTH_SHORT).show();  //enseñar en pantalla del dispositivo

        outState.putString("myString","Hello World");

    }*/

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Toast.makeText(this,"Todo controlado, resultado devuelto",Toast.LENGTH_SHORT).show();
    }*/
}
