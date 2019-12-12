package com.tutorial;
/**
 * @author USER
 * Nama     : Annisa Sucianty Aulya Suganda
 * Kelas    : TI-B
 * NIM      : A2.1900020
 */
public class Main {
     public static void main (String[] args){
//        while (kondisi){
//        aksi
//        }

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);
            if (a == 10){
                kondisi = false;
            }
            a++;
        }
        System.out.println("akhir program");
    }
}
