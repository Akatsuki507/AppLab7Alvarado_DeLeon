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
        if(VerifyUser("8-888-88", "12345")){
            Log.e("TAG", "LOG IN EXITOSO");
            Log.e("TAG", "LOG IN EXITOSO");
            Log.e("TAG", "LOG IN EXITOSO");
            Log.e("TAG", "LOG IN EXITOSO");
            Log.e("TAG", "LOG IN EXITOSO");
        }else{
            Log.e("TAG", "LOG IN FAIL");
            Log.e("TAG", "LOG IN FAIL");
            Log.e("TAG", "LOG IN FAIL");
            Log.e("TAG", "LOG IN FAIL");

        }
    }
}