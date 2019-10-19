package com.raden.utstekberradenfatahillah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBukuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku);

        Intent intent = getIntent();
        ImageView cover = findViewById(R.id.cover);
        int cov = intent.getIntExtra(MainActivity.Cover, 0);
        cover.setImageResource(cov);

        String title = intent.getStringExtra(MainActivity.Judul);
        TextView judul = findViewById(R.id.judul);
        judul.setText(title);

        String sinop = intent.getStringExtra(MainActivity.Sinopsis);
        TextView sinopsis = findViewById(R.id.sinopsis);
        sinopsis.setText(sinop);

        String tah = intent.getStringExtra(MainActivity.Tahun);
        TextView tahun = findViewById(R.id.tahun);
        tahun.setText(tah);

        String pnl = intent.getStringExtra(MainActivity.Penulis);
        TextView penulis = findViewById(R.id.penulis);
        penulis.setText(pnl);

        String pnr = intent.getStringExtra(MainActivity.Penerbit);
        TextView penerbit = findViewById(R.id.penerbit);
        penerbit.setText(pnr);

    }
}
