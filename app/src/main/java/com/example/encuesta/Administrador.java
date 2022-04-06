package com.example.encuesta;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

import androidx.annotation.Nullable;

public class Administrador extends SQLiteOpenHelper{

    private static final int VERSION = 1;
    private static final String NOMBRE_DATABASE = "encuestas2022";

    public Administrador(@Nullable Context context) {
        super(context, NOMBRE_DATABASE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE ENCUESTAS1 (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " pregunta1 INTEGER," +
                "pregunta2 INTEGER," +
                "pregunta3 INTEGER," +
                "pregunta4 INTEGER," +
                "pregunta5 INTEGER," +
                "respuesta5 INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
