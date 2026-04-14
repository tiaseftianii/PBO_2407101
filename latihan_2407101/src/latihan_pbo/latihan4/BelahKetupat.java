package latihan_pbo.latihan4;

public class BelahKetupat extends BangunDatar {
    private double diagonal1;
    private double diagonal2;
    private double sisi;

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }

    public void hitung() {
        luas = 0.5 * diagonal1 * diagonal2;
        keliling = 4 * sisi;
    }
}