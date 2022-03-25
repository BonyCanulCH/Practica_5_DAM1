package com.example.dam1_practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class programa3 extends AppCompatActivity implements View.OnClickListener{
    TextView txtvT1, txtvOutput; //Creación de objetos
    EditText result;
    View button;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa3);

        txtvT1 = (TextView) findViewById(R.id.txtv1);
        txtvOutput = (TextView) findViewById(R.id.txtv2);
        result = (EditText) findViewById(R.id.tabla);
        button = findViewById(R.id.btncalc);
        button.setOnClickListener(this);

        back = (Button) findViewById(R.id.regresar3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(programa3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view){
        String sda; //variable Salida para almacenar los valores de la tabla temporalmente
        int resp; //Variable Resultado
        txtvOutput.setText("");
        String variable = result.getText() .toString(); //convertir a string
        int numtabla = Integer.parseInt(variable); //convertir variable string a entero

        for(int i=1; i<=10; i++){
            resp = numtabla * i; //realiza la multiplicacion
            sda = numtabla + "*" + i + " = " +resp;
            txtvOutput.append("\n"+sda); //Mostrar los resultados con formato
        }

    }
}