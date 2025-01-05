package com.juaracoding.ujianjf;

public class Soal3 {
    public static void main(String[] args) {
        // Inisialisasi variabel
        Integer jumlahTiket = 6;
        Integer hari = 3;
        Integer hargaWeekend = 45000;
        Integer hargaWeekday = 35000;
        Integer harga = 0;
        Integer diskon = 0;
        Integer hargaTotal = 0;

        // Menghitung diskon
        if(jumlahTiket > 5) diskon = 10/100;

        // Menentukan harga berdasarkan hari
        if(hari <= 5 && hari > 0) {
            harga = hargaWeekend;
        } else if(hari >= 6 || hari <= 7){
            harga = hargaWeekday;
        } else {
            System.out.println("Hari itu hanya ada dalam khayalan");
        }

        // Menghitung total harga
        hargaTotal = (100/100-diskon)*harga*jumlahTiket;
        
        // Menampilkan hasil
        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Total harga (dengan diskon): " + hargaTotal);
    }
}
