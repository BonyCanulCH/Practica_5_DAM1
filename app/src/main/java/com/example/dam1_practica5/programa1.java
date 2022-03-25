package com.example.dam1_practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class programa1 extends AppCompatActivity {
    private EditText edtanio;
    private TextView mostraranio;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa1);
        edtanio = (EditText) findViewById(R.id.editA);
        mostraranio = (TextView) findViewById(R.id.txtabs2);
        back = (Button) findViewById(R.id.regresar);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(programa1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void calcanio (View view){
        String anio_String = edtanio.getText().toString();
        int anio_int = Integer.parseInt(anio_String);
        if (anio_int % 4 == 0 && (anio_int % 100 != 0 || anio_int % 400 == 0)){
            mostraranio.setText("El Año es Bisiesto");
        }else{
            mostraranio.setText("El Año NO es Bisiesto");
        }
    }
}