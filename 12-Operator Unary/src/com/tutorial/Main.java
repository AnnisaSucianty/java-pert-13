package com.tutorial;
/**
 * @author USER
 * Nama     : Annisa Sucianty Aulya Suganda
 * Kelas    : TI-B
 * NIM      : A2.1900020
 */
public class Main {
    public static void main( String[] args ){
        
        // unary = operasi yang dilakukan pada satu variabel
        
        // unary + dan -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);
        
        // unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);
        
        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);
        
        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++);
        System.out.printf("nilai hasil dari postfix menjadi =  %d \n", b);
        
        // unary boolean dengan ! untuk negasi
        
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);
    }
}