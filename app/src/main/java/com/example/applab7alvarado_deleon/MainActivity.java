package com.example.applab7alvarado_deleon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User();
        user.setNombre("Alfonso");
        user.setCedula("8-888-88");
        user.setEdad(22);
        user.setPassword("12345");
        if(NewUser(user)){
            Log.e("TAG", "INSERT EXITOSO");
            Log.e("TAG", "INSERT EXITOSO");
            Log.e("TAG", "INSERT EXITOSO");
            Log.e("TAG", "INSERT EXITOSO");

        }else{
            Log.e("TAG", "INSERT FAIL");
            Log.e("TAG", "INSERT FAIL");
            Log.e("TAG", "INSERT FAIL");
            Log.e("TAG", "INSERT FAIL");
            Log.e("TAG", "INSERT FAIL");

        }

        User db_user = searchUser("8-888-88");
        Log.e("TAG", "Nombre = "+ db_user.nombre);
    }
}