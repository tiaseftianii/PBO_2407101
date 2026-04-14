package latihan_pbo.tugas.tugas_polymorphism;

public class Main {
    public static void main(String[] args) {

        BangunDatar bd;

        bd = new Persegi(5);
        bd.tampilkan();

        bd = new PersegiPanjang(6, 4);
        bd.tampilkan();

        bd = new Segitiga(8, 3);
        bd.tampilkan();
    }
}
