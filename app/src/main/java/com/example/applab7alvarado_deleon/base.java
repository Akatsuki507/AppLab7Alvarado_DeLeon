package com.example.applab7alvarado_deleon;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class base extends AppCompatActivity {

    public boolean NewUser(User user){
        DBSQLiteHelper dbsqlite = new DBSQLiteHelper(this,"UsersDB",null, 1);
        SQLiteDatabase db = dbsqlite.getWritableDatabase();

        if(db != null){

            db.execSQL("INSERT INTO users (nombre, cedula, edad, password) values ('"+ user.nombre +"', '"+ user.cedula +"',"+ user.edad +", '"+ user.password +"')");

            db.close();
            return true;
        }
        return false;
    }


    public boolean VerifyUser(String cedula, String Password){
        DBSQLiteHelper dbsqlite = new DBSQLiteHelper(this,"UsersDB",null, 1);
        SQLiteDatabase db = dbsqlite.getWritableDatabase();
        User user = searchUser(cedula);
        if(!user.equals(null)){
            if(user.password.equals(Password)){
                return true;
            }
            Log.e("ERROR","Password incorrecto");
            return false;
        }else{
            Log.e("ERROR","Usuario no encontrado");
            return false;
        }
    }

    public User searchUser(String cedula) {
        User user = new User();

        DBSQLiteHelper dbsqlite = new DBSQLiteHelper(this,"UsersDB",null, 1);
        SQLiteDatabase db = dbsqlite.getWritableDatabase(); //get the database that was created in this instance
        Cursor c = db.rawQuery("select * from users where cedula =?", new String[]{cedula});
        if (c.moveToLast()) {
            user.setNombre(c.getString(0));
            user.setCedula(c.getString(1));
            user.setEdad(c.getInt(2));
            user.setPassword(c.getString(3));
            return user;
        }else {
            Log.e("error not found", "user can't be found or database empty");
            return user;
        }

    }
}
