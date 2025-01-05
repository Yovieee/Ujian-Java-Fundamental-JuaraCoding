package com.juaracoding.ujianjf;

import java.util.Scanner;

public class SoalTambahan2 {
    public static void main(String[] args) {
        // Inisialisasi variabel
        Scanner input = new Scanner(System.in);
        String divisi = "";
        String level = "";
        int salary = 0;
        String nama = "";
        int standardCompanyQA = 6;
        int standardSeniorAutomation = 8;
        int standardSeniorManual = standardCompanyQA;
        int myValueSQA = 0;

        // Menerima inputan user
        System.out.print("MASUKKAN NAMA: ");
        nama = input.nextLine();
        System.out.print("MASUKKAN NILAI KANDIDAT (0-10): ");
        myValueSQA = input.nextInt();

        // Menetapkan divisi, level dan gaji
        if (myValueSQA > standardCompanyQA) {
            divisi = "QA Automation";
            if (myValueSQA > standardSeniorAutomation) {
                level = "Senior";
                salary = 10;
            } else {
                level = "Junior";
                salary = 8;
            }
        } else {
            divisi = "QA Manual";
            if (myValueSQA > standardSeniorManual) {
                level = "Senior";
                salary = 8;
            } else {
                level = "Junior";
                salary = 6;
            }
        }

        // Menampilkan hasil
        System.out.println("Nama :" + nama);
        System.out.println("Divisi :" + divisi);
        System.out.println("Level :" + level);
        System.out.println("Gaji :" + salary);
    }
}
