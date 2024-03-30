package com.example.sayfalararasibilgiaktarma;

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
    public  void gecis(View view){
        String user=kadi.getText().toString();
        Intent gec=new Intent(this, MainActivity2.class);
        gec.putExtra("kullanici_isim",user);
        startActivity(gec);


    }


}