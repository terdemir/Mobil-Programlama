package com.example.a1a_firebaseverikayitokuma;

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
        verial=findViewById(R.id.txtMetin);
        verigoster=findViewById(R.id.txtMetinGoster);

        veritabani=FirebaseDatabase.getInstance();
        veriyolu=FirebaseDatabase.getInstance().getReference();
    }

    public void kaydet(View view){
        String veritut=verial.getText().toString();
        veritabani = FirebaseDatabase.getInstance();
        veriyolu = veritabani.getReference("veri");
        veriyolu.setValue(veritut);
    }

    public void goster(View view){
        // Read from the database
        veriyolu.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot veriler) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String alinanveri = veriler.getValue(String.class);
                verigoster.setText(alinanveri);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(MainActivity.this, ""+error, Toast.LENGTH_SHORT).show();
            }
        });
    }

}