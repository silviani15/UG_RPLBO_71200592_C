package com.ug12.projectkassa;

public class Kasir {
    private String password;
    private long totalPenjualan;
    private String username;
    private String nama;

    public Kasir(String password, String username, String nama) {
        this.password = password;
        this.username = username;
        this.nama = nama;
    }

    public long getTotalPenjualan() {
        return totalPenjualan;
    }

    public void setTotalPenjualan(long totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getNama() {
        return nama;
    }
}
