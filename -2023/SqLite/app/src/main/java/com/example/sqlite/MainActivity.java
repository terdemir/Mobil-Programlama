package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    EditText etNote;
    Button btnSave, btnList,btnDelete,btnEdit;
    RecyclerView rvNote;
    String noteID="";
    ArrayList<Notes> noteList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimlamalar();
    }

    private void tanimlamalar(){
        etNote=findViewById(R.id.et_note);
        btnSave=findViewById(R.id.btn_Add);
        btnList=findViewById(R.id.btn_List);
        btnDelete=findViewById(R.id.btn_Delete);
        btnEdit=findViewById(R.id.btn_Edit);
        rvNote=findViewById(R.id.rv_Note);
    }

    public void btn_List_Click(View view){
        F_GetList();
    }

    void F_GetList(){
        DatabaseHelper db=new DatabaseHelper(getApplicationContext());
        noteList=db.getNoteList();

        NoteAdapter adp=new NoteAdapter(this, noteList);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        rvNote.setLayoutManager(layoutManager);
        rvNote.setHasFixedSize(true);
        rvNote.setAdapter(adp);

        adp.setOnItemClickListener(onItemNoteClickListener);

        db.close();
    }
    View.OnClickListener onItemNoteClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            int i = viewHolder.getAdapterPosition();
            Notes item = noteList.get(i);

            etNote.setText(item.getNote_text());
            noteID = item.getNote_id();
        }
    };

    public void btn_Save_Click(View view){
        if(!etNote.getText().toString().trim().equals("")){
            DatabaseHelper db=new DatabaseHelper(getApplicationContext());
            db.addNote(etNote.getText().toString());
            db.close();
            etNote.setText("");
        }
    }

    public void btn_Delete_Click(View view){
        if(!noteID.equals("")){
            DatabaseHelper db=new DatabaseHelper(getApplicationContext());
            db.deleteNote(noteID);
            db.close();

            Toast.makeText(getApplicationContext(), "Not Silindi", Toast.LENGTH_SHORT).show();

            noteID="";
            etNote.setText("");
            F_GetList();
        }
        else
            Toast.makeText(getApplicationContext(), "Silinecek Notu Seçiniz", Toast.LENGTH_SHORT).show();

    }


}