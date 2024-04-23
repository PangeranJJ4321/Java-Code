package LatihanJava.BangunRuangdanDatar;
import static java.lang.Math.PI;

import java.text.DecimalFormat;

public class BangunDatar {
    public double luas;
    public double keliling;

    DecimalFormat df = new DecimalFormat("#.##");

    public BangunDatar(double luas, double keliling) {
        this.luas = luas;
        this.keliling = keliling;

        findLuas_Keliling(this);
    }

    public void findLuas_Keliling(BangunDatar b) {
        System.out.println("\tLuas        = " + df.format(b.luas));
        System.out.println("\tKeliling    = " + df.format(b.keliling));
    }
}

class Persegi extends BangunDatar {
    public double sisi;

    public Persegi(double sisi) {
        super((sisi * sisi), (4 * sisi));
    }
}

class PersegiPanjang extends BangunDatar {
    public double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super((panjang * lebar), (2 * (panjang + lebar)));
    }
}

class Lingkaran extends BangunDatar {
    public double radius;

    public Lingkaran(double radius) {
        super((PI * radius * radius), (2 * PI * radius));
    }
}

class Trapesium extends BangunDatar {
    public double sisiAtas, sisiBawah, tinggi;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi) {
        super((0.5 * (sisiAtas + sisiBawah) * tinggi), (sisiAtas + sisiBawah + 2 * tinggi));
    }
}