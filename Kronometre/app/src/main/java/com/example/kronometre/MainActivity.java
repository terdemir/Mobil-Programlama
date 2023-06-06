package com.example.kronometre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    TextView textView;
    Button btnBaslat;
    int say;

    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBaslat=findViewById(R.id.btnStart);
        textView=findViewById(R.id.sayTxt);
        say=0;
    }
    public void start(View view){
        handler=new Handler();
        runnable= new Runnable() {
            @Override
            public void run() {
                textView.setText("Süre="+say);
                say++;
                textView.setText("Süre="+say);
                handler.postDelayed(runnable, 1000);

            }
        };
        handler.post(runnable);
        btnBaslat.setEnabled(false);

    }

    public void reset(View view){
        btnBaslat.setEnabled(true);
        handler.removeCallbacks(runnable);
        say=0;
        textView.setText("Süre="+say);

    }


}