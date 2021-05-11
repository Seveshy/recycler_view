package com.example.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.adapter.Adapter;
import com.example.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        this.criarFilmes();

        Adapter adapter = new Adapter(listaFilmes);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(
               new RecyclerItemClickListener(
                       getApplicationContext(),
                       recyclerView,
                       new RecyclerItemClickListener.OnItemClickListener() {
                           @Override
                           public void onItemClick(View view, int position) {
                               Filme filme = listaFilmes.get(position);
                               Toast.makeText(
                                       getApplicationContext(),
                                       "Item pressionado: " + filme.getTituloFilme(),
                                       Toast.LENGTH_SHORT
                               ).show();
                           }

                           @Override
                           public void onLongItemClick(View view, int position) {
                               Filme filme = listaFilmes.get(position);
                               Toast.makeText(
                                       getApplicationContext(),
                                       "Click Longo: " + filme.getTituloFilme(),
                                       Toast.LENGTH_SHORT
                               ).show();
                           }

                           @Override
                           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                           }
                       }
               )
        );
    }

    public void criarFilmes() {
        Filme filme = new Filme("Homem Aranha", "Ação", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem de Ferro", "Ação", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Vingadores", "Ação", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Velozes e furioso", "Ação", "2018");
        this.listaFilmes.add(filme);
        filme = new Filme("Homem de Ferro", "Ação", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Vingadores", "Ação", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Velozes e furioso", "Ação", "2018");
        this.listaFilmes.add(filme);
        filme = new Filme("Homem de Ferro", "Ação", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Vingadores", "Ação", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Velozes e furioso", "Ação", "2018");
        this.listaFilmes.add(filme);
        filme = new Filme("Homem de Ferro", "Ação", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Vingadores", "Ação", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Velozes e furioso", "Ação", "2018");
        this.listaFilmes.add(filme);

    }
}
