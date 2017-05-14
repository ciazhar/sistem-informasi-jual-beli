package com.ciazhar.sisteminformasijualbelimobilharpindokita;

import java.util.ArrayList;
import java.util.List;

public class Pembeli extends Manusia{
    private String idPembeli;
    private String nomorTeleponPembeli;
    private String alamatPembeli;
    
    Pembeli(){
        
    }

    public Pembeli(String idPembeli, String nomorTeleponPembeli, String alamatPembeli, String nama, String jenisKelamin, String tipe) {
        super(nama, jenisKelamin, tipe);
        this.idPembeli = idPembeli;
        this.nomorTeleponPembeli = nomorTeleponPembeli;
        this.alamatPembeli = alamatPembeli;
    }

    public void editPembeli(String nama, String jenisKelamin, String tipe, String idPembeli, String nomorTeleponPembeli, String tipePembeli, String alamatPembeli) {
        editManusia(nama, jenisKelamin, tipe);
        setIdPembeli(idPembeli);
        setNomorTeleponPembeli(nomorTeleponPembeli);
        setAlamatPembeli(alamatPembeli);
    }
    
    public void detailPembeli(){
        detailManusia();
        System.out.println("Nomor Telepon Pembeli   : "+getNomorTeleponPembeli());
        System.out.println("Alamat Pembeli          : "+getAlamatPembeli());
    }
    
    public void beliMobil(Mobil mobil, int jumlah, Karyawan karyawan, Penjualan penjualan){
        int stokMobilUpdated = mobil.getStokMobil() - jumlah;
        mobil.setStokMobil(stokMobilUpdated);
        
        int labaKaryawanUpdated = mobil.getHargaMobil() *jumlah / 10;
        karyawan.setLabaKaryawan(labaKaryawanUpdated);
        
        penjualan.setKaryawan(karyawan);
        penjualan.setMobil(mobil);
        penjualan.setPembeli(this);
//        penjualan.tambahTransaksi(penjualan);
        
        List<Penjualan> penjualans = new ArrayList<>();
        penjualans.add(penjualan);
        penjualan.setDaftarTransaksi(penjualans);
    }

    public String getIdPembeli() {
        return idPembeli;
    }

    public void setIdPembeli(String idPembeli) {
        this.idPembeli = idPembeli;
    }

    public String getNomorTeleponPembeli() {
        return nomorTeleponPembeli;
    }

    public void setNomorTeleponPembeli(String nomorTeleponPembeli) {
        this.nomorTeleponPembeli = nomorTeleponPembeli;
    }

    
    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }
    
    
}

