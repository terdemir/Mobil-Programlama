package com.example.a1b_firebaseverilisteleme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase veritabani;
    private DatabaseReference veriyolu;

    private ListView filmliste;
    ArrayList<String> liste;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filmliste = findViewById(R.id.listFilmler);

        liste = new ArrayList<>();
        adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,liste);

       veriyolu = FirebaseDatabase.getInstance().getReference().child("Filmler");
        // My top posts by number of stars
        veriyolu.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot veriler) {
                for (DataSnapshot sonveri: veriler.getChildren()) {
                    String deger = sonveri.getValue(String.class).toString();

                    liste.add(deger);

                }
                filmliste.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}