package com.ug13.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien p, Dokter d, Jadwal j){
        if(p.getStatus()=="sakit"){
            j.setStatusDaftar(true);
            j.setDokter(d);
            j.setPasien(p);
            System.out.println("proses penjadwalan berhasil");
        }
    }
    public Pasien registrasi(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Masukan Nama anda: ");
        String nama=inp.nextLine();
        Scanner inp2=new Scanner(System.in);
        System.out.println("Masukan Usia anda: ");
        int usia=inp2.nextInt();
        Scanner inp3=new Scanner(System.in);
        System.out.println("Masukan penyakit anda: ");
        String penyakit=inp3.nextLine();
        System.out.println("Proses Registrasi Berhasil");
        return new Pasien(nama,usia,penyakit);
    }
}
