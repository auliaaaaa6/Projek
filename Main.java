package Projek;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Main app = new Main();
        app.menuUtama();
    }
    // ================== MENU UTAMA ===================
    public void menuUtama() {
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> menuKaryawan();
                case 2 -> menuMobil();
                case 3 -> keluar();
                default -> System.out.println("Pilih 1-3 saja!");
            }

        } while (pilihan != 3);
    }

    public void tampilkanMenu() {
        System.out.println("\n=== FILKOM APP ===");
        System.out.println("1. Data Karyawan");
        System.out.println("2. Data Mobil");
        System.out.println("3. Keluar Aplikasi");
        System.out.print("Pilihan Menu: ");
    }

    public void keluar() {
        System.out.println("Terima kasih telah menggunakan aplikasi!");
    }

    // ================== MENU KARYAWAN ===================
    ManajemenKaryawan mk = new ManajemenKaryawan();
    public void menuKaryawan() {
        int pilih;

        do {
            System.out.println("\n=== Menu Karyawan ===");
            System.out.println("1. Tambah Data Karyawan");
            System.out.println("2. Lihat Daftar Karyawan");
            System.out.println("3. Edit Data Karyawan");
            System.out.println("4. Hapus Data Karyawan");
            System.out.println("5. Keluar Menu");
            System.out.print("Pilihan Menu: ");

            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> mk.inputDataKaryawan();
                case 2 -> mk.menampilkanDataKaryawan();
                case 3 -> mk.editDataKaryawan();
                case 4 -> mk.deleteDataKaryawan();
            }

        } while (pilih != 5);
    }
    
    // ================== MENU MOBIL ===================
    ManajemenMobil mm = new ManajemenMobil();
    public void menuMobil() {
        int pilih;

        do {
            System.out.println("\n=== Menu Mobil ===");
            System.out.println("1. Tambah Data Mobil");
            System.out.println("2. Lihat Daftar Mobil");
            System.out.println("3. Edit Data Mobil");
            System.out.println("4. Hapus Data Mobil");
            System.out.println("5. Keluar Menu");
            System.out.print("Pilihan Menu: ");

            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> mm.inputDataMobil();
                case 2 -> mm.menampilkanDataMobil();
                case 3 -> mm.editDataMobil();
                case 4 -> mm.deleteDataMobil();
            }

        } while (pilih != 5);
    }
}
