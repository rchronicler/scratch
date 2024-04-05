package net.rchronicler.program_hitung;

public class Hitung {
    public static int penjumlahan(int a, int b) {
        return (a + b);
    }

    public static int pengurangan(int a, int b) {
        return (a - b);
    }

    public int perkalian(int a, int b){
        return (a * b);
    }

    public int pembagian(int a, int b){
        return (a / b);
    }

    public String sederhana(int a, int b){
        int tempA = a;
        int tempB = b;

        while (tempB != 0){
            int temp = tempA % tempB;
            tempA = tempB;
            tempB = temp;
        }
        int fpb = tempA;

        a /= fpb;
        b /= fpb;

        return a + "/" + b;
    }
}