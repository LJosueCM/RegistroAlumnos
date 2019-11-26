package com.example.registroalumnos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import static com.example.registroalumnos.MainActivity.alumnos;

public class Listar extends AppCompatActivity {

    private RecyclerView recyclerViewAlumno;
    private RecyclerViewAdapter adaptadorAlumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        recyclerViewAlumno = findViewById(R.id.rvAlumno);
        recyclerViewAlumno.setLayoutManager(new LinearLayoutManager(this));

        adaptadorAlumno = new RecyclerViewAdapter(getAlumnos());
        recyclerViewAlumno.setAdapter(adaptadorAlumno);
    }

    public List<Alumno> getAlumnos(){
        return alumnos;
    }
}