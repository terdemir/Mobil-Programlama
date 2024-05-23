package com.example.menudeneme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.sayfabir){
            Intent intent=new Intent(this, MainActivity2.class);
           startActivity(intent);
            Toast.makeText(getApplicationContext(), "1. sayfa", Toast.LENGTH_SHORT).show();
        } else if(item.getItemId()==R.id.sayfaiki){
            Toast.makeText(getApplicationContext(), "2. sayfa", Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }
}