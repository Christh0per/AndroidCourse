package com.example.prueba3.modelos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UsuariosModelo {
    private MainDBHelper dbHelper;

    //Instanciando el maindbHelper para haber la base de datos
    public UsuariosModelo(Context contexto){
        this.dbHelper = new MainDBHelper(contexto);
    }

    public void crearUsuario(ContentValues usuario){
        SQLiteDatabase db = this.dbHelper.getWritableDatabase();
        db.insert(MainDBContract.MainDBUsuarios.NOMBRE_TABLA, null, usuario);
        // TODO: Programar el constructor
    }
}
