package com.example.a1b_firabasegiris;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private EditText txtkayiteposta, txtkayitparola;
    private String eposta, parola;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtkayiteposta=findViewById(R.id.txtkayiteposta);
        txtkayitparola=findViewById(R.id.txtkayitparola);
        mAuth=FirebaseAuth.getInstance();
    }

    public void kayitol(View view){
        eposta=txtkayiteposta.getText().toString();
        parola=txtkayitparola.getText().toString();
        if(!eposta.isEmpty()||!parola.isEmpty()){
            mAuth.createUserWithEmailAndPassword(eposta,parola)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(MainActivity.this, "Kayıt Başarılı", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

        }else{
            Toast.makeText(this, "Alanlar boş bırakılamaz", Toast.LENGTH_SHORT).show();
        }

    }
}