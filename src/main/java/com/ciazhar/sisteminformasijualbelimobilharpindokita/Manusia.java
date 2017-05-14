package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public abstract class Manusia {

    private String nama;
    private String jenisKelamin;
    private String tipe;

    Manusia() {

    }

    Manusia(String nama, String jenisKelamin, String tipe) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tipe = tipe;
    }

    public void editManusia(String nama, String jenisKelamin, String tipe) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tipe = tipe;
    }

}
