package com.example.registroalumnos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    public List<Alumno> alumnoLista;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre, cuenta;
        ImageView fotoAlumno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.tvNombre);
            cuenta = (TextView) itemView.findViewById(R.id.tvCuenta);
            fotoAlumno = (ImageView) itemView.findViewById(R.id.ivFoto);
        }
    }

    public RecyclerViewAdapter(List<Alumno> alumnoLista) {
        this.alumnoLista = alumnoLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_alumno,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.nombre.setText(alumnoLista.get(position).getNombre());
        holder.cuenta.setText(alumnoLista.get(position).getCuenta());
        holder.fotoAlumno.setImageResource(alumnoLista.get(position).getImgAlumno());
        holder.nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"ID: "+alumnoLista.get(position).getId(),Toast.LENGTH_SHORT).show();
            }
        });
        holder.cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"ID: "+alumnoLista.get(position).getId(),Toast.LENGTH_SHORT).show();
            }
        });
        holder.fotoAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"ID: "+alumnoLista.get(position).getId(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Cantidad de elementos a procesar
    @Override
    public int getItemCount() {
        return alumnoLista.size();
    }
}
