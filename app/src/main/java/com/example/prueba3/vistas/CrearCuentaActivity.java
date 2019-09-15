package com.example.prueba3.vistas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.prueba3.R;

public class CrearCuentaActivity extends AppCompatActivity {



   //Declarar componentes visuales
   private EditText etName, etPassword, etPasswordR;
   private Button btnRegistrar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);

        this.etName = findViewById(R.id.etName);
        this.etPassword = findViewById(R.id.etPassword);
        this.etPasswordR = findViewById(R.id.etPasswordR);
        this.btnRegistrar = findViewById(R.id.btnRegistrar);

        this.btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = etPassword.getText().toString().trim();
                String passwordR = etPasswordR.getText().toString().trim();


                if (!password.equals("") && password.equals(passwordR)){
                    Toast.makeText(getApplicationContext(), "Cuenta Creada",
                            Toast.LENGTH_SHORT).show();
                    finish();
                } else Toast.makeText(getApplicationContext(), "Error al crear la Cuenta",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
