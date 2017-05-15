package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public class PembeliIndividu extends Pembeli{
    
    public PembeliIndividu() {
    }

    public PembeliIndividu(String idPembeli, String nomorTeleponPembeli, String alamatPembeli, 
                           String nama, String jenisKelamin) {
        super(idPembeli, nomorTeleponPembeli, alamatPembeli, nama, jenisKelamin, "Pembeli Individu");
    }
    
    public void editPembeliIndividu(String nama, String jenisKelamin, String tipe, String idPembeli, 
                                    String nomorTeleponPembeli, String tipePembeli, String alamatPembeli) {
        editPembeli(nama, jenisKelamin, tipe, idPembeli, nomorTeleponPembeli, tipePembeli, alamatPembeli);
    }
    
    public void detailPembeliIndividu(){
        detailPembeli();
        System.out.println("");
    }
    
}
