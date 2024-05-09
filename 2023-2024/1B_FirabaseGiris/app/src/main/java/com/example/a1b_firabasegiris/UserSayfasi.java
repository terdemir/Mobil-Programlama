package com.example.a1b_firabasegiris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class UserSayfasi extends AppCompatActivity {

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sayfasi);
    }

    public void cikisyap(View view){
        FirebaseAuth.getInstance().signOut();
        Intent intent=new Intent(getApplicationContext(), Anasayfa.class);
        startActivity(intent);
    }
}