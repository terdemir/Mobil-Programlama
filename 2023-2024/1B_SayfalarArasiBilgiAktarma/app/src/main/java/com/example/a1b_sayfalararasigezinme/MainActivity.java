package com.example.a1b_sayfalararasigezinme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText kadi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kadi=findViewById(R.id.editKadi);
    }
    public void giris(View view){
        String isim=kadi.getText().toString();
        Intent gecis=new Intent(this, MainActivity2.class);
        gecis.putExtra("user",isim);
        startActivity(gecis);
    }
}