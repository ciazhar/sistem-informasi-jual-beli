package com.ciazhar.sisteminformasijualbelimobilharpindokita;

import java.util.ArrayList;
import java.util.List;

public class DetailPenjualan {
    public List<Penjualan> daftarTransaksi = new ArrayList();    

    public DetailPenjualan() {
    }

    
    public void setDaftarTransaksi(Penjualan penjualan) {
        this.daftarTransaksi.add(penjualan);
    }

    public List<Penjualan> getDaftarTransaksi() {
        return daftarTransaksi;
    }

    
    public void tambahTransaksi(Penjualan penjualan) {
        this.daftarTransaksi.add(penjualan);
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

    
}
