package com.ug13.rumahsakit;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Jadwal {
    private Pasien pasien;
    private  Dokter dokter;
    private Suster suster;
    private Pelayanan pelayan;
    private Boolean statusDaftar=false;
    private Boolean statusScreening=false;

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Suster getSuster() {
        return suster;
    }

    public void setSuster(Suster suster) {
        this.suster = suster;
    }

    public Pelayanan getPelayan() {
        return pelayan;
    }

    public void setPelayan(Pelayanan pelayan) {
        this.pelayan = pelayan;
    }

    public Boolean getStatusDaftar() {
        return statusDaftar;
    }

    public void setStatusDaftar(Boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public Boolean getStatusScreening() {
        return statusScreening;
    }

    public void setStatusScreening(Boolean statusScreening) {
        this.statusScreening = statusScreening;
    }
}
