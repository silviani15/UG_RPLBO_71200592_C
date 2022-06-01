package com.ug13.rumahsakit;

public class Dokter {
    private String nama;
    private  String spesialis;
    private  String ruangan;

    public void memeriksa(Pasien pasien, Jadwal jadwal){
        if(jadwal.getStatusScreening()==true){
            if(pasien.getLevelPenyakit()>0){
                pasien.setLevelPenyakit();
            }else{
                pasien.setStatus();
            }
        }else{
            System.out.println("ANDA HARUS SCREENING DULU");
        }
    }
    public void cekStatus(Pasien pasien){
        if(pasien.getStatus()){
            System.out.println("PASIEN ANDA MASIH SAKIT");
        }else{
            System.out.println("pasien anda sudah sembuh dan sehat");
        }
    }
}
