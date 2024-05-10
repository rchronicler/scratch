package net.rchronicler.meneer;

public class Main {
    public static void main(String[] args) {
        Invoice[] invoices = new Invoice[3];
        invoices[0] = new Invoice("Teh Kotak", 10, 5000);
        invoices[1] = new Invoice("Mie Gelas", 2, 5000);
        invoices[2] = new Invoice("Le Minerale", 13, 3000);

        Employee dimas = new Employee(1, "dimas", 7000000, invoices);

        System.out.println("Informasi karyawan: ");
        System.out.println("Nomor registrasi: " + dimas.getRegistrationNumber());
        System.out.println("Nama: " + dimas.getName());
        System.out.printf("Gaji per bulan: Rp. %d\n", dimas.getSalaryPerMonth());

        System.out.println();

        System.out.println("Detail tagihan koperasi: ");

        int index = 1;
        double total = 0;
        for (Invoice invoice : dimas.getInvoices()) {
            total += invoice.getPayableAmount();
            System.out.printf("%d. %s (satuan Rp. %d) : %d pcs\n", index++, invoice.getProductName(), invoice.getPricePerItem(), invoice.getQuantity());
        }
        System.out.printf("Total tagihan koperasi: Rp. %.2f\n", total);

        System.out.printf("\nGaji bersih: Rp. %.2f", dimas.getPayableAmount());
    }
}
