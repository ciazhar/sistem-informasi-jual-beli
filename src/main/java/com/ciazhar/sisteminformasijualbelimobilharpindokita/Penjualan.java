package com.ciazhar.sisteminformasijualbelimobilharpindokita;

import java.util.ArrayList;
import java.util.List;

public class Penjualan {
    private Karyawan karyawan;
    private Pembeli pembeli;
    private Mobil mobil;
    
    public List<Penjualan> daftarTransaksi = new ArrayList();    
    

    public Penjualan() {
    }

    
    public Penjualan(Karyawan karyawan, Pembeli pembeli, Mobil mobil) {
        this.karyawan = karyawan;
        this.pembeli = pembeli;
        this.mobil = mobil;
    }

    public void setDaftarTransaksi(List<Penjualan> daftarTransaksi) {
        this.daftarTransaksi.addAll(daftarTransaksi);
    }

    
    public void tambahTransaksi(Penjualan penjualan) {
        this.daftarTransaksi.add(penjualan);
    }
    
    public List<Penjualan> getDaftarTransaksi() {
        return daftarTransaksi;
    }
    
    
    public void listTransaksi(){
        Penjualan penjualan = new Penjualan();
        for(int i=0;i<daftarTransaksi.size();i++){
            penjualan = daftarTransaksi.get(i);
            System.out.println("Transaksi ke : "+i);
            System.out.println("Nama Karyawan               : "+penjualan.getKaryawan().getNama());
            System.out.println("Nama Pembeli                : "+penjualan.getPembeli().getNama());
            System.out.println("Nama Mobil                  : "+penjualan.getMobil().getNamaMobil());
        }
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    
    
}