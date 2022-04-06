package com.example.encuesta;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NOMBRE = "encuesta.db";
    public static final String TABLE_ENCUESTAS = "t_encuestas";

    public ConexionSQLiteHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_ENCUESTAS + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "pregunta1 INTEGER NOT NULL,"  +
                "pregunta2 INTEGER  NOT NULL," +
                "pregunta3 INTEGER  NOT NULL," +
                "pregunta4 INTEGER  NOT NULL," +
                "pregunta5 INTEGER  NOT NULL)" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE " + TABLE_ENCUESTAS);
        onCreate(sqLiteDatabase);

    }


}