package com.example.prueba3.modelos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MainDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "MainDB2019.db";
    public static final int DATABASE_VERSION = 1;

    public static final String SQL_TABLA_USUARIOS =
            "CREATE TABLE" + MainDBContract.MainDBUsuarios.NOMBRE_TABLA + " (" +
            MainDBContract.MainDBUsuarios._ID + " INTEGER PRIMARY KEY," +
            MainDBContract.MainDBUsuarios.COLUMNA_USERNAME + " TEXT," +
            MainDBContract.MainDBUsuarios.COLUMNA_PASSWORD + " TEXT)";

    public MainDBHelper(Context contexto){
        super(contexto, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_TABLA_USUARIOS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // TODO: Programa Migracion
    }
}
