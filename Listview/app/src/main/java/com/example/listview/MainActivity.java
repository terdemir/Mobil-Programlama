package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    Listview list1;
    Context context=this;
    ArrayList<String> sehirler= new ArrayList<>(Arrays.asList("Amasya", "Samsun", "Çorum", "Tokat", "Ankara", "İstanbul"));
    ArrayAdapter<String> adapter;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1=findViewById(R.id.Listview2);
        adapter =new ArrayAdapter<String>(context,R.layout.listview_layout, sehirler);
        list1.setAdapter(adapter);

        list1.setOnItemListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str=sehirler(position);
                Toast.makeText(context, str+" seçildi.", Toast.LENGTH_SHORT).show();


            }
        });

    }
}