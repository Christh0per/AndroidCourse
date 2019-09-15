package com.example.prueba3.modelos;

import android.provider.BaseColumns;

public class MainDBContract {
    private MainDBContract(){}

    public static class MainDBUsuarios implements BaseColumns {
        public static final String NOMBRE_TABLA = "usuarios";
        public static final String COLUMNA_USERNAME = "username";
        public static final String COLUMNA_PASSWORD = "password";
    }
}
