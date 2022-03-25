package com.example.dam1_practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class programa4 extends AppCompatActivity {
    private EditText edtxt1, edtxt2, edtxt3, edtxt4, edtxt5;
    private TextView txtvmsj;
    //View boton;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa4);
        edtxt1 = (EditText) findViewById(R.id.editTN);
        edtxt2 = (EditText) findViewById(R.id.editTN2);
        edtxt3 = (EditText) findViewById(R.id.editTN3);
        edtxt4 = (EditText) findViewById(R.id.editTN4);
        edtxt5 = (EditText) findViewById(R.id.editTN5);
        txtvmsj = (TextView) findViewById(R.id.txtprom2);
        //boton = findViewById(R.id.btncalc2);
        //boton.setOnClickListener(this);

        back = (Button) findViewById(R.id.regresar4);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(programa4.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void calcpromedio (View view){
        String asignatura1_String = edtxt1.getText().toString();
        String asignatura2_String = edtxt2.getText().toString();
        String asignatura3_String = edtxt3.getText().toString();
        String asignatura4_String = edtxt4.getText().toString();
        String asignatura5_String = edtxt5.getText().toString();
        int asignatura1_int = Integer.parseInt(asignatura1_String);
        int asignatura2_int = Integer.parseInt(asignatura2_String);
        int asignatura3_int = Integer.parseInt(asignatura3_String);
        int asignatura4_int = Integer.parseInt(asignatura4_String);
        int asignatura5_int = Integer.parseInt(asignatura5_String);
        int prom = (asignatura1_int+asignatura2_int+asignatura3_int+asignatura4_int+asignatura5_int)/5;
        if (prom >= 90){
            txtvmsj.setText("Eres Buen Alumno, tu Promedio es "+prom);
        }else if(prom >= 80 && (prom < 90)){
            txtvmsj.setText("Vas Bien, pero debes Mejorar, tu Promedio es "+prom);
        }else if(prom >=70 && (prom < 80)){
            txtvmsj.setText("Estas Aprobando de Panzazo, tu Promedio es "+prom);
        }else if(prom < 70){
            txtvmsj.setText("Ya Fuiste..., tu Promedio es "+prom);
        }
    }
}