package Pengguna;

import Hotel.Pesanan;
import Hotel.interfaceHotel;
import java.util.Scanner;

public class Admin extends User {
    private interfaceHotel hotel; 

    public Admin() {
        super("Admin");
        this.hotel = new Pesanan(); 
    }

    public void menuAdmin() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Cek Ketersediaan Kamar");
            System.out.println("2. Lihat Detail Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hotel.cekTersedia();
                    break;
                case 2:
                    hotel.cekDetail();
                    break;
                case 3:
                    System.out.println("Logout...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }

    @Override
    public void menu() {
        menuAdmin();
    }
}
