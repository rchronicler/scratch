package net.rchronicler.polymorphism;

public class Main {
    public static void main(String[] args) {
        Kue[] tokoKue = new Kue[5];

        tokoKue[0] = new KueJadi("Klepon", 2000, 5);
        tokoKue[1] = new KueJadi("Lemper", 2500, 7);
        tokoKue[2] = new KuePesanan("Lumpia", 2500, 5.4);
        tokoKue[3] = new KuePesanan("Apem", 5000, 2.3);
        tokoKue[4] = new KueJadi("Serabi", 10000, 4);

        double totalHargaSemuaJenis = 0;
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        Kue kuePalingMahal = tokoKue[0];
        for (Kue kue : tokoKue) {
            totalHargaSemuaJenis += kue.hitungHarga();

            if(kue.hitungHarga() > kuePalingMahal.hitungHarga()) {
                kuePalingMahal = kue;
            }

            if(kue.getClass().getSimpleName().equals("KuePesanan")) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }

            if(kue.getClass().getSimpleName().equals("KueJadi")) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }

            System.out.println(kue);
            System.out.printf("Harga total: Rp. %.2f\n", kue.hitungHarga());
            System.out.println();

        }

        System.out.printf("Total harga semua jenis kue: Rp. %.2f\n\n", totalHargaSemuaJenis);

        System.out.printf("Total harga kue pesanan: Rp. %.2f\n", totalHargaKuePesanan);
        System.out.printf("Total berat kue pesanan: %.1f kg\n\n", totalBeratKuePesanan);

        System.out.printf("Total harga kue jadi: Rp. %.2f\n", totalHargaKueJadi);
        System.out.printf("Total jumlah kue jadi: %.0f", totalJumlahKueJadi);

        System.out.printf("\n\nKue dengan harga akhir terbesar: \n%s (Rp. %.2f)", kuePalingMahal.getNama(),
                kuePalingMahal.hitungHarga());
    }
}
