package latihan_pbo.latihan_4;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Segitiga(double alas, double tinggi,
                    double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public void hitung() {
        luas = 0.5 * alas * tinggi;
        keliling = sisiA + sisiB + sisiC;
    }
}