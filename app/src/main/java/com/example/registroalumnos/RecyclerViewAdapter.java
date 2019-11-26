package com.example.registroalumnos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

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

    public List<Alumno> alumnoLista;

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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(alumnoLista.get(position).getNombre());
        holder.cuenta.setText(alumnoLista.get(position).getCuenta());
        holder.fotoAlumno.setImageResource(alumnoLista.get(position).getImgAlumno());
    }

    //Cantidad de elementos a procesar
    @Override
    public int getItemCount() {
        return alumnoLista.size();
    }
}
