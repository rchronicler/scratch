package net.rchronicler.inheritance;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    Pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
    }

    // Setter
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // Getter
    public double getGaji() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        double tunjangan = 0;
        if (jumlahAnak > 0) {
            tunjangan += 20 * jumlahAnak;
        }
        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            return 0.05 * gaji + tunjangan;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            return 0.1 * gaji + tunjangan;
        } else if (lamaBekerja > 10) {
            return 0.15 * gaji + tunjangan;
        } else {
            return 0;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "\nTahun masuk   : %s\n" +
                "Jumlah anak   : %d\n" +
                "Gaji          : $ %.2f\n",
                getTahunMasuk(),
                getJumlahAnak(),
                getGaji()
        );
    }

    public static void main(String[] args) {
        // Lama bekerja 2 tahun, 2 anak
        Pekerja septiawan = new Pekerja(1000, 2022, 03, 02, 2, "Septiawan", "232", true, true);
        System.out.println(septiawan);

        // Lama bekerja 9 tahun
        Pekerja dimas = new Pekerja(5000, 2015, 03, 02, 0, "Dimas", "1232", true, true);
        System.out.println(dimas);

        // Lama bekerja 20 tahun, anak 10
        Pekerja joni = new Pekerja(10000, 2004, 03, 02, 10, "Joni", "000", true, true);
        System.out.println(joni);
    }
}
