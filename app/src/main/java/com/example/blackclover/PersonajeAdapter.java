package com.example.blackclover;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder> {

    Context contexto;
    List<Personaje> listaPersonajes;

    public PersonajeAdapter(Context contexto, List<Personaje> listaPersonajes) {
        this.contexto = contexto;
        this.listaPersonajes = listaPersonajes;
    }

    @NonNull
    @Override
    public PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(contexto).inflate(R.layout.item_personaje, parent, false);
        return new PersonajeViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajeViewHolder holder, int position) {
        Personaje personaje = listaPersonajes.get(position);
        holder.txtNombre.setText(personaje.nombre);
        holder.txtMagia.setText("✦ " + personaje.magia);
        holder.txtRango.setText(personaje.rango);
        holder.txtEscuadron.setText(personaje.escuadron);
        holder.txtDescripcion.setText(personaje.descripcion);

        holder.imgPersonaje.setImageResource(personaje.imagen);
    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public static class PersonajeViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPersonaje;
        TextView txtNombre;
        TextView txtMagia;
        TextView txtRango;
        TextView txtEscuadron;
        TextView txtDescripcion;

        public PersonajeViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPersonaje = itemView.findViewById(R.id.imgPersonaje);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtMagia = itemView.findViewById(R.id.txtMagia);
            txtRango = itemView.findViewById(R.id.txtRango);
            txtEscuadron = itemView.findViewById(R.id.txtEscuadron);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
        }
    }
}
