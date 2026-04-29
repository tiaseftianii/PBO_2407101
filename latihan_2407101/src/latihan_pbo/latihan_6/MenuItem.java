package latihan_pbo.latihan_6;

public class MenuItem extends Menu {

    private int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungTotal() {
        return getHarga() * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println("=== Detail Menu ===");
        System.out.println("Nama   : " + getNama());
        System.out.println("Harga  : " + getHarga());
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : " + hitungTotal());
        System.out.println();
    }
}