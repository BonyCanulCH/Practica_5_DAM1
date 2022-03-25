package com.example.dam1_practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class programa2 extends AppCompatActivity {
    Button back;
    ImageView imv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa2);
        back = (Button) findViewById(R.id.regresar2);
        imv = (ImageView) findViewById(R.id.iv_activity_main);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(programa2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    float x, y, dx, dy;

    @Override
    public boolean onTouchEvent(MotionEvent event){
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            x = event.getX();
            y = event.getY();
        }
        if(event.getAction() == MotionEvent.ACTION_MOVE){
            dx = event.getX() - x;
            dy = event.getY() - y;

            imv.setX(imv.getX()+dx);
            imv.setY(imv.getX()+dy);

            x=event.getX();
            y=event.getY();
        }
        return super.onTouchEvent(event);
    }
}