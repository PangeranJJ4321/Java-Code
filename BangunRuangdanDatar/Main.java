package LatihanJava.BangunRuangdanDatar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String jenisBangun;
        String nama;
        Scanner input = new Scanner(System.in);

        
        pertama:
        do {
            cek();
            jenisBangun = input.nextLine();
            kedua: 
            if (jenisBangun.equals("1") || jenisBangun.equals("2") || jenisBangun.equals("3")) {
                
                if (jenisBangun.equals("1")){
                    batas();
                    System.out.println("Wah, anda memilih nomor 1. Silahkan pilih Bangun Ruang yang tersedia:\n1. Kubus\n2. Balok\n3. Bola\n4. Tabung\n5. Kembali");
                    System.out.print(">> ");
                    nama = input.nextLine();
                    batas();

                    if (nama.equals("1")){
                        System.out.println("Silahkan masukkan panjang sisi kubus: ");
                        System.out.print("Sisi : ");
                        double sisi = input.nextDouble();

                        System.out.println("Volume dan Luas Kubus adalah :\n");
                        BangunRuang kubus = new Kubus(sisi);
                        batas();
                        break pertama;

                    } else if (nama.equals("2")){
                        System.out.println("Silahkan masukkan panjang, lebar, dan tinggi balok: ");
                        System.out.print("Panjang : ");
                        double panjang = input.nextDouble();
                        System.out.print("Lebar : ");
                        double lebar = input.nextDouble();
                        System.out.print("Tinggi : ");
                        double tinggi = input.nextDouble();

                        System.out.println("Volume dan Luas Balok adalah :\n");
                        BangunRuang balok = new Balok(panjang, lebar, tinggi);
                        batas();
                        break pertama;

                    } else if (nama.equals("3")){
                        System.out.println("Silahkan masukkan radius bola: ");
                        System.out.print("Radius : ");
                        double radius = input.nextDouble();
                        System.out.println("Volume dan Luas Bola adalah :\n");
                        BangunRuang bola = new Bola(radius);
                        batas();
                        break pertama;

                    } else if (nama.equals("4")){
                        System.out.println("Silahkan masukkan radius dan tinggi tabung: ");
                        System.out.print("Radius : ");
                        double radius = input.nextDouble();
                        System.out.print("Tinggi : ");
                        double tinggi = input.nextDouble();

                        System.out.println("Volume dan Luas Tabung adalah :\n");
                        BangunRuang tabung = new Tabung(radius, tinggi);
                        batas();
                        break pertama;
                    } else if (nama.equals("5")){
                        continue pertama;
                    }

               } else if (jenisBangun.equals("2")){
                    batas();
                    System.out.println("Wah, anda memilih bangun datar. Silahkan pilih Bangun datar yang tersedia :\n1. Persegi\n2. Persegi Panjang\n3. Lingkaran\n4. Trapesium\n5. Kembali");
                    System.out.print(">> ");
                    nama = input.nextLine();

                    if (nama.equals("1")){
                        System.out.println("Silahkan masukkan sisi persegi: ");
                        System.out.print("Sisi : ");
                        double sisi = input.nextDouble();

                        System.out.println("Luas dan keliling Persegi adalah :\n");
                        BangunDatar persegi = new Persegi(sisi);
                        batas();
                        break pertama;

                    } else if (nama.equals("2")){
                        System.out.println("Silahkan masukkan panjang dan lebar persegi panjang: ");
                        System.out.print("Panjang : ");
                        double panjang = input.nextDouble();
                        System.out.print("Lebar : ");
                        double lebar = input.nextDouble();

                        System.out.println("Luas dan keliling Persegi Panjng adalah :\n");
                        BangunDatar persegiPanjang = new PersegiPanjang(panjang, lebar);
                        batas();
                        break pertama;

                    } else if (nama.equals("3")){
                        System.out.print("Silahkan masukkan radius lingkaran : \n>> ");
                        double radius = input.nextDouble();

                        System.out.println("Luas dan keliling Lingkaran adalah :\n");
                        BangunDatar lingkaran = new Lingkaran(radius);
                        batas();
                        break pertama;

                    } else if (nama.equals("4")){
                        System.out.println("Silahkan masukkan sisi atas dan sisi bawah dan tinggi trapesium: ");
                        System.out.print("Sisi Atas : ");
                        double sisiAtas = input.nextDouble();
                        System.out.print("Sisi Bawah : ");
                        double sisiBawah = input.nextDouble();
                        System.out.print("Tinggi : ");
                        double tinggi = input.nextDouble();

                        System.out.println("Luas dan keliling Trapesium adalah :\n");
                        BangunDatar trapesium = new Trapesium(sisiAtas, sisiBawah, tinggi);
                        batas();
                        break pertama;

                    } else if(nama.equals("5")){
                        continue pertama;
                    }

                } else if (jenisBangun.equals("3")){
                    if (jenisBangun.equals("3")) {
                        batas();
                        break pertama;
                    }
                } 

            } else if (jenisBangun != "1" && jenisBangun != "2" && jenisBangun != "3") {
                batas();
                System.out.println("Masukkan angka 1, 2, atau 3.");
                break kedua;
            }
        
        } while (true);input.close();
        
        terimaKasih();
        
    }
    public static void cek(){

        System.out.println("Selamat Datang di Program Bangun Ruang dan Datar");
        System.out.println("silahkan pilih, mana yang ingin anda cari tahu:\n1. Bangun Ruang\n2. Bangun Datar\n3. Exit");
        System.out.print(">> ");
    }   

    public static void batas(){

        System.out.println("\n------------------------------------------------------------------\n");
    }

    public static void terimaKasih(){
        
        System.out.println("\nTerimakasih telah menggunakan programku. \nSampai jumpa kembali.");
    }
    
}
