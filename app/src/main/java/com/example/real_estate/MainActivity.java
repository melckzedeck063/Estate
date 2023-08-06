package com.example.real_estate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateHome(View view){
        Intent intent =  new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(intent);
    }
}