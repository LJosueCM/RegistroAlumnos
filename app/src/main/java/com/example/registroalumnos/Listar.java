package com.example.registroalumnos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.registroalumnos.MainActivity.alumnos;

public class Listar extends AppCompatActivity {

    private RecyclerView recyclerViewAlumno;
    private RecyclerViewAdapter adaptadorAlumno;
    LinearLayout persona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        recyclerViewAlumno = findViewById(R.id.rvAlumno);
        recyclerViewAlumno.setLayoutManager(new LinearLayoutManager(this));

        persona = findViewById(R.id.cvPersona);

        adaptadorAlumno = new RecyclerViewAdapter(getAlumnos());
        recyclerViewAlumno.setAdapter(adaptadorAlumno);

        /*recyclerViewAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Listar.this, "hola", Toast.LENGTH_LONG).show();
            }
        });*/
    }

    public List<Alumno> getAlumnos(){
        return alumnos;
    }
}