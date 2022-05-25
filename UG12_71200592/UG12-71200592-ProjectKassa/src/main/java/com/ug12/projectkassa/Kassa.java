package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Kassa{
    private HashMap<Produk,Integer> pesanan;
    private ArrayList<Kasir> arrKasir;
    private Kasir kasir;
    public Kassa(){

    }

    public void register(Kasir kasir){
        arrKasir.add(kasir);
        System.out.println("Kasir "+kasir.getNama()+"Berhasil ditambahkan ke dalam sistem");
    }

    public void Login(String username, String password){
        for(int i=0; i < arrKasir.size(); i++){
            if(arrKasir.get(i).getUsername().compareTo(username)==0 && arrKasir.get(i).getPassword().compareTo(username)==0){
                this.kasir = arrKasir.get(i);
                System.out.println("Login berhasil");
            }else{
                System.out.println("Username/password anda salah!");
            }
        }
    }

    public void tambahPesanan(Produk produk, int jumlah){
        this.pesanan.put(produk, jumlah);
    }

    public void printNota(){
        System.out.println("==========Nota==========");
        System.out.println("Kasir: "+kasir.getNama());
        System.out.println("No. Nama Barang   Jumlah   Harga    SubTotal");
    }

    public void printPenjualanKasir(){

    }
}
