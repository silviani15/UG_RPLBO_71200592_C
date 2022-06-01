package com.ug13.rumahsakit;

public class Suster {
    private String nama;

    public Suster(String nama) {
        this.nama = nama;
    }

    public void screening(Pasien p, Jadwal j){
        if(j.getStatusDaftar()==true){
            j.setPasien(p);
            j.setStatusScreening(true);
            System.out.println("Proses screening suster berhasil");
        }else{
            System.out.println("Anda harus melakukan pendaftaraan terlebih dahulu di bagian pelayanan!");
        }
}
