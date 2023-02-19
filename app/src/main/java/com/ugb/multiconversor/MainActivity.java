package com.ugb.multiconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button monedas;
    Button masa;
    Button volumen;
    Button longitud;
    Button tiempo;
    Button almacenamiento;
    Button transferenciadatos;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monedas = (Button) findViewById(R.id.btnmonedas);
        monedas.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent monedas = new Intent(MainActivity.this,ConversorMonedas.class);
                startActivity(monedas);
            }
        });
        masa = (Button) findViewById(R.id.btnmasa);
        masa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masa = new Intent(MainActivity.this,ConversorMasa.class);
                startActivity(masa);
            }
        });

        volumen = (Button) findViewById(R.id.btnvolumen);
        volumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volumen = new Intent(MainActivity.this,ConversorVolumen.class);
                startActivity(volumen);
            }
        });

        longitud = (Button) findViewById(R.id.btnlongitud);
        longitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent longitud = new Intent(MainActivity.this,ConversorLongitud.class);
                startActivity(longitud);
            }
        });

        tiempo = (Button) findViewById(R.id.btntiempo);
        tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tiempo = new Intent(MainActivity.this,ConversorTiempo.class);
                startActivity(tiempo);
            }
        });

        almacenamiento = (Button) findViewById(R.id.btnalmacenamiento);
        almacenamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent almacenamiento = new Intent(MainActivity.this,ConversorAlmacenamiento.class);
                startActivity(almacenamiento);
            }
        });

        transferenciadatos = (Button) findViewById(R.id.btntransferenciadatos);
        transferenciadatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transferenciadatos = new Intent(MainActivity.this,ConversorTransferenciaDatos.class);
                startActivity(transferenciadatos);
            }
        });



    }

}