import java.util.Scanner;

class Pegawai {
    private String namaPegawai;
    private double gajiPokok;
    private double tunjangan;
    private double pajak;
    private double gajiBersih;


    public Pegawai(String nama, double gajiPokok) {
        this.namaPegawai = nama;
        this.gajiPokok = gajiPokok;
        hitungGaji();
    }

    /**
     * @pram
     */
    private void hitungGaji() {
        tunjangan = gajiPokok * 0.2; // tunjangan 20%
        pajak = (gajiPokok + tunjangan) * 0.05; // pajak 5%
        gajiBersih = (gajiPokok + tunjangan) - pajak;
    }

    // Method untuk menampilkan hasil
    public void tampilkanData() {
        System.out.println("\n=== Data Gaji Pegawai ===");
        System.out.println("Nama Pegawai  : " + namaPegawai);
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Tunjangan     : Rp " + tunjangan);
        System.out.println("Pajak (5%)    : Rp " + pajak);
        System.out.println("Gaji Bersih   : Rp " + gajiBersih);
        System.out.println("Selamat menghabiskan uang");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Kalkulator Gaji Pegawai ===");
        System.out.print("Masukkan Nama Pegawai: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Gaji Pokok: Rp ");
        double gajiPokok = input.nextDouble();

        Pegawai pegawai = new Pegawai(nama, gajiPokok);
        pegawai.tampilkanData();

        input.close();
    }
}
