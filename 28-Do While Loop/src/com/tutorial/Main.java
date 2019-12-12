package com.tutorial;
/**
 * @author USER
 * Nama     : Annisa Sucianty Aulya Suganda
 * Kelas    : TI-B
 * NIM      : A2.1900020
 */
public class Main {
    public static void main (String[] args){
//        do {
//        aksi
//        } while (kondisi);
        System.out.println("ini adalah awal program");

        int a = 0;
        boolean kondisi = true;
        do {
            a++;
            System.out.println("do while ke-" + a);

            if (a == 1) {
                kondisi = false;
            }
        }while(kondisi);
        System.out.println("ini adalah akhir program");
    }
}
