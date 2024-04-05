package net.rchronicler.program_hitung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hitung h = new Hitung();

        while (true) {
            System.out.println("Selamat datang di program operasi hitung!");
            System.out.println("--------------------------------------------");
            System.out.println("Silahkan pilih operasi hitung :");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Penyederhanaan");
            System.out.println("6. Keluar");
            System.out.println("--------------------------------------------");

            System.out.print("Pilih : ");
            int pilihan = sc.nextInt();

            int a, b, hasil;
            String strHasil;
            switch(pilihan){
                case 1:
                    System.out.print("Input angka pertama: ");
                    a = sc.nextInt();
                    System.out.print("Input angka kedua: ");
                    b = sc.nextInt();
                    hasil = Hitung.penjumlahan(a, b);
                    System.out.printf("Hasil dari operasi hitung %d + %d = %d", a, b, hasil);
                    break;

                case 2:
                    System.out.print("Input angka pertama: ");
                    a = sc.nextInt();
                    System.out.print("Input angka kedua: ");
                    b = sc.nextInt();
                    hasil = Hitung.pengurangan(a, b);
                    System.out.printf("Hasil dari operasi hitung %d - %d = %d", a, b, hasil);
                    break;

                case 3:
                    System.out.print("Input angka pertama: ");
                    a = sc.nextInt();
                    System.out.print("Input angka kedua: ");
                    b = sc.nextInt();
                    hasil = h.perkalian(a, b);
                    System.out.printf("Hasil dari operasi hitung %d * %d = %d", a, b, hasil);
                    break;

                case 4:
                    System.out.print("Input angka pertama: ");
                    a = sc.nextInt();
                    System.out.print("Input angka kedua: ");
                    b = sc.nextInt();
                    hasil = h.pembagian(a, b);
                    System.out.printf("Hasil dari operasi hitung %d / %d = %d", a, b, hasil);
                    break;
                case 5:
                    System.out.print("Input angka pertama: ");
                    a = sc.nextInt();
                    System.out.print("Input angka kedua: ");
                    b = sc.nextInt();
                    strHasil = h.sederhana(a, b);
                    System.out.printf("Hasil dari penyederhanaan %d dan %d = %s", a, b, strHasil);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program operasi hitung!");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak tersedia!");
            }

            System.out.println("\n--------------------------------------------");

            System.out.print("Apakah Anda ingin memulai ulang program? (y/n): ");
            char ulang = sc.next().charAt(0);

            if (ulang == 'n'){
                pilihan = 0;
            } else {
                continue;
            }

            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan program operasi hitung!");
                break;
            }
        }
    }
}
