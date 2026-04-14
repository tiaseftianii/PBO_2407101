package latihan_pbo.latihan4;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public void hitung() {
        luas = sisi * sisi;
        keliling = 4 * sisi;
    }
}