package com.example.a1b_menuolusturma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.girisyap){
            Intent gecis=new Intent(this, GirisYap.class);
            startActivity(gecis);
        } else if (item.getItemId()==R.id.kayitol) {
            Intent gecis=new Intent(this, KayitOl.class);
            startActivity(gecis);
        }


        return super.onOptionsItemSelected(item);
    }
}