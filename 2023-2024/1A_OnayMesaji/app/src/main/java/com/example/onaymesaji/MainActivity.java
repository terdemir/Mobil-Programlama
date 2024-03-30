package com.example.onaymesaji;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cikis(View view){
        AlertDialog.Builder onay=new AlertDialog.Builder(MainActivity.this);
        onay.setTitle("Uyarı");
        onay.setMessage("Emin misiniz?");
        onay.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Çıkış Yapıldı", Toast.LENGTH_SHORT).show();
            }
        });
        onay.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Çıkış İptal Edildi", Toast.LENGTH_SHORT).show();
            }
        });
        onay.show();

    }
}