package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class Layout extends AppCompatActivity {



    Listview list1;

    Context context=this;
    ArrayList<String> sehirler= new ArrayList<>(Arrays.asList("Amasya", "Samsun", "Çorum", "Tokat", "Ankara", "İstanbul"));
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        list1=findViewById(R.id.Listview2);
        adapter =new ArrayAdapter<String>(context,R.layout.listview_Layout, sehirler);
        list1.setAdapter(adapter);




    }
}