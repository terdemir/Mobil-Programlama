package com.erdemir.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText sayi1;
    EditText sayi2;
    TextView sonuc;

    //ÖNEMLİ: Güenli kodlama  yapılmalı, metin kutuları boş olursa ya da karakter girilirse hata oluşur. Bunun için metin kutularına girilecek değerleri number olarak seçmeliyiz
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayi1=findViewById(R.id.sayi1);
        sayi2=findViewById(R.id.sayi2);
        sonuc=findViewById(R.id.sonuc);
    }
    public void toplama(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("sayı giriniz");
        }else {
            int number1 = Integer.parseInt(sayi1.getText().toString());
            int number2 = Integer.parseInt(sayi2.getText().toString());
            int result = number1 + number2;
            sonuc.setText("Sonuç=" + result);
        }
    }
    public void cikarma(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("sayı giriniz");
        }else {
            int number1 = Integer.parseInt(sayi1.getText().toString());
            int number2 = Integer.parseInt(sayi2.getText().toString());
            int result = number1 - number2;
            sonuc.setText("Sonuç=" + result);
        }

    }
    public void carpma(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("sayı giriniz");
        }else {
            int number1 = Integer.parseInt(sayi1.getText().toString());
            int number2 = Integer.parseInt(sayi2.getText().toString());
            int result = number1 * number2;
            sonuc.setText("Sonuç=" + result);
        }
    }
    public void bolme(View view){
        if (sayi1.getText().toString().matches("")||sayi2.getText().toString().matches("")){
            sonuc.setText("sayı giriniz");
        }else {
            int number1 = Integer.parseInt(sayi1.getText().toString());
            int number2 = Integer.parseInt(sayi2.getText().toString());
            int result = number1 / number2;
            sonuc.setText("Sonuç=" + result);
        }
    }
}