package com.example.a1b_sayfalararasigezinme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView isim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        isim=findViewById(R.id.txtKadi);
        Intent mesaj=getIntent();
        String kullanici=mesaj.getStringExtra("user");
        isim.setText("Hoşgeldin "+ kullanici);
    }
    public void cikis(View view){
        Intent gecis=new Intent(this, MainActivity.class);
        startActivity(gecis);
    }
}