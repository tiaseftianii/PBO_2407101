package latihan_pbo.latihan_6;

public class Main {

    public static void main(String[] args) {

        Menu m;
        double totalBelanja = 0;

        m = new MenuItem("Ketoprak", 12000, 3);
        m.tampilkan();
        totalBelanja += m.hitungTotal();

        m = new MenuItem("Nasi Goreng", 15000, 4);
        m.tampilkan();
        totalBelanja += m.hitungTotal();

        m = new MenuItem("Soda Gembira", 8000, 5);
        m.tampilkan();
        totalBelanja += m.hitungTotal();

        System.out.println("======================");
        System.out.println("Total Belanja: " + totalBelanja);
    }
}