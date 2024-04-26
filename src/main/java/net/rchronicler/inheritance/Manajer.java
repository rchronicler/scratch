package net.rchronicler.inheritance;

public class Manajer extends Pekerja {
    private String departemen;

    Manajer(String departemen, double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    // Setter
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // Getter
    public String getDepartemen() {
        return departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.1 * getGaji());
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "Departemen    : %s",
                getDepartemen()
        );
    }

    public static void main(String[] args) {
        Manajer dimas = new Manajer("HRD", 7500, 2009, 1, 2, 3, "DIMAS", "111", true, true);
        System.out.println(dimas);
    }
}
