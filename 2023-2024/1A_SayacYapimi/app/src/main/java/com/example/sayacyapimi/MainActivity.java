package com.example.sayacyapimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView sayac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayac=findViewById(R.id.txtSayac);

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long l) {
                sayac.setText("Kalan süre= " + l/1000 );
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Süre Bitti", Toast.LENGTH_LONG).show();
                sayac.setText("Tamanlandı");
            }
        }.start();


    }
}