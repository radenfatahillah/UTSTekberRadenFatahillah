package com.raden.utstekberradenfatahillah;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BukuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Buku> data;
    private Activity context;

    public BukuAdapter(Activity context, List<Buku> data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = context.getLayoutInflater().inflate(R.layout.baris_buku, parent, false);
        BukuHolder holder = new BukuHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        BukuHolder bholder = (BukuHolder) holder;
        final Buku buku = data.get(position);
        bholder.judul.setText(buku.getJudul());
        bholder.cover.setImageResource(buku.getCover());
        bholder.tampilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailBukuActivity.class);
                intent.putExtra(MainActivity.Cover, buku.getCover());
                intent.putExtra(MainActivity.Judul, buku.getJudul());
                intent.putExtra(MainActivity.Sinopsis, buku.getSinopsis());
                intent.putExtra(MainActivity.Tahun, buku.getTahun());
                intent.putExtra(MainActivity.Penulis, buku.getPenulis());
                intent.putExtra(MainActivity.Penerbit, buku.getPenerbit());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return data == null ? 0 : data.size();
    }

    public class BukuHolder extends RecyclerView.ViewHolder {

        public ImageView cover;
        public TextView judul;
        public ConstraintLayout tampilan;

        public BukuHolder(@NonNull View itemView) {
            super(itemView);
            cover = itemView.findViewById(R.id.cover);
            judul = itemView.findViewById(R.id.judul);
            tampilan = itemView.findViewById(R.id.tampilan_buku);
        }
    }

}
