package LatihanJava.BangunRuangdanDatar;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.text.DecimalFormat;

public class BangunRuang {
    public double volume, luas;
    DecimalFormat df = new DecimalFormat("#.##");

    BangunRuang(double volume, double luas) {
        this.volume = volume;
        this.luas = luas;

        findVolumeLuas(this);
    }

    public void findVolumeLuas(BangunRuang b){
        System.out.println("\tVolume      =  " +  df.format(b.volume));
        System.out.println("\tLuas        =  " +  df.format(b.luas));
    }
}

class Kubus extends BangunRuang {
    double sisi;

    public Kubus(double sisi) {
        super(pow(sisi,3), (6) * pow(sisi, 2));
    }
}

class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super((panjang * lebar * tinggi), (2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi))));
    }
}

class Bola extends BangunRuang {
    double radius;

    public Bola(double radius) {
        super((4 / 3) * PI * pow(radius, 3), 4 * PI * pow(radius, 2));
    }
}

class Tabung extends BangunRuang {
    double radius, tinggi;

    public Tabung(double radius, double tinggi) {
        super( 0.33 * PI * pow(radius, 2) * tinggi, 2 * PI * radius * (radius + tinggi));
    }
}
