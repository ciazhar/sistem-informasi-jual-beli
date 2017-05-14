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
    
    public void detailManusia(){
        System.out.println("Nama                    : "+getNama());
        System.out.println("Jenis Kelamin           : "+getJenisKelamin());
        System.out.println("Tipe                    : "+getTipe());
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

}
