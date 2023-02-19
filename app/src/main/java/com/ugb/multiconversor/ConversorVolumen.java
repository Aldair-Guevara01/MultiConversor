package com.ugb.multiconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversorVolumen extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;

    conversoresvlm miConversor = new conversoresvlm();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_volumen);
        btn = findViewById(R.id.btnConvertir3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (TextView) findViewById(R.id.txtcantidad);
                double cantidad = Double.parseDouble(temp.getText().toString());
                spn = findViewById(R.id.spn4);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spn5);
                int a = spn.getSelectedItemPosition();

                temp = findViewById(R.id.lblrespuesta);
                temp.setText("Respuesta: "+ miConversor.convertir(0, de, a, cantidad));

            }
        });
    }
}
class conversoresvlm{
    double[][] valores = {
            {1,1000,0.264172,4.16667,0.001,1000,2.11338,33.814,1.05669,0.001},//volumen
    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }
}
