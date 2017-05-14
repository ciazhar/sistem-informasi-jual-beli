package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public class Test {
        
    public static void main (String [] args){
        
        ///Karyawan
        Karyawan ana = new Karyawan("k001",0, "Ana", "Perempuan");
        ana.detailKaryawan();
        
        ///Pembeli Individu
        PembeliIndividu hermawan = new PembeliIndividu("p001","14045","Semarang","Hermawan", "Laki Laki");
        hermawan.detailPembeliIndividu();
        
        ///Pembeli Borongan
        PembeliBorongan hafidz = new PembeliBorongan("DOSCOM","p002","14022","Kendal","Hafidz", "Laki Laki");
        hafidz.detailPembeliBorongan();
        
        ///Mobil Bus
        MobilBus brt = new MobilBus("Brt", 200000000,100);
        brt.detailMobil();
        
        ///Mobil Minibus
        MobilMinibus inova = new MobilMinibus("Inova", 100000000,100);
        inova.detailMobil();
        
        ///Mobil Sedan
        MobilSedan corola = new MobilSedan("Corola", 150000000,100);
        corola.detailMobil();
        
        System.out.println("Set Harga");
        ana.setHargaMobil(corola, 10000);
        corola.detailMobil();
        
        Penjualan penjualan = new Penjualan();
        System.out.println("Beli Mobil");
        hermawan.beliMobil(corola, 1, ana, penjualan);
        corola.detailMobil();
        ana.detailKaryawan();
        
        System.out.println("Beli Mobil 2");
        hafidz.beliMobil(brt, 10, ana, penjualan);
        brt.detailMobil();
        ana.detailKaryawan();
        
        System.out.println("Cek List Pembelian");
        penjualan.listTransaksi();
    }
}
