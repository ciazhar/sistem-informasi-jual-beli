package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public class Pembeli extends Manusia{
    private String idPembeli;
    private String nomorTeleponPembeli;
    private String tipePembeli;
    private String alamatPembeli;
    
    Pembeli(){
        
    }

    public Pembeli(String idPembeli, String nomorTeleponPembeli, String tipePembeli, String alamatPembeli, String nama, String jenisKelamin, String tipe) {
        super(nama, jenisKelamin, tipe);
        this.idPembeli = idPembeli;
        this.nomorTeleponPembeli = nomorTeleponPembeli;
        this.tipePembeli = tipePembeli;
        this.alamatPembeli = alamatPembeli;
    }

    public void editPembeli(String nama, String jenisKelamin, String tipe, String idPembeli, String nomorTeleponPembeli, String tipePembeli, String alamatPembeli) {
        editManusia(nama, jenisKelamin, tipe);
        this.idPembeli = idPembeli;
        this.nomorTeleponPembeli = nomorTeleponPembeli;
        this.tipePembeli = tipePembeli;
        this.alamatPembeli = alamatPembeli;
    }
    
    public void detailPembeli(){
        detailManusia();
        System.out.println("Nomor Telepon Pembeli   : "+getNomorTeleponPembeli());
        System.out.println("Tipe Pembeli            : "+getTipePembeli());
        System.out.println("Alamat Pembeli          : "+getAlamatPembeli());
        System.out.println("");
    }

    public String getIdPembeli() {
        return idPembeli;
    }

    public void setIdPembeli(String idPembeli) {
        this.idPembeli = idPembeli;
    }

    public String getNomorTeleponPembeli() {
        return nomorTeleponPembeli;
    }

    public void setNomorTeleponPembeli(String nomorTeleponPembeli) {
        this.nomorTeleponPembeli = nomorTeleponPembeli;
    }

    public String getTipePembeli() {
        return tipePembeli;
    }

    public void setTipePembeli(String tipePembeli) {
        this.tipePembeli = tipePembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }
    
    
}

