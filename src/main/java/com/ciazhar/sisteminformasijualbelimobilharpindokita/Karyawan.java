package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public class Karyawan extends Manusia{
    private String idKaryawan;
    private String laba;
    
    Karyawan(){
        
    }
    
    Karyawan(String idKaryawan, String nama, String jenisKelamin, String tipe){
        super(nama,jenisKelamin,tipe);
        this.idKaryawan = idKaryawan;   
    }
    
    public void detailKaryawan(){
        
    }
}
