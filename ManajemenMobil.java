package Projek;
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenMobil {
     ArrayList<Mobil> mobil = new ArrayList<>();

     public ManajemenMobil() {
        mobil.add(new Mobil("Toyota", "Hitam", "B 1234 CD", 2018, "Automatic"));
        mobil.add(new Mobil("Honda", "Merah", "D 1111 EF", 2020, "Manual"));
    }

     public void inputDataMobil() {
        Scanner input = new Scanner (System.in);
        System.out.println("\n=== Tambah Data Mobil ===");
        
        System.out.print("Merk Mobil            : ");
        String merk = input.nextLine();
        System.out.print("Warna Body Mobil      : ");
        String warna = input.nextLine();
        System.out.print("Nomor Plat Mobil      : ");
        String noPlat = input.nextLine();
        System.out.print("Tahun Keluaran (yyyy) : ");
        int tahunKeluaran = input.nextInt();
        input.nextLine();
        System.out.print("Jenis Transmisi       : ");
        String jenisTransmisi = input.nextLine();

        Mobil m = new Mobil(merk, warna, noPlat,  tahunKeluaran, jenisTransmisi);
        mobil.add(m);

        System.out.println("Data mobil berhasil ditambahkan!\n");
    }

    public void menampilkanDataMobil() {
        if (mobil.isEmpty()) {
            System.out.println("Belum ada data mobil!");
            return;
        }

        for (Mobil m : mobil) {
            m.menampilkanData();
            System.out.println("-----------------------------------");
        } 
    }

    public void editDataMobil() {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nomor plat mobil yang ingin diedit: ");
        String cari = input.nextLine();

        if (mobil.isEmpty()) {
            System.out.println("Tidak ada data untuk diedit!");
            return;
        }

        for (Mobil m : mobil) {
            if (m.getNoPlat().equalsIgnoreCase(cari)) {

                System.out.print("Warna Baru: ");
                m.setWarna(input.nextLine());

                System.out.println("Data berhasil diupdate!");
                return;
            }
        }

        System.out.println("Mobil tidak ditemukan!");
    }

    public void deleteDataMobil() {
        Scanner input = new Scanner (System.in);
        if (mobil.isEmpty()) {
            System.out.println("Tidak ada data untuk dihapus!");
            return;
        }

        System.out.print("Masukkan nomor plat mobil yang ingin dihapus: ");
        String cari = input.nextLine();

        mobil.removeIf(m -> m.getNoPlat().equalsIgnoreCase(cari));
        System.out.println("Data terhapus.");
    } 
}