package latihan_pbo.tugas.tugas_polymorphism;

public class BangunDatar {
    // Encapsulation (private)
    private double varA;
    private double varB;

    // Constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    // Getter
    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    // Setter
    public void setVarA(double varA) {
        this.varA = varA;
    }

    public void setVarB(double varB) {
        this.varB = varB;
    }

    // Method hitungLuas default
    public double hitungLuas() {
        return 0;
    }

    // Method tampilkan default
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("=========================");
        System.out.println("varA: " + getVarA());
        System.out.println("varB: " + getVarB());
        System.out.println("=========================");
        System.out.println();
    }
}
