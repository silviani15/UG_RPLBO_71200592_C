package com.ug3.soal1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "====================Data Product===================" );
        System.out.println("Masukkan Data Product makanan Anda");
        Scanner myObj = new Scanner(System.in);

        System.out.println("Nama Makanan : ");
        String makanan =myObj.nextLine();
        System.out.print("Tanggal kadaluarsa: ");
        String tanggal=myObj.nextLine();
        System.out.println("Jumlah (quantity) : ");
        int jumlah =myObj.nextInt();
        System.out.println("Berad (gram) : ");
        int berat =myObj.nextInt();


        // Output input by user
        System.out.println("Nama Makanan :" + makanan);
        System.out.println("Tanggal Kadaluarsa :" + tanggal);
        System.out.println("Jumlah (quantity) :" + jumlah);
        System.out.println("Berad (gram) :" + berat + " gram");
        System.out.println("===========================================================");
    }
}
