package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public abstract class Mobil {
    private String namaMobil;
    private int hargaMobil;
    private String tipeMobil;
    private int stokMobil;

   
    Mobil() {
       
    }

    public Mobil(String namaMobil, int hargaMobil, String tipeMobil, int stokMobil) {
        this.namaMobil = namaMobil;
        this.hargaMobil = hargaMobil;
        this.tipeMobil = tipeMobil;
        this.stokMobil = stokMobil;
    }

    public void editMobil(String namaMobil, int hargaMobil, String tipeMobil, int stokMobil) {
        setNamaMobil(namaMobil);
        setHargaMobil(hargaMobil);
        setTipeMobil(tipeMobil);
        setStokMobil(stokMobil);
    }
    
    public void detailMobil (){
        System.out.println("Nama Mobil              : "+getNamaMobil());
        System.out.println("Harga Mobil             : "+getHargaMobil());
        System.out.println("Tipe Mobil              : "+getTipeMobil());
        System.out.println("Stok Mobil              : "+getStokMobil());
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

    public int getStokMobil() {
        return stokMobil;
    }

    public void setStokMobil(int stokMobil) {
        this.stokMobil = stokMobil;
    }
    
    
    
    
    
    
}
