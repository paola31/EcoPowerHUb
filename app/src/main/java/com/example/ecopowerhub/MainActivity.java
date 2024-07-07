package com.example.ecopowerhub;

import androidx.appcompat.app.AppCompatActivity;
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
        setContentView(R.layout.activity_imprime_info);
    }

}