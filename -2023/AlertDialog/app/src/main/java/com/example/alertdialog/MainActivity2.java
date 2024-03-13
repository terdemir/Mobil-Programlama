package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    TextView say;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=findViewById(R.id.btn_cikis);
        say=findViewById(R.id.say);
    }
    public void cikis(View view){

        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("Çıkış İşlemi");
        alert.setMessage("Çıkış Yapmak İstediğinizden Emin Misiniz?");
        alert.setIcon(R.mipmap.ic_launcher);

        //Evet butonuna tıklandığınıda gerçekleşcek işlemler
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                // Intent geri=new Intent(MainActivity2.this, MainActivity.class);
                // startActivity(geri);


                //countDownTimer geri sayim işlemi yapar. Sadece üstteki iki yorum satırını kullanarak geri saydırmadan çıkış yaptırabilirdik.
                //Alttaki kodlar geri sayim ile gerçekleşmesii sağlıyor.
                new CountDownTimer (3000, 1000){

                public void onTick (long l){
                    Toast.makeText(MainActivity2.this, "Çıkış Yapılıyor", Toast.LENGTH_SHORT).show();
                    say.setText("Geri Sayim:"+ l/1000);
                }
                public void onFinish(){
                    Toast.makeText(MainActivity2.this, "Çıkış Yapıldı", Toast.LENGTH_SHORT).show();
                    Intent geri=new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(geri);
                }
                }.start();


            }
        });

        //Hayır butonuna tıklandığınıda gerçekleşcek işlemler
        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity2.this,"Çıkış İptal",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}