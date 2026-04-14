package latihan_pbo.tugas.tugas_inheritence;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    // Constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // Method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}