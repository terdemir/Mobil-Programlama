package com.erdemir.girisuygulamasi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textView2);
        textView2=findViewById(R.id.sayac);
        Intent intent=getIntent();
        String isim=intent.getStringExtra("isim");
        textView.setText(isim);


    }

    public void cikis(View view){
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("Çıkış");
        alert.setMessage("Emin misiniz?");
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                new CountDownTimer(3000, 1000) {
                    @Override
                    public void onTick(long l) {

                        Toast.makeText(MainActivity2.this, "Çıkış Yapılıyor",Toast.LENGTH_SHORT).show();
                        
                        textView2.setText("Geri Sayım: "+l/1000);
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(MainActivity2.this,"Çıkış Yapıldı",Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(MainActivity2.this, MainActivity.class);
                        startActivity(intent);
                    }
                }.start();


            }
        });
        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity2.this,"Çıkış İptal",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}