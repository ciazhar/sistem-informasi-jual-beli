package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public abstract class Mobil {
    private String namaMobil;
    private int hargaMobil;
    private String tipeMobil;

   
    Mobil() {
       
    }

    public Mobil(String namaMobil, int hargaMobil, String tipeMobil) {
        this.namaMobil = namaMobil;
        this.hargaMobil = hargaMobil;
        this.tipeMobil = tipeMobil;
    }

    public void editMobil(String namaMobil, int hargaMobil, String tipeMobil) {
        setNamaMobil(namaMobil);
        setHargaMobil(hargaMobil);
        setTipeMobil(tipeMobil);
    }
    
    public void detailMobil (){
        System.out.println("Nama Mobil              : "+getNamaMobil());
        System.out.println("Harga Mobil             : "+getHargaMobil());
        System.out.println("Tipe Mobil              : "+getTipeMobil());
        System.out.println("");
    }
    
    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public int getHargaMobil() {
        return hargaMobil;
    }

    public void setHargaMobil(int hargaMobil) {
        this.hargaMobil = hargaMobil;
    }

    public String getTipeMobil() {
        return tipeMobil;
    }

    public void setTipeMobil(String tipeMobil) {
        this.tipeMobil = tipeMobil;
    }
    
    
    
    
    
    
}
