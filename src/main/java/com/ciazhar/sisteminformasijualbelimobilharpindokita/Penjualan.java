package com.ciazhar.sisteminformasijualbelimobilharpindokita;

import java.util.ArrayList;
import java.util.List;

public class Penjualan {
    private Karyawan karyawan;
    private Pembeli pembeli;
    private Mobil mobil;
    
    

    public Penjualan() {
    }

    
    public Penjualan(Karyawan karyawan, Pembeli pembeli, Mobil mobil) {
        this.karyawan = karyawan;
        this.pembeli = pembeli;
        this.mobil = mobil;
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