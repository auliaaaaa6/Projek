package Projek;

public class Mobil {
    private String merk;
    private String warna;
    private String noPlat;
    private int tahunKeluaran;
    private String jenisTransmisi;

    public Mobil() {
        this.merk = "";
        this.warna = "";
        this.noPlat = "";
        this.tahunKeluaran = 0;
        this.jenisTransmisi = ""; 

    }

    public Mobil (String merk, String warna, String noPlat, int tahunKeluaran, String jenisTransmisi) {
        this.merk = merk;
        this.warna = warna;
        this.noPlat = noPlat;
        this.tahunKeluaran = tahunKeluaran;
        this.jenisTransmisi = jenisTransmisi; 
    }

    public void menampilkanData() {
        System.out.println("\n======Data Mobil======");
        System.out.println("Merk mobil     : " + merk);
        System.out.println("Warna mobil    : " + warna);
        System.out.println("Plat mobil     : " + noPlat);
        System.out.println("Tahun keluar   : " + tahunKeluaran);
        System.out.println("Jenis transmisi: " + jenisTransmisi);
    }

    public String getMerk() {
        return merk;
    }
    public String getNoPlat () {
        return noPlat;
    }
    public void setWarna (String warna) {
        this.warna = warna;
    }
    public int getTahunKeluaran () {
        return tahunKeluaran;
    }
    public String getJenisTransmisi () {
        return jenisTransmisi;
    }
}