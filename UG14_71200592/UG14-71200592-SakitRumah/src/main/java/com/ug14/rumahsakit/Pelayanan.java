package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayan = 0;
    private String nama;

    public Pelayanan(String nama) {

        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal) {
        jadwal.setStatusDaftar(true);
        jadwal.setDokter(dokter);
        jadwal.setPasien(pasien);
        jadwal.setSuster(suster);
        System.out.println("proses penjadwalan berhasil");
    }

    public Pasien registrasi(){
        Scanner rm = new Scanner(System.in);
        System.out.print("Masukkan rm baru : ");
        String rrm = rm.nextLine();
        int rmm = Integer.parseInt(rrm);

        Scanner nama = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String name = nama.nextLine();
        String namaa = new String(String.valueOf(name));

        Scanner usia = new Scanner(System.in);
        System.out.print("Masukkan usia anda : ");
        String age = usia.nextLine();
        int agee = Integer.parseInt(age);

        Scanner alamat = new Scanner(System.in);
        System.out.print("Masukkan alamat anda : ");
        String alamaT = alamat.nextLine();
        String Alamat = new String(String.valueOf(alamaT));

        Scanner penyakit = new Scanner(System.in);
        System.out.print("Masukkan penyakit anda : ");
        String Penyakit = penyakit.nextLine();
        String penyakiT = new String(String.valueOf(Penyakit));
        System.out.println();

        return new Pasien(rmm,namaa,agee,Alamat, penyakiT);
    }
}