package com.example.dam1_practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.boton1);
        btn2=(Button) findViewById(R.id.boton2);
        btn3=(Button) findViewById(R.id.boton3);
        btn4=(Button) findViewById(R.id.boton4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Funcion del boton 1
                Intent intent = new Intent(MainActivity.this,programa1.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Funcion del boton 2
                Intent intent = new Intent(MainActivity.this,programa2.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Funcion del boton 3
                Intent intent = new Intent(MainActivity.this,programa3.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Funcion del boton 4
                Intent intent = new Intent(MainActivity.this,programa4.class);
                startActivity(intent);
            }
        });
    }
}