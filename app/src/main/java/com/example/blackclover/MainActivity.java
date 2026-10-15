package com.example.blackclover;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PersonajeAdapter adapter;
    List<Personaje> listaPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listaPersonajes = new ArrayList<>();

        listaPersonajes.add(new Personaje(
                "Asta",
                "Anti-Magia",
                "Caballero Mágico - 3ra Clase",
                "Toros Negros",
                "El único humano nacido sin magia. Compensa su falta de poder con entrenamiento físico extremo y su espada que anula toda magia.",
                R.drawable.img_asta
        ));

        listaPersonajes.add(new Personaje(
                "Yuno",
                "Magia de Viento",
                "Caballero Mágico - 1ra Clase",
                "Alba Dorada",
                "El genio del viento. Portador del trébol de cuatro hojas y del espíritu Sylph. Rival y hermano de crianza de Asta.",
                R.drawable.img_yuno
        ));

        listaPersonajes.add(new Personaje(
                "Noelle Silva",
                "Magia de Agua",
                "Caballero Mágico - 3ra Clase",
                "Toros Negros",
                "Miembro de la familia real Silva. Aprendió a controlar su magia descontrolada y creó su hechizo: Valquiria Vestido.",
                R.drawable.img_noelle
        ));

        listaPersonajes.add(new Personaje(
                "Yami Sukehiro",
                "Magia de Oscuridad",
                "Capitán",
                "Toros Negros",
                "Capitán de los Toros Negros. Usa magia de oscuridad y una katana. Su lema: superar tus límites en este momento.",
                R.drawable.img_yami
        ));

        listaPersonajes.add(new Personaje(
                "Magna Swing",
                "Magia de Fuego",
                "Caballero Mágico - 5ta Clase",
                "Toros Negros",
                "Ex-delincuente de pueblo que encontró propósito como caballero. Creó la técnica Soul Chain Deathmatch contra Dante.",
                R.drawable.img_magna
        ));

        listaPersonajes.add(new Personaje(
                "Luck Voltia",
                "Magia de Relámpago",
                "Caballero Mágico - 3ra Clase",
                "Toros Negros",
                "El gladiador que siempre sonríe en batalla. Su magia de relámpago le da velocidad y poder devastadores.",
                R.drawable.img_luck
        ));

        adapter = new PersonajeAdapter(this, listaPersonajes);
        recyclerView.setAdapter(adapter);
    }
}
