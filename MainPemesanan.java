package Projek;
import java.util.Scanner;

public class MainPemesanan {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int pilih;

    do {
        System.out.println("===== Menu =====");
        System.out.println("1. Pesan Travel");
        System.out.println("2. Rental Mobil");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu: ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
            ManajemenMobil mm = new ManajemenMobil();
            Mobil mobilDefault = mm.getMobilRental();
            Travel t = new Travel();
            t.setMobil(mobilDefault);
            t.pesanTravel();
            break;
            case 2:
            RentalCar r = new RentalCar();
            r.sewaMobil();
            break;
            case 3:
            System.out.println("Terima Kasih");
            break;
            default:
                System.out.println("Input tidak valid!");
        }

    } while (pilih != 3);

    }
}