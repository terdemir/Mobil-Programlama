package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sayi1, sayi2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayi1=findViewById(R.id.editSayi1);
        sayi2=findViewById(R.id.editSayi2);
        sonuc=findViewById(R.id.txtSonuc);

    }

    public void toplama(View view){
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen alanları doldurunuz.");
        } else {
            int s1 = Integer.parseInt(sayi1.getText().toString());
            int s2 = Integer.parseInt(sayi2.getText().toString());
            int toplam = s1 + s2;
            sonuc.setText("Sonuç=" + toplam);
        }
    }
    public void cikarma(View view){
        int s1=Integer.parseInt(sayi1.getText().toString());
        int s2=Integer.parseInt(sayi2.getText().toString());
        int fark=s1-s2;
        sonuc.setText("Sonuç="+fark);
    }
    public void carpma(View view){
        int s1=Integer.parseInt(sayi1.getText().toString());
        int s2=Integer.parseInt(sayi2.getText().toString());
        int carpim=s1*s2;
        sonuc.setText("Sonuç="+carpim);
    }
    public void bolme(View view){
        int s1=Integer.parseInt(sayi1.getText().toString());
        int s2=Integer.parseInt(sayi2.getText().toString());
        double bolum=s1/s2;
        sonuc.setText("Sonuç="+bolum);
    }


}