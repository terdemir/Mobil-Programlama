package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar ();
    }


    public void ProgressBar (){
        ProgressDialog progressbar=new ProgressDialog(MainActivity.this);
        progressbar.setTitle("Mesajlar Bölümü");
        progressbar.setMessage("Mesajlar listeleniyor, lütfen bekleyiniz!");
        progressbar.setCancelable(false);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
        progressbar.show();
    }
}