package com.example.a5alumno.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent myIntent = new Intent(this,SecondActivity.class); //declarar una intención de hacer algo, y quien va a empezar
        // startActivity(myIntent);

        startActivityForResult(myIntent,0);

       /* if (savedInstanceState!=null){
            setContentView(R.layout.activity_third);
        }
        this.setResult(Activity.RESULT_OK); //devolver de startActivityForResult(myIntent,0);
        this.finish();*/




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Toast.makeText(this,"Todo controlado, resultado devuelto",Toast.LENGTH_SHORT).show();
     //   Toast.makeText(this,data.,Toast.LENGTH_SHORT);
    }


}
