package com.example.a1b_firabasegiris;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class GirisSayfasi extends AppCompatActivity {

    private EditText txtgiriseposta, txtgirisparola;
    private String eposta, parola;
    private FirebaseAuth mAuth;

    private FirebaseUser mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_sayfasi);
        txtgiriseposta=findViewById(R.id.txtgiriseposta);
        txtgirisparola=findViewById(R.id.txtgirisparola);
        mAuth=FirebaseAuth.getInstance();

    }

    public void girisyap(View view){
        eposta=txtgiriseposta.getText().toString();
        parola=txtgirisparola.getText().toString();

        if(!eposta.isEmpty()||!parola.isEmpty()){
            mAuth.signInWithEmailAndPassword(eposta,parola)
                    .addOnSuccessListener(this, new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            mUser=mAuth.getCurrentUser();
                            Intent intent=new Intent(getApplicationContext(), UserSayfasi.class);
                            startActivity(intent);
                            Toast.makeText(GirisSayfasi.this, "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(this, new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(GirisSayfasi.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });


        }else{
            Toast.makeText(this, "Alanlar boş bırakılamaz", Toast.LENGTH_SHORT).show();
        }
    }
}