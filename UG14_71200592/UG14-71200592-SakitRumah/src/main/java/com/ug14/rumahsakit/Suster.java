package com.ug14.rumahsakit;

public class Suster {
    private int idSuster=0;
    private String nama;

    public Suster(String nama) {
        this.nama = nama;
    }

    public void screening(Pasien pasien, Jadwal jadwal){
        if(jadwal.getStatusDaftar()==true){
            jadwal.setPasien(pasien);
            jadwal.setStatusScreening(true);
            System.out.println("Proses screening suster berhasil");
        }else{
            System.out.println("Anda harus melakukan pendaftaraan terlebih dahulu di bagian pelayanan!");
        }
    }
}