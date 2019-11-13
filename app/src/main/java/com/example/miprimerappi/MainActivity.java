package com.example.miprimerappi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnProductos;
    private Button btnAboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProductos=(Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnProductos.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
               // Log.i(Settings.INFO, "Productos");
                Intent i = new Intent(MainActivity.this, ProductListActivity.class);
                startActivity(i);
             }
        });
        btnAboutUs.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Log.i(Settings.INFO, "Productos");
               Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        }));
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
