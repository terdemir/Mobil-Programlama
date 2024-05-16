package com.example.a1b_firebaseverikayitokuma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    EditText verial;
    TextView verigoster;
    FirebaseDatabase veritabani;
    DatabaseReference veriyolu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verial=findViewById(R.id.edtMetinGir);
        verigoster=findViewById(R.id.txtVeriGoster);
        veritabani = FirebaseDatabase.getInstance();
        veriyolu = veritabani.getReference("isim");
    }

    public void kaydet (View view){
        String isim=verial.getText().toString();
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
}