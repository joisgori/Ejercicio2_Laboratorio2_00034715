package com.example.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private GridLayout grid1;

    private ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ahora debo buscar por referencias de ID's cada uno de mis objetos...
        grid1 = findViewById(R.id.Grid1);
        i1 = findViewById(R.id.I1);
        i2 = findViewById(R.id.I2);
        i3 = findViewById(R.id.I3);
        i4 = findViewById(R.id.I4);
        i5 = findViewById(R.id.I5);
        i6 = findViewById(R.id.I6);
        i7 = findViewById(R.id.I7);
        i8 = findViewById(R.id.I8);
        i9 = findViewById(R.id.I9);

        //Ahora defino los eventos de los clicks...
        //Estos será para la pelota, tanto, uno, cinco y nueve
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setImageResource(R.drawable.pelota);
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i5.setImageResource(R.drawable.pelota);
            }
        });

        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i9.setImageResource(R.drawable.pelota);
            }
        });

        //Voy con 2, 6 y 7
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i2.setImageResource(R.drawable.perro);
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i6.setImageResource(R.drawable.perro);
            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i7.setImageResource(R.drawable.perro);
            }
        });

        //Voy con 3, 4 y 8
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3.setImageResource(R.drawable.gato);
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i4.setImageResource(R.drawable.gato);
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i8.setImageResource(R.drawable.gato);
            }
        });


    }
}
