package com.ugb.multiconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversorLongitud extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;

    conversoreslgt miConversor = new conversoreslgt();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_longitud);
        btn = findViewById(R.id.btnConvertir4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (TextView) findViewById(R.id.txtcantidad);
                double cantidad = Double.parseDouble(temp.getText().toString());
                spn = findViewById(R.id.spn6);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spn7);
                int a = spn.getSelectedItemPosition();

                temp = findViewById(R.id.lblrespuesta);
                temp.setText("Respuesta: "+ miConversor.convertir(0, de, a, cantidad));

            }
        });
    }
}
class conversoreslgt{
    double[][] valores = {
            {1,100,0.001,1000,1e+6,0.000621371,1.09361,3.28084,39.3701,0.000539957},//Longitud
    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }

    }
