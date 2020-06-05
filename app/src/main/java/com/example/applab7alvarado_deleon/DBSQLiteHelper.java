package com.example.applab7alvarado_deleon;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBSQLiteHelper extends SQLiteOpenHelper {


    String sqlCreateUsersTable = "CREATE TABLE users (nombre TEXT, cedula TEXT, edad INTEGER, password TEXT)";

    public DBSQLiteHelper(Context contexto, String nombre, CursorFactory factory, int version) {
        super(contexto,nombre,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCreateUsersTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");

        db.execSQL(sqlCreateUsersTable);
    }
}
