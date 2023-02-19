package com.ugb.multiconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversorTiempo extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;

    conversorestime miConversor = new conversorestime();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_tiempo);
        btn = findViewById(R.id.btnConvertir5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (TextView) findViewById(R.id.txtcantidad);
                double cantidad = Double.parseDouble(temp.getText().toString());
                spn = findViewById(R.id.spn8);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spn9);
                int a = spn.getSelectedItemPosition();

                temp = findViewById(R.id.lblrespuesta);
                temp.setText("Respuesta: "+ miConversor.convertir(0, de, a, cantidad));

            }
        });
    }
}
class conversorestime{
    double[][] valores = {
            {1,60,0.01667,0.0006944,9.921E-5,2.282E-5,1.901E-6,1.901E-7,1.901E-8,60000},//tiempo
    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }

}



