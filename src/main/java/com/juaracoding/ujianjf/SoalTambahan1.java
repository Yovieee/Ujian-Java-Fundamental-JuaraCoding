package com.juaracoding.ujianjf;

import java.util.Scanner;

public class SoalTambahan1 {
    public static void main(String[] args) {
        // Inisialisasi variabel
        Scanner input = new Scanner(System.in);
        double cmy40ml = 7500;
        double k = 4500;
        double constantBaseCoverage = 5;
        double baseCoverage = 0;
        double hasilBaseCoverage = 0;
        double price = 216860;
        double cmyk = (cmy40ml + k) / 2;
        double pageDiv = 0;
        double result = 0;
        int hasil = (int) Math.ceil(result);

        // Menerima inputan user
        System.out.print("Masukkan angka base coverage (dalam persen): ");
        baseCoverage = input.nextDouble();
        
        // Menghitung harga
        hasilBaseCoverage = baseCoverage / constantBaseCoverage;
        pageDiv = cmyk / hasilBaseCoverage;
        result = price / pageDiv;
        hasil = (int) Math.ceil(result);

        // Menampilkan hasil
        System.out.println("Harganya :" + hasil);
    }
}
