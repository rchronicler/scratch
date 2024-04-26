package net.rchronicler.inheritance;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    // Setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Getter
    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int noProdi = Integer.parseInt(nim.substring(6, 7));
        String prodi;
        switch (noProdi) {
            case 2:
                prodi = "Teknik Informatika";
                break;
            case 3:
                prodi = "Teknik Komputer";
                break;
            case 4:
                prodi = "Sistem Informasi";
                break;
            case 6:
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case 7:
                prodi = "Teknologi Informasi";
                break;
            default:
                return "Prodi tidak valid";

        }
        return prodi + ", 20" + angkatan;
    }


    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.00;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75.00;
        } else return 0.00;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "\nNIM           : %s\n" +
                "IPK           : %.1f\n" +
                "Status        : %s",
                getNim(),
                getIpk(),
                getStatus()
        );
    }

    public static void main(String[] args) {
        MahasiswaFILKOM satu = new MahasiswaFILKOM("235150707111052", 2.5, "Dimas Akmal Andrian", "111", true, false);
        System.out.println(satu + "\n");

        MahasiswaFILKOM dua = new MahasiswaFILKOM("235150707111052", 3.4, "Dimas Akmal Andrian", "222", true, false);
        System.out.println(dua + "\n");

        MahasiswaFILKOM dimas = new MahasiswaFILKOM("235150707111052", 4.0, "Dimas Akmal Andrian", "333", true, false);
        System.out.println(dimas + "\n");
    }
}
