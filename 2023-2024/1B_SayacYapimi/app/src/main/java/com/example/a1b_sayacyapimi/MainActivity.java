package com.example.a1b_sayacyapimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sayac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayac=findViewById(R.id.txtSayac);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long sure) {
                sayac.setText("Kalan süre: " +sure/1000);
            }

            @Override
            public void onFinish() {
                sayac.setText("Süre tamamlandı");
            }
        }.start();







    }
}