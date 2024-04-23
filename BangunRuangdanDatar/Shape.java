package LatihanJava.BangunRuangdanDatar;


public class Shape { 
    public double volume, luas;
    public String nama;

    public Shape(double volume, double luas, String nama) {
        this.volume = volume;
        this.luas = luas;
        this.nama = nama;
        printVolumeAndArea(this);
    }

    public void printVolumeAndArea(Shape s) { 
        System.out.println("\tVolume " + nama + " = " + volume);
        System.out.println("\tLuas   " + nama + " = " + luas);
    }
}

class Cube extends Shape { 
    public double sisi;

    public Cube(double sisi) {
        super(Math.pow(sisi, 3), 6 * Math.pow(sisi, 2), "Kubus");
        this.sisi = sisi;
        
    }
    public static void main(String[] args) {
        Cube cube = new Cube(4);
    }
}

