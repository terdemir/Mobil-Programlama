package com.example.firebasegiris;

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

public class GirisActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseUser mUser;

    private EditText txteposta, txtparola;
    private String eposta, parola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        txteposta=findViewById(R.id.txtgiriseposta);
        txtparola=findViewById(R.id.txtgirisparola);
        mAuth=FirebaseAuth.getInstance();
    }

    public void girisyap(View view){
        eposta=txteposta.getText().toString();
        parola=txtparola.getText().toString();

        if(!eposta.isEmpty()||!parola.isEmpty()){
            mAuth.signInWithEmailAndPassword(eposta, parola)
                    .addOnSuccessListener(this, new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            mUser=mAuth.getCurrentUser();
                            Toast.makeText(GirisActivity.this, "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(getApplicationContext(), UserActivity.class);
                            startActivity(intent);
                        }
                    }).addOnFailureListener(this, new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(GirisActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        }else{
            Toast.makeText(this, "E-posta ve Parola Boş Bırakılamaz", Toast.LENGTH_SHORT).show();
        }
    }


}