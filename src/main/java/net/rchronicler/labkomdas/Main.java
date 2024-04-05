package net.rchronicler.labkomdas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double hargaJaketA = 100000;
        final double hargaJaketB = 125000;
        final double hargaJaketC = 175000;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat datang di program CV. Labkomdas!");
            System.out.println("--------------------------------------------");
            System.out.println("Silahkan pilih jenis jaket yang diinginkan:");
            System.out.println("1. Jaket A (harga normal : Rp. 100.000, harga diskon : Rp. 95.000)");
            System.out.println("2. Jaket B (harga normal : Rp. 125.000, harga diskon : Rp. 120.000)");
            System.out.println("3. Jaket C (harga normal : Rp. 175.000, harga diskon : Rp. 160.000)");
            System.out.println("--------------------------------------------");

            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();

            int jumlah;
            double total;
            switch (pilihan) {
                case 1:
                    System.out.print("Input jumlah jaket yang diinginkan: ");
                    jumlah = sc.nextInt();
                    if (jumlah > 100) {
                        total = (hargaJaketA - 5000) * jumlah;
                        System.out.println("Pembelian lebih dari 100, anda berhasil mendapatkan diskon! Harga satuan jaket A menjadi Rp. 95.000");
                        System.out.printf("Total harga %d jaket adalah Rp. %,.0f", jumlah, total);
                    } else if(jumlah > 0) {
                        total = hargaJaketA * jumlah;
                        System.out.printf("Total harga %d jaket adalah Rp. %,.0f", jumlah, total);
                    } else {
                        System.out.println("Jumlah harus lebih dari 0!");
                    }
                    break;
                case 2:
                    System.out.print("Input jumlah jaket yang diinginkan: ");
                    jumlah = sc.nextInt();
                    if (jumlah > 100) {
                        total = (hargaJaketB - 5000) * jumlah;
                        System.out.println("Pembelian lebih dari 100, anda berhasil mendapatkan diskon! Harga satuan jaket B menjadi Rp. 120.000");
                        System.out.printf("Total harga %d jaket adalah Rp. %,.0f", jumlah, total);
                    } else if(jumlah > 0) {
                        total = hargaJaketB * jumlah;
                        System.out.printf("Total harga %d jaket adalah Rp. %,.0f", jumlah, total);
                    } else {
                        System.out.println("Jumlah harus lebih dari 0!");
                    }
                    break;
                case 3:
                    System.out.print("Input jumlah jaket yang diinginkan: ");
                    jumlah = sc.nextInt();
                    if (jumlah > 100) {
                        total = (hargaJaketC - 15000) * jumlah;
                        System.out.println("Pembelian lebih dari 100, anda berhasil mendapatkan diskon! Harga satuan jaket C menjadi Rp. 160.000");
                        System.out.printf("Total harga %d jaket adalah Rp. %,.0f", jumlah, total);
                    } else if(jumlah > 0) {
                        total = hargaJaketC * jumlah;
                        System.out.printf("Total harga %d jaket adalah Rp. %,.0f", jumlah, total);
                    } else {
                        System.out.println("Jumlah harus lebih dari 0!");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program CV. Labkomdas!");
                default:
                    System.out.println("Jaket tidak tersedia!");
            }

            System.out.println("\n--------------------------------------------");


            System.out.print("Apakah Anda ingin membuat transaksi baru? (y/n): ");
            char ulang = sc.next().charAt(0);

            if (ulang == 'n'){
                pilihan = 0;
            } else {
                continue;
            }

            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan program CV. Labkomdas!");
                break;
            }
        }
    }
}
