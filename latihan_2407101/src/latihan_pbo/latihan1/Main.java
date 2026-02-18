package latihan_pbo.latihan1;

class Cafe{
    String nama;
    String alamat;

    Cafe(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println(nama);
        System.out.println(alamat);
    }

    // method
    void buka(){
        System.out.println("Cafe" + nama + "Sudah Buka");
    }

   public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        // this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

// constructor

public class Main {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        // System.out.println("Masukkan nama cafe: ");
        // cafe.nama = input.nextline();

        //System.out.println("Nama yang diinput adalah: " +cafe.nama);
        // cafe.buka();

    // Cafe cafe1 = new Cafe();
    //Cafe cafe4 = new Cafe("Janji Jiwa", "Indramayu Kota");
    //cafe4.buka();
    // cafe1.nama = "Kopi Kenangan";
    // cafe1.alamat = "Indramayu";
    
    // Cafe cafe2 = new Cafe();
    // cafe2.nama = "Kozi Coffe";
    // cafe2.alamat = "Indramayu Kota";

    // Cafe cafe3 = new Cafe();
    // cafe3.nama = "Teringat Kopi";
    // cafe3.alamat = "Sindang";
    
    //     System.out.println("Nama Cafenya adalah : " + cafe1.nama);
    //     System.out.println("Alamatnya ada di : " + cafe1.alamat);

    //     System.out.println("Nama Cafenya adalah : " + cafe2.nama);
    //     System.out.println("Alamatnya ada di : " + cafe2.alamat);

    //     System.out.println("Nama Cafenya adalah : " + cafe3.nama);
    //     System.out.println("Alamatnya ada di : " + cafe3.alamat);

    Cafe cafe5 =  new Cafe("Oksigen", "Indramayu");
        cafe5.setNama("Kozi coffe");
        cafe5.buka();
    }
}

