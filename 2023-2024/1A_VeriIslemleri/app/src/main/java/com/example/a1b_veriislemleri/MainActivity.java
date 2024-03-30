package com.example.a1b_veriislemleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText getyas;
    TextView showyas;
    SharedPreferences datasakla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getyas=findViewById(R.id.editYas);
        showyas=findViewById(R.id.txtYas);

        datasakla=this.getSharedPreferences("com.example.a1b_veriislemleri", Context.MODE_PRIVATE);
        int kayitliyas=datasakla.getInt("Yas", 0);
        if(kayitliyas==0){
            showyas.setText("Yaşınız: ");
        }else{
            showyas.setText("Yaşınız: "+ kayitliyas);
        }
    }
    public void kaydet(View view){
        int yas=Integer.parseInt(getyas.getText().toString());
        showyas.setText("Yaşınız: "+ yas);
        datasakla.edit().putInt("Yas", yas).apply();
    }

    public void sil(View view){
        int yas=datasakla.getInt("Yas",0);
        if(yas!=0){
            datasakla.edit().remove("Yas").apply();
            showyas.setText("Yaşınız: ");
        }
    }
}