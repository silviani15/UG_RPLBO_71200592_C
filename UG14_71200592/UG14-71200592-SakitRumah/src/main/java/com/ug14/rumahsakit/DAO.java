package com.ug14.rumahsakit;

import java.sql.*;
public class DAO {
    public static void getPasienSembuh() {
    }

    public Dokter getDokterByID(int idDokter){

    }

    public Suster getSusterByID(int idSuster){

   }

    public Pelayanan getPelayananByID(int idPelayanan){

    }

    public void inputPasien(Pasien pasien){

    }

    public void inputJadwal(Jadwal jadwal){

    }

    public static void getPasienSembuh(){
        String url="jdbc:sqlite:database.db";
        String q="SELECT * from Pasien where Status='sembuh'";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(q);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateStatusPasien(){

    }
}
