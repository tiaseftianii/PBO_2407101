package latihan_pbo.tugas.tugas_polymorphism;

public class Persegi extends BangunDatar {

    public Persegi(double sisi) {
        super(sisi);
    }

    @Override
    public double hitungLuas() {
        double sisi = getVarA();
        return sisi * sisi;
    }

    @Override
    public void tampilkan() {
        System.out.println("=== Persegi ===");
        System.out.println("Sisi   : " + getVarA());
        System.out.println("Luas   : " + hitungLuas());
        System.out.println();
    }
}
