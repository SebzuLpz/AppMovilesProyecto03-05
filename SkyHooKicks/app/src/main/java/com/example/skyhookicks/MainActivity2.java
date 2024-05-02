package com.example.skyhookicks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.google.android.material.button.MaterialButton;

import androidx.appcompat.widget.AppCompatImageButton;

public class MainActivity2 extends AppCompatActivity {
    Button iniciosesion;
    Button register;
    ImageButton casita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        iniciosesion = (Button) findViewById(R.id.iniciar);
        register = (Button)findViewById(R.id.register);
        casita = (ImageButton) findViewById(R.id.casita);

        if (iniciosesion!= null) {
            iniciosesion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity2.this, MainActivity.class);
                    if (i!= null) {
                        startActivity(i);
                        finish();
                    }
                }
            });
        }


        if (register!= null) {
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                    if (i!= null) {
                        startActivity(i);
                        finish();
                    }
                }
            });
        }

        if (casita!= null) {
            casita.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity2.this, MainActivity.class);
                    if (i!= null) {
                        startActivity(i);
                        finish();
                    }
                }
            });
        }
    }
}