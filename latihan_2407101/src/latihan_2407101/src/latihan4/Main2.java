

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        System.out.print("Pilih (1-4): ");

        int pilih = input.nextInt();

        switch (pilih) {

            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                Persegi p = new Persegi(sisi);
                p.hitung();
                System.out.println("Luas: " + p.getLuas());
                System.out.println("Keliling: " + p.getKeliling());
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                pp.hitung();
                System.out.println("Luas: " + pp.getLuas());
                System.out.println("Keliling: " + pp.getKeliling());
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                System.out.print("Masukkan sisi A: ");
                double a = input.nextDouble();
                System.out.print("Masukkan sisi B: ");
                double b = input.nextDouble();
                System.out.print("Masukkan sisi C: ");
                double c = input.nextDouble();
                Segitiga s = new Segitiga(alas, tinggi, a, b, c);
                s.hitung();
                System.out.println("Luas: " + s.getLuas());
                System.out.println("Keliling: " + s.getKeliling());
                break;

            case 4:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.print("Masukkan sisi: ");
                double sisiBK = input.nextDouble();
                BelahKetupat bk = new BelahKetupat(d1, d2, sisiBK);
                bk.hitung();
                System.out.println("Luas: " + bk.getLuas());
                System.out.println("Keliling: " + bk.getKeliling());
                break;

            default:
                System.out.println("Pilihan tidak valid. Fokus dikit lah.");
        }

        input.close();
    }
}