//Ejemplo de cómo implementar la clase DBHelper para manejar sqlite en Android Studio desde un Login inicial//

package com.example.darkangel.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper  extends SQLiteOpenHelper{
    public DBHelper(Context context, String name, SQLiteDatabase.Base Gestion gestion, int version) {
        super(context, name, gestion, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("create table usuarios(codigo integer primary key,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(01,'admin','admin')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("create table usuarios(codigo integer primary key,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(01,'admin','admin')");
    }
}
