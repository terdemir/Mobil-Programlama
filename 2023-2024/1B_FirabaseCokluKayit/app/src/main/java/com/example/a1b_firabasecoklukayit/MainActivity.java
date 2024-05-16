package com.example.a1b_firabasecoklukayit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {
EditText filmadi, filmyili, filmyonetmeni, filmpuani;
Button filmkaydet;
FirebaseAuth kimlik;
DatabaseReference veritabani;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filmadi=findViewById(R.id.edtFilmAdi);
        filmyili=findViewById(R.id.edtFilmYili);
        filmyonetmeni=findViewById(R.id.edtYonetmen);
        filmpuani=findViewById(R.id.edtPuan);
        filmkaydet=findViewById(R.id.btnFilmKaydet);

        kimlik=FirebaseAuth.getInstance();
        veritabani= FirebaseDatabase.getInstance().getReference();

    }

    public void kaydet(View view){
        String adi=filmadi.getText().toString();
        String yil=filmyili.getText().toString();
        String yonetmen=filmyonetmeni.getText().toString();
        String puan=filmpuani.getText().toString();

        if(!adi.isEmpty()&&!yil.isEmpty()&&!yonetmen.isEmpty()&&!puan.isEmpty()){

            veritabani.child("Filmler").child("filmadi").setValue(adi);
            veritabani.child("Filmler").child("filmyili").setValue(yil);
            veritabani.child("Filmler").child("yonetmen").setValue(yonetmen);
            veritabani.child("Filmler").child("puan").setValue(puan);

        }else{
            Toast.makeText(this, "Alanlar boş bırakılamaz", Toast.LENGTH_SHORT).show();
        }

    }
}