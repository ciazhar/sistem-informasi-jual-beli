package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public class Karyawan extends Manusia{
    private String idKaryawan;
    private int labaKaryawan;
    
    Karyawan(){
        
    }
    
    Karyawan(String idKaryawan, int labaKaryawan, String nama, String jenisKelamin){
        super(nama,jenisKelamin,"Karyawan");
        this.idKaryawan = idKaryawan;   
        this.labaKaryawan = labaKaryawan;
    }

    public void editKaryawan(String idKaryawan, int labaKaryawan, String nama, String jenisKelamin, String tipe) {
        editManusia(nama, jenisKelamin, tipe);
        this.idKaryawan = idKaryawan;
        this.labaKaryawan = labaKaryawan;
    }
    
    public void detailKaryawan(){
        detailManusia();
        System.out.println("Laba                    : "+labaKaryawan);
        System.out.println("");
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public int getLabaKaryawan() {
        return labaKaryawan;
    }

    public void setLabaKaryawan(int labaKaryawan) {
        this.labaKaryawan = labaKaryawan;
    }

    
    
        
}
