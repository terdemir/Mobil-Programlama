package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class layouts extends AppCompatActivity {

    Listview list1;
    Context context=this;
    ArrayList<String> sehir= new ArrayList<>(Arrays.asList("Amasya", "Samsun", "Çorum", "Tokat", "Ankara", "İstanbul"));
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);
    }
}