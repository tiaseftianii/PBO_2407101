package latihan_pbo.latihan_7;

public class Main {
    public static void main(String[] args) {
        BangunDatar[] bd = {
            new Persegi(7),
            new Segitiga(5, 2)
        };

        for (BangunDatar b : bd) {
            b.Display();
            System.out.println("Luas: " + b.hitungLuas());
            System.out.println("-----------------------");
        }
    }
}
