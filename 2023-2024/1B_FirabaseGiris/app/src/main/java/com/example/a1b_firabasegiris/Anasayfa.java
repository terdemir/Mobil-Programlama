package com.example.a1b_firabasegiris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Anasayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
    }

    public void kayitsayfasi(View view){
        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void girissayfasi(View view){
        Intent intent=new Intent(getApplicationContext(), GirisSayfasi.class);
        startActivity(intent);
    }



}