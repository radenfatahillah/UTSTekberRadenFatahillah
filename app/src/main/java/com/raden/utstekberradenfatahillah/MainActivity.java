package com.raden.utstekberradenfatahillah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list_buku;
    public final static String Cover =
            "com.example.android.utstekberradenfatahillah.Cover";
    public final static String Judul =
            "com.example.android.utstekberradenfatahillah.Judul";
    public final static String Sinopsis =
            "com.example.android.utstekberradenfatahillah.Sinopsis";
    public final static String Tahun =
            "com.example.android.utstekberradenfatahillah.Tahun";
    public final static String Penulis =
            "com.example.android.utstekberradenfatahillah.Penulis";
    public final static String Penerbit =
            "com.example.android.utstekberradenfatahillah.Penerbit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_buku = findViewById(R.id.list_buku);
        list_buku.setLayoutManager(new GridLayoutManager(this,2));
        list_buku.setAdapter(new BukuAdapter(this, getBuku()));

        Button btn = (Button) findViewById(R.id.btnProfil);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,ProfilActivity.class);
                startActivity(i);
            }
        });
    }

    public List<Buku> getBuku(){

        List<Buku> data = new ArrayList<>();
        String[] judul = getResources().getStringArray(R.array.judul_buku_buku);
        String[] sinopsis = getResources().getStringArray(R.array.sinopsis_buku_buku);
        String[] tahun = getResources().getStringArray(R.array.tahun_buku_buku);
        String[] penulis = getResources().getStringArray(R.array.penulis_buku_buku);
        String[] penerbit = getResources().getStringArray(R.array.penerbit_buku_buku);
        int i = 0;
        for (String j : judul){
            data.add(new Buku(getResources().getIdentifier("drawable/"+"buku"+(i+1),null,getPackageName()),
                    j,sinopsis[i],tahun[i],penulis[i],penerbit[i]));
            i++;
        }
        return data;
    }
}
