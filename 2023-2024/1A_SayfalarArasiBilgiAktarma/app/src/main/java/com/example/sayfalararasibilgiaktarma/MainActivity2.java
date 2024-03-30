package com.example.sayfalararasibilgiaktarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView kadi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        kadi=findViewById(R.id.txtKarsilama);

        Intent gecis=getIntent();
        String user=gecis.getStringExtra("kullanici_isim");
        kadi.setText("Hoşgeldin "+user);

    }
    public void donus(View view){
        Intent donus=new Intent(this, MainActivity.class);
        startActivity(donus);
    }


}