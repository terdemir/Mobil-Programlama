package com.example.a1b_firebaseverikayitokuma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    EditText verial, veriguncelle;
    TextView verigoster;
    FirebaseDatabase veritabani;
    DatabaseReference veriyolu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verial=findViewById(R.id.edtMetinGir);
        verigoster=findViewById(R.id.txtVeriGoster);
        veriguncelle=findViewById(R.id.edtGuncelle);
        veritabani = FirebaseDatabase.getInstance();
        veriyolu = veritabani.getReference("isim");
    }

    public void kaydet (View view){
        String id=veriyolu.push().getKey();
        String isim=verial.getText().toString();
        veriyolu = veritabani.getReference(id);
        veriyolu.setValue(isim);
    }
    public void verigoster(View view){
        // Read from the database
        veriyolu.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot veritutucu) {
                  String gelenveri = veritutucu.getValue(String.class);
                  verigoster.setText(gelenveri);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(MainActivity.this, "Hata: "+error, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void sil(View view){
        veriyolu = veritabani.getReference("isim");
        veriyolu.removeValue()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(MainActivity.this, "İsim silindi", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
    public void guncelle(View view){
                veriyolu = veritabani.getReference();
        String yenideger=veriguncelle.getText().toString();
        HashMap hash=new HashMap();
        hash.put("isim", yenideger);
        hash.put("soyisim",yenideger);
        veriyolu.updateChildren(hash)
                .addOnCompleteListener(this, new OnCompleteListener() {
                    @Override
                    public void onComplete(@NonNull Task task) {
                        if (task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "İsim güncellendi", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}