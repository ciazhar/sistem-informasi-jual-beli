package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public class Test {
    public static void main (String [] args){
        Karyawan andi = new Karyawan("k001",0, "Andi", "Laki Laki", "Karyawan");
        andi.detailKaryawan();
        
        Pembeli thomas = new Pembeli("k001","14045", "Individu","Semarang","Thomas", "Laki Laki", "Karyawan");
        thomas.detailPembeli();
    }
}
