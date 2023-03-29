package com.example.veri_islemleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    EditText edittext;
    TextView textview;
    SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext=findViewById(R.id.txt_yas);
        textview=findViewById(R.id.lbl_goster);

        sharedPreferences=this.getSharedPreferences("com.example.veri_islemleri", Context.MODE_PRIVATE);
        int kayitliyas=sharedPreferences.getInt("yas",0);

        if(kayitliyas==0) {
            textview.setText("Yaşınız:");
        }
        else {
            textview.setText("Yaşınız:"+ kayitliyas);
        }
    }

    public void kaydet(View view){
        if(!edittext.getText().toString().matches("")){
            int age=Integer.parseInt(edittext.getText().toString());
            textview.setText("Yaşınız: "+age);
            sharedPreferences.edit().putInt("yas", age).apply();
        }
    }

    public void sil(View view){
        int yas=sharedPreferences.getInt("yas",0);
        if (yas!=0){
            sharedPreferences.edit().remove("yas").apply();
            textview.setText("Yaşınız:");
        }
    }
}