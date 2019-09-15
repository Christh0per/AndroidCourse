package com.example.prueba3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prueba3.vistas.CrearCuentaActivity;

public class MainActivity extends AppCompatActivity {

    //Declarar componentes visuales
    private EditText etNombre, etPassword;
    private Button btIngresar;
    private TextView tvCrearCuenta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.etNombre = findViewById(R.id.etNombre);
        this.etPassword = findViewById(R.id.etPassword);
        this.btIngresar = findViewById(R.id.btIngresar);
        this.tvCrearCuenta = findViewById(R.id.tvCrearCuenta);

        //Definir un listener para le evento click sobre el boton

        this.btIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Obtener datos ingresados por el usuario

                String nombre = etNombre.getText().toString();
                String password = etPassword.getText().toString();
                String nombreVolteado = "";

                //Mostrar el dato
                for (int i = nombre.length()-1; i>=0; i--){
                    nombreVolteado += nombre.charAt(i);
                }

                if (password.equals(nombreVolteado)){
                    tvCrearCuenta.setText("Correcto");
                }else{
                    tvCrearCuenta.setText("La contraseña debe ser el nombre de usuario volteado");
                }

                //Segunda, mostrar dato al usuario, temporal
                Toast.makeText(getApplicationContext(), "Su nombre es " + nombre, Toast.LENGTH_SHORT).show();

                //Tercera, mostrar datos al desarrollador (Logcat)
                Log.i("PRUEBA", "El nombre de usuario es " + nombre);

            }
        });

        this.tvCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Abrir una nueva Activity
                Intent nuevoIntent = new Intent(MainActivity.this, CrearCuentaActivity.class);
                startActivity(nuevoIntent);
            }
        });


    }
}
