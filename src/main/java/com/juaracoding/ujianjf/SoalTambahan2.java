package com.juaracoding.ujianjf;

import java.util.Scanner;

public class SoalTambahan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("MASUKKAN NAMA: ");
        String nama = input.nextLine();
        String divisi = "";
        String level = "";
        System.out.print("MASUKKAN NILAI KANDIDAT (0-10): ");
        int myValueSQA = input.nextInt();
        int salary = 0;

        int standardCompanyQA = 6;
        int standardSeniorAutomation = 8;
        int standardSeniorManual = standardCompanyQA;

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

        System.out.println("Nama :" + nama);
        System.out.println("Divisi :" + divisi);
        System.out.println("Level :" + level);
        System.out.println("Gaji :" + salary);
    }
}
