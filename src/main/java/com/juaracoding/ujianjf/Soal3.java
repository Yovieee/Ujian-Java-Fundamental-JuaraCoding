package com.juaracoding.ujianjf;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Integer jumlahTiket = 6;
        Integer hari = 3;
        Integer hargaWeekend = 45000;
        Integer hargaWeekday = 35000;
        Integer harga = 0;
        Integer diskon = 0;

        if(jumlahTiket > 5) diskon = 10/100;
        if(hari <= 5 && hari > 0) {
            harga = hargaWeekend;
        } else if(hari >= 6 || hari <= 7){
            harga = hargaWeekday;
        } else {
            System.out.println("Hari itu hanya ada dalam khayalan");
        }

        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Total harga (dengan diskon): " + ((100/100-diskon)*harga*jumlahTiket));
    }
}
