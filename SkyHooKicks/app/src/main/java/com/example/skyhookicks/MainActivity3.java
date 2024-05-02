package com.example.skyhookicks;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {
    ImageButton casita;
    Button iniciarsesion;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        iniciarsesion= (Button) findViewById(R.id.iniciar);
        iniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ( MainActivity3.this, MainActivity2.class);
                startActivity(i);

            }
        });
        register=(Button) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ( MainActivity3.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        casita=(ImageButton) findViewById(R.id.casita);
        casita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ( MainActivity3.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}