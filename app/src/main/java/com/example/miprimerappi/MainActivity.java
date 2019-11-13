package com.example.miprimerappi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume(){
        super.onResume(); //Este codigo se ejecuta antes de todo.
        //En este punto la app ya cargo.

        //This es un activity: Es la esencia de una pantalla
        //This es de tipo contexto

        Toast.makeText(this, "Aplicacion iniciada", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Aplicacion Stopeada", Toast.LENGTH_SHORT).show();
    }
    
}
