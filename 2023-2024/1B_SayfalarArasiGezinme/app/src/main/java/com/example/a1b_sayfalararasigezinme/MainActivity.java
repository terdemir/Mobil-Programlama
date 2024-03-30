package com.example.a1b_sayfalararasigezinme;

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

    public void giris(View view){
        Intent gecis=new Intent(this, MainActivity2.class);
        startActivity(gecis);
    }
}