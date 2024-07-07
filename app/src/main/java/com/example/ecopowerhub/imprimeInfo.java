package com.example.ecopowerhub;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class imprimeInfo extends AppCompatActivity
{
    private Button consumoActual;
    private TextView consumo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imprime_info);
        consumoActual = findViewById(R.id.consumoActual);

        consumoActual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onClickConsumoActual(v);
            }
        });
        consumo = findViewById(R.id.MostrarInfoConsumo);

        // Retrieve the data from the Intent
        String nombre = getIntent().getStringExtra("nombredelusuario");
        String direccion = getIntent().getStringExtra("direccion");
        String correo = getIntent().getStringExtra("correo");

        // Find the TextView and set the retrieved data
        TextView mostrarInfoTextView = findViewById(R.id.MostrarInfo);
        mostrarInfoTextView.setText("Nombre: " + nombre + "\nDirección: " + direccion + "\nCorreo: " + correo);
        consumo.setText("Tú consumo del mes de Noviembre es: 370 Kwh");
    }

    private void onClickConsumoActual(View v)
    {
        Consumo consumoData = new Consumo("Junio", 1500);
        consumo.setText("");
        consumo.setText("Tú consumo del mes " +  consumoData.getMes() + " es: \n" + consumoData.getEnergia() + " Kwh");
    }


}