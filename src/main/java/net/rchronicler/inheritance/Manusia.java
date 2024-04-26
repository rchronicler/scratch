package net.rchronicler.inheritance;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        if (jenisKelamin == true) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }

    public String getNik() {
        return nik;
    }

    public double getTunjangan() {
        if (menikah == true) {
            if (jenisKelamin == true) {
                return 25.00;
            } else {
                return 20.00;
            }
        } else {
            return 15.00;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }


    @Override
    public String toString() {
        return String.format(
                "Nama          : %s\n" +
                "NIK           : %s\n" +
                "Jenis Kelamin : %s\n" +
                "Pendapatan    : $ %.1f",
                getNama(),
                getNik(),
                getJenisKelamin(),
                getPendapatan()
        );
    }

    public static void main(String[] args) {
        Manusia putra = new Manusia("Putra", "111", true, true);
        System.out.println(putra + "\n");

        Manusia putri = new Manusia("Putri", "222", false, true);
        System.out.println(putri + "\n");

        Manusia putro = new Manusia("Putro", "333", true, false);
        System.out.println(putro + "\n");
    }
}
