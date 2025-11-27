package Projek;
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenKaryawan {
    // ------------------------------- KARYAWAN ----------------------------------
    ArrayList<Karyawan> karyawan = new ArrayList<>();
    public ManajemenKaryawan () {
        karyawan.add(new Karyawan("Budi Santoso","12-05-1985","L","Jl. Merdeka No. 25","081234567890","budi@gmail.com","Sopir", 2027));
        karyawan.add(new Karyawan( "Sari Lestari","08-10-1990","P","Jl. Kenanga No. 10","082233445566","sari@gmail.com","Administrasi",2030));
    }

    public void inputDataKaryawan() {
        Scanner input = new Scanner (System.in);

        System.out.println("\n=== Tambah Data Karyawan ===");

        System.out.print("Nama Lengkap               : ");
        String nama = input.nextLine();
        System.out.print("Tanggal Lahir (dd-mm-yyy) : ");
        String tanggalLahir = input.nextLine();
        System.out.print("Jenis Kelamin (L/P)       : ");
        String jenisKelamin = input.nextLine();
        System.out.print("Alamat                    : ");
        String alamat = input.nextLine();
        System.out.print("No Telepon                : ");
        String noTelp = input.nextLine();
        System.out.print("Email                     : ");
        String email = input.nextLine();
        System.out.print("Kategori Karyawan         : ");
        String kategoriKaryawan = input.nextLine();
        System.out.print("Masa Berlaku SIM          : ");
        int expSIM = input.nextInt();
        input.nextLine();

        Karyawan k = new Karyawan(nama, tanggalLahir, jenisKelamin, alamat, noTelp, email, kategoriKaryawan, expSIM);
        karyawan.add(k);

        System.out.println("Data karyawan berhasil ditambahkan!\n");
    }

    public void menampilkanDataKaryawan() {
        System.out.println("\n=== Daftar Karyawan ===");

        if (karyawan.isEmpty()) {
            System.out.println("Belum ada data!");
            return;
        }
        for (Karyawan k : karyawan) {
            k.menampilkanData();
            System.out.println("---------------------------------------------");
        }
    }

    public void editDataKaryawan() {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nama karyawan yang ingin diedit: ");
        String cari = input.nextLine();

        for (Karyawan k : karyawan) {
            if (k.getNama().equalsIgnoreCase(cari)) {
                System.out.print("Alamat Baru: ");
                k.setAlamat(input.nextLine());
                System.out.print("Nomor Telepon Baru: ");
                k.setNoTelp(input.nextLine());
                System.out.print("Kategori Karyawan Baru: ");
                k.setKategoriKaryawan(input.nextLine());
                System.out.print("Expired SIM Baru: ");
                k.setExpSIM(input.nextInt());

                System.out.println("Data karyawan berhasil diupdate!");
                return;
            }
        }
        System.out.println("Data tidak ditemukan!");
    }

    public void deleteDataKaryawan() {
        Scanner input = new Scanner (System.in);
        if (karyawan.isEmpty()) {
            System.out.println("Tidak ada data untuk dihapus!");
            return;
        }

        System.out.print("Masukkan nama karyawan yang ingin dihapus: ");
        String cari = input.nextLine();

        karyawan.removeIf(d -> d.getNama().equalsIgnoreCase(cari));
        System.out.println("Data terhapus (jika ditemukan).");
    }
    
}