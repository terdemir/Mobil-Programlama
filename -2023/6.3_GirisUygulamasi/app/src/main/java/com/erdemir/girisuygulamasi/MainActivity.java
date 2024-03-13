package com.erdemir.girisuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.isim);
        password=findViewById(R.id.parola);

    }

    public void giris(View view){

        String isim=name.getText().toString();
        int parola=Integer.parseInt(password.getText().toString());
        if(isim.equals("Turgay") && parola==12345){
            Toast.makeText(MainActivity.this,"Giriş Yapıldı",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("isim", isim);
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this,"Bilgiler Hatalı",Toast.LENGTH_LONG).show();
        }
    }
}