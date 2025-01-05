package com.juaracoding.ujianjf;

import java.util.Scanner;

public class SoalTambahan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cmy40ml = 7500;
        double k = 4500;
        double constantBaseCoverage = 5;
        System.out.print("Masukkan angka base coverage (dalam persen): ");
        double baseCoverage = input.nextDouble();
        double hasilBaseCoverage = baseCoverage / constantBaseCoverage;
        double price = 216860;
        double cmyk = (cmy40ml + k) / 2;
        double pageDiv = cmyk / hasilBaseCoverage;
        double result = price / pageDiv;
        int hasil = (int) Math.ceil(result);
        System.out.println("Harganya :" + hasil);
    }
}
