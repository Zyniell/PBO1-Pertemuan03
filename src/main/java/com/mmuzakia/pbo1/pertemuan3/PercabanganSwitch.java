/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mmuzakia.pbo1.pertemuan3;

/**
 *
 * @author mmuzaki.a
 */
public class PercabanganSwitch {
     public static void main(String[] args) {
    
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima Kasih pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case  'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen : \"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen : \"!@#$%\"");
                System.out.println("Mhs   :  \"Hihihi..\"");
                break;
            default:
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen : \"Bujur jua kah?\"");
                System.out.println("Dosen : \"*Memeriksa Berkas\"");
                System.out.println("Dosen : \"*Menceleng\"");
                System.out.println("Mhs   :  \"Kabur..\"");
                break;
        }
    }
}
