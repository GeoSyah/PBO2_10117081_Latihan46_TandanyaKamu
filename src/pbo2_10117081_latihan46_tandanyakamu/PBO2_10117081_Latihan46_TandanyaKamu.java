/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan46_tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Program untuk memperlihatkan tanda sang pengguna
 *              pada umurnya sekarang
 */
public class PBO2_10117081_Latihan46_TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Age umur = new Age(2018);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(scn1.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir Anda : "+umur.getYearBirth());
        System.out.println("Hari ini tahun : "+umur.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah : "+umur.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu : "+umur.tandanyaKamu(umur.hitungUmur()));
    }
    
}
