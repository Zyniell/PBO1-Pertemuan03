/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mmuzakia.pbo1.pertemuan3;

/**
 *
 * @author mmuzaki.a
 */
public class PercabanganIfElse {
        public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;
        
        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang cukup, angsul : "+angsul);
        }else{
            System.out.println("Uang pas.. UwU..");
        }
    }
}
