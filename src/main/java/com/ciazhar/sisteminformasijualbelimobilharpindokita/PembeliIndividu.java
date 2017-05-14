package com.ciazhar.sisteminformasijualbelimobilharpindokita;

public class PembeliIndividu extends Pembeli{
    
    public PembeliIndividu() {
    }

    public PembeliIndividu(String idPembeli, String nomorTeleponPembeli, String alamatPembeli, String nama, String jenisKelamin) {
        super(idPembeli, nomorTeleponPembeli, alamatPembeli, nama, jenisKelamin, "Pembeli Individu");
    }
    
    
}
