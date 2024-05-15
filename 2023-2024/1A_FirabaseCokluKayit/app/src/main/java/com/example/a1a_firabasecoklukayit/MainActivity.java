package com.example.a1a_firabasecoklukayit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;

public class MainActivity extends AppCompatActivity {

    EditText marka, tur, satici, fiyat;
    private FirebaseAuth kimlik;
    private DatabaseReference veritabani;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marka=findViewById(R.id.edtGitarMarkasi);
        tur=findViewById(R.id.edtGitarTuru);
        satici=findViewById(R.id.edtSatici);
        fiyat=findViewById(R.id.edtFiyat);
         kimlik=FirebaseAuth.getInstance();
         veritabani=FirebaseDatabase.getInstance().getReference();
    }

    public void kaydet(View view){
        String markaismi=marka.getText().toString();
        String turismi=tur.getText().toString();
        String stc=satici.getText().toString();
        String fyt=fiyat.getText().toString();
        if(!markaismi.isEmpty()&&!turismi.isEmpty()&&!stc.isEmpty()&&!fyt.isEmpty()){
            veritabani.child("gitarlar").child("marka").setValue(markaismi);
            veritabani.child("gitarlar").child("tur").setValue(turismi);
            veritabani.child("gitarlar").child("satici").setValue(stc);
            veritabani.child("gitarlar").child("fiyat").setValue(fyt);
        }else {
            Toast.makeText(getApplicationContext(), "Alanlar boş bırakılamaz", Toast.LENGTH_SHORT).show();
        }

    }

}