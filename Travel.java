package Projek;
import java.util.Scanner;

public class Travel {
    private Mobil mobil; 
    private String rute; 
    private String tanggal; 
    private int jumlahSeat;
    private int harga;

public Travel() {
    this.mobil = null;      
    this.rute = "";
    this.tanggal = "";
    this.jumlahSeat = 0;
    this.harga = 0;
}

public Travel(Mobil mobil, String rute, String tanggal, int jumlahSeat, int harga) {
    this.mobil = mobil;
    this.rute = rute;
    this.tanggal = tanggal;
    this.jumlahSeat = jumlahSeat;
    this.harga = harga;
}

public void pesanTravel() {
    Scanner input = new Scanner(System.in); 
    tampilkanRute();
    System.out.print("Masukkan rute (1-5) : ");
    int pilih = input.nextInt();
    input.nextLine();

    this.rute = daftarRute[pilih - 1].getNamaRute();
    this.harga = (int) daftarRute[pilih - 1].getHarga();

    System.out.print("Masukkan tanggal keberangkatan : ");
    this.tanggal = input.nextLine();

    System.out.print("Masukkan jumlah seat mobil : ");
    this.jumlahSeat = input.nextInt();
    detailTravel();

}

public double hitungTotal() {
    return harga*jumlahSeat;
}

public void detailTravel() {
    System.out.println("====Detail Travel====");
    System.out.println("Mobil       : " + mobil.getMerk());
    System.out.println("Rute        : " + rute);
    System.out.println("Tanggal     : " + tanggal);
    System.out.println("Jumlah seat : " + jumlahSeat);
    System.out.println("Harga       : Rp" + harga + " per seat");
    System.out.println("Total Harga : Rp" + hitungTotal());
}

public Mobil getMobil() {return mobil;}
public void setMobil(Mobil s) {this.mobil = s;}

public String getRute() {return rute;}
public void setRute(String s) {rute = s;}

public String getTanggal() {return tanggal;}
public void setTanggal(String s) {tanggal = s;}

public int getJumlahSeat() {return jumlahSeat;}
public void setJumlahSeat(int s) {jumlahSeat = s;}

public int getHarga() {return harga;}
public void setHarga(int s) {harga = s;}

// Kelas Rute
public class ruteTravel {
private String namaRute;
private double harga;

    public ruteTravel(String namaRute, double harga) {
        this.namaRute = namaRute;
        this.harga = harga;
        }

        public String getNamaRute() { return namaRute; }
        public double getHarga() { return harga; }
    }

    ruteTravel[] daftarRute = {
        new ruteTravel("Surabaya s/d Malang", 80000),
        new ruteTravel("Madura s/d Malang", 90000),
        new ruteTravel("Banyuwangi s/d Malang", 120000),
        new ruteTravel("Situbondo s/d Malang", 110000),
        new ruteTravel("Tulungagung s/d Malang", 75000)
    };

    public void tampilkanRute() {
        System.out.println("\n=== PILIH RUTE ===");
        for (int i = 0; i < daftarRute.length; i++) {
            System.out.println((i+1) + ". " + daftarRute[i].getNamaRute() + " - Rp " + daftarRute[i].getHarga());
        }
    }
}
