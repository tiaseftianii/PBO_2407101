package latihan_pbo.latihan_7;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi (double sisi){
       super("Persegi");
    }

    @Override
    double hitungLuas(){
        return sisi*sisi;
    }
}
