package latihan_pbo.tugas.tugas_inheritence;

public class Main {
    public static void main(String[] args) {

        // Data
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        // Object
        BangunDatar bd = new BangunDatar(panjang, lebar);
        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        // Output
        System.out.println("Luas Alas: " + bd.hitungLuas());
        System.out.println("Volume: " + br.hitungVolume());
    }
}