package com.ug11.kalkulasirupiah;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner teks = new Scanner(System.in);
        System.out.print("Masukkan teks: ");

        String harga = "";
        String text = teks.nextLine();

        String[] kata = text.split("\\s+");

        List<String> angka = new ArrayList();
        for(int i = 0; i < kata.length; i++){
            if(Pattern.matches("Rp\\d+\\W\\d+,00", kata[i])){
                harga = "";
                angka.add();
            }
        }

        System.out.print("Rincian biaya: ");

    }
}