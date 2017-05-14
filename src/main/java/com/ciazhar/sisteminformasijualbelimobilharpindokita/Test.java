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
        MobilBus brt = new MobilBus("Brt", 200000000);
        brt.detailMobil();
        
        ///Mobil Minibus
        MobilMinibus inova = new MobilMinibus("Inova", 100000000);
        inova.detailMobil();
        
        ///Mobil Sedan
        MobilSedan corola = new MobilSedan("Corola", 150000000);
        corola.detailMobil();
        
        ///SetHarga
        ana.setHargaMobil(corola, 0);
        corola.detailMobil();
    }
}
