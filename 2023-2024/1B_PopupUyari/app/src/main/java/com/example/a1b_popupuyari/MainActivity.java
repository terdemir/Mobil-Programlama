package com.example.a1b_popupuyari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Uygulama Başlatıldı", Toast.LENGTH_LONG).show();

    }

    public void uyari(View view){
        Toast.makeText(this, "Uyari Mesajı", Toast.LENGTH_SHORT).show();
    }



}