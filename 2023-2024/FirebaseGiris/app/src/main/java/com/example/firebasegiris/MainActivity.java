package com.example.firebasegiris;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText eposta, parola;
    private String txteposta,txtparola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        eposta=findViewById(R.id.txteposta);
        parola=findViewById(R.id.txtparola);

    }

    public void kayitol(View view)
    {
        txteposta=eposta.getText().toString();
        txtparola=parola.getText().toString();
        if(!txtparola.isEmpty()||!txteposta.isEmpty()){
            mAuth.createUserWithEmailAndPassword(txteposta,txtparola)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(MainActivity.this, "Kayıt Başarılı", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(getApplicationContext(), GirisActivity.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
        else{
            Toast.makeText(this, "E-posta ve Parola Boş Bırakılamaz", Toast.LENGTH_SHORT).show();
        }

    }
}