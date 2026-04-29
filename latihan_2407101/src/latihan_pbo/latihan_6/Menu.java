package latihan_pbo.latihan_6;

public class Menu {

    private String nama;
    private double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Method default
    public double hitungTotal() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Menu");
        System.out.println("======================");
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("======================");
        System.out.println();
    }
}