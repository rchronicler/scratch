package net.rchronicler.polymorphism;

abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public double hitungHarga() {
        return getHarga();
    }

    @Override
    public String toString() {
        return "Jenis:" + getClass().getSimpleName().replaceAll("(\\p{Lu})", " $1") + "\nNama: "
                + nama + String.format("\nHarga: Rp. %.2f", harga);
    }

}

class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public void setBerat(double berat){
        this.berat = berat;
    }

    public double getBerat(){
        return berat;
    }

    @Override
    public double hitungHarga() {
        return super.hitungHarga() * berat;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBerat: " + berat + " kg";
    }
}

class KueJadi extends Kue{
    private double jumlah;

    public KueJadi(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public double getJumlah(){
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return super.hitungHarga() * jumlah * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJumlah: " + (int) jumlah + " buah";
    }
}

