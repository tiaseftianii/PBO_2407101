 package latihan_pbo.latihan1.latihan3;


    public double getSisi() {
        return sisi;
    }
 }

// class cafe {
//     public String nama;
//     private String alamat;

//     public void setNama(String nama) {
//         this.nama = nama;
//     }

//     public void setNama(String alamat) {
//         this.alamat =  alamat;

//     public 
//     }

//     void show(){
//         System.out.println(nama);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Cafe cafe2 = new Cafe();
//         cafe2.nama = "Halaman";
//         cafe2.alamat = "Indramayu";

//     }
// }



class Persegi{
    private int sisi;

    public int getSisi() {
        return sisi*sisi;
    }

    public double kelilingPersegi(){
        return sisi+sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}
public class Main {
    public static void main(String[] args) {

        Persegi p = new Persegi();
        p.setSisi(5);
        System.out.println(p.getSisi());
    }
}