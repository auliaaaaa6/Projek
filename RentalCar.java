package Projek;
import java.util.Scanner;

public class RentalCar {
    private String merk;
    private String noPlat;
    private double harga;
    private String penyewa; 
    private int durasiSewa;
    private ManajemenMobil mm;

public RentalCar(ManajemenMobil mm) {
    this.mm = mm;
}

public void sewaMobil() {
    Scanner input = new Scanner (System.in);
    System.out.print("Nama: ");
    this.penyewa = input.nextLine();
    System.out.print("Durasi sewa: ");
    this.durasiSewa = input.nextInt();
    input.nextLine();

    mm.menampilkanDataMobil();
    System.out.print("Pilih merk mobil: ");
    String pilih = input.nextLine();

    Mobil mobilDipilih = mm.getMobilRental(pilih);
    this.merk = mobilDipilih.getMerk();
    this.noPlat = mobilDipilih.getNoPlat();
    this.harga = tentukanHarga(mobilDipilih);
    detailSewa();

}
public double hitungTotal() {
    return harga*durasiSewa;
}
public double tentukanHarga(Mobil m) {
        if (m.getMerk().equalsIgnoreCase("Toyota")) return 300000;
        if (m.getMerk().equalsIgnoreCase("Honda HRV")) return 350000;
        if (m.getMerk().equalsIgnoreCase("Mazda")) return 500000;
        return 250000;
    }

public void detailSewa() {
    System.out.println("======Detail Sewa======");
    System.out.println("Nama penyewa   : " + penyewa);
    System.out.println("Merk mobil     : " + merk);
    System.out.println("Plat mobil     : " + noPlat);
    System.out.printf("Harga sewa     : Rp %,.2f\n" , harga, " per hari");
    System.out.println("Durasi sewa    : " + durasiSewa + " hari");
    System.out.printf("Total harga    : Rp %,.2f\n" , hitungTotal());
}

public String getMerk() {return merk;}
public void setMerk(Mobil s) {merk = s;}

public String getnoPlat() {return noPlat;}
public void setnoPlat(Mobil s) {noPlat = s;}

public double getHarga() {return harga;}
public void setHarga(double s) {harga = s;}

public String getPenyewa() {return penyewa;}
public void setPenyewa(String s) {penyewa = s;}

public int getDurasiSewa() {return durasiSewa;}
public void setDurasiSewa(int s) {durasiSewa = s;}

}
