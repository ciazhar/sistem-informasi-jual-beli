package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public class PembeliBorongan extends Pembeli{
    
    private String namaInstansi;
    
    public PembeliBorongan() {
    }

    
    public PembeliBorongan(String namaInstansi, String idPembeli, String nomorTeleponPembeli, String alamatPembeli, String nama, String jenisKelamin) {
        super(idPembeli, nomorTeleponPembeli, alamatPembeli, nama, jenisKelamin, "Pembeli Borongan");
        this.namaInstansi = namaInstansi;
    }
    
    public void editPembeliBorongan(String namaInstansi, String nama, String jenisKelamin, String tipe, String idPembeli, String nomorTeleponPembeli, String tipePembeli, String alamatPembeli) {
        editPembeli(nama, jenisKelamin, tipe, idPembeli, nomorTeleponPembeli, tipePembeli, alamatPembeli);
        setNamaInstansi(namaInstansi);
    }
    
    public void detailPembeliBorongan(){
        detailPembeli();
        System.out.println("Nama Instansi           : "+getNamaInstansi());
        System.out.println("");
    }

    public String getNamaInstansi() {
        return namaInstansi;
    }

    public void setNamaInstansi(String namaInstansi) {
        this.namaInstansi = namaInstansi;
    }
    
    
    
}
