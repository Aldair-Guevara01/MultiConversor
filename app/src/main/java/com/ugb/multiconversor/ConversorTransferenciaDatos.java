package com.ugb.multiconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversorTransferenciaDatos extends AppCompatActivity {

    Button btn;
    TextView temp;
    Spinner spn;

    conversorestfd miConversor = new conversorestfd();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_transferencia_datos);
        btn = findViewById(R.id.btnConvertir7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (TextView) findViewById(R.id.txtcantidad);
                double cantidad = Double.parseDouble(temp.getText().toString());
                spn = findViewById(R.id.spn12);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spn13);
                int a = spn.getSelectedItemPosition();

                temp = findViewById(R.id.lblrespuesta);
                temp.setText("Respuesta: "+ miConversor.convertir(0, de, a, cantidad));

            }
        });
    }
}
class conversorestfd{
    double[][] valores = {
            {1,0.001,0.000001,1e-9,1e-12,1e-15,1e-18,1e-21,1.0000000000000001e-24,8},//transferencia de datos
    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }

}

