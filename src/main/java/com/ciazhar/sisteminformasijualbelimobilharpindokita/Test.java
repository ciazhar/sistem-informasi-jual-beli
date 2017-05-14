package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public class Test {
    public static void main (String [] args){
        Karyawan ana = new Karyawan("k001",0, "Ana", "Perempuan");
        ana.detailKaryawan();
        
        Pembeli hermawan = new PembeliIndividu("p001","14045","Semarang","Hermawan", "Laki Laki");
        hermawan.detailPembeli();
        
        Pembeli hafidz = new PembeliBorongan("p002","14022","Kendal","Hafidz", "Laki Laki");
        hafidz.detailPembeli();
        
    }
}
