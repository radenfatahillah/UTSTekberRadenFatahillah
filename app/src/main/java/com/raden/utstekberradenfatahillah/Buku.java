package com.raden.utstekberradenfatahillah;

public class Buku {
    private String judul, sinopsis, tahun, penulis, penerbit;
    private int cover;

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penulis = penerbit;
    }

    public Buku(int cover, String judul, String sinopsis, String tahun, String penulis, String penerbit) {
        this.cover = cover;
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.tahun = tahun;
        this.penulis = penulis;
        this.penerbit = penerbit;

    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
