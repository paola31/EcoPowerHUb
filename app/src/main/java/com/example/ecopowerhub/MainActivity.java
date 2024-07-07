package com.example.ecopowerhub;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecopowerhub.imprimeInfo;

import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    private EditText nombre;
    private EditText direccion;
    private EditText correo;
    private Button consumo;
    private TextView ecopower;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombrecompleto);
        direccion = findViewById(R.id.direccion);
        correo = findViewById(R.id.correo);
        consumo = findViewById(R.id.conocetuconsumo);
        ecopower = findViewById(R.id.EcoPowerHub);

        consumo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onClickConsumo(v);
            }
        });
    }


    private void onClickConsumo(View v)
    {
        // Capture the input data
        String nombreInput = nombre.getText().toString();
        String direccionInput = direccion.getText().toString();
        String correoInput = correo.getText().toString();

        // Create an Intent to start the new activity
        Intent intent = new Intent(MainActivity.this, imprimeInfo.class);

        // Put the captured data into the Intent
        intent.putExtra("nombredelusuario", nombreInput);
        intent.putExtra("direccion", direccionInput);
        intent.putExtra("correo", correoInput);

        // Start the new activity
        startActivity(intent);
    }

}