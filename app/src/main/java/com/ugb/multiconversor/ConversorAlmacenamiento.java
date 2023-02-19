package com.ugb.multiconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversorAlmacenamiento extends AppCompatActivity {

    Button btn;
    TextView temp;
    Spinner spn;

    conversoresalm miConversor = new conversoresalm();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_almacenamiento);
        btn = findViewById(R.id.btnConvertir6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (TextView) findViewById(R.id.txtcantidad);
                double cantidad = Double.parseDouble(temp.getText().toString());
                spn = findViewById(R.id.spn10);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spn11);
                int a = spn.getSelectedItemPosition();

                temp = findViewById(R.id.lblrespuesta);
                temp.setText("Respuesta: "+ miConversor.convertir(0, de, a, cantidad));

            }
        });
    }
}
class conversoresalm{
    double[][] valores = {
            {1,1000000,1000,976.563,0.953674,0.001,0.000931323,1e-6,9.0949e-7,1e-9,8.8818e-10},//almacenamiento
    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }

}
