package Pengguna;

import Hotel.Pesanan;
import Hotel.interfaceHotel;
import java.util.Scanner;

public class Customer extends User {
    private interfaceHotel hotel; 

    public Customer() {
        super("Customer");
        this.hotel = new Pesanan();
    }

    public void menuCustomer() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Customer ===");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Cek Ketersediaan Kamar");
            System.out.println("3. Lihat Detail Pesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hotel.tipeKamar(scanner); // Memanggil bookRoom di Hotel
                    break;
                case 2:
                    hotel.cekTersedia();
                    break;
                case 3:
                    hotel.cekDetail();
                    break;
                case 4:
                    System.out.println("Logout...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    @Override
    public void menu() {
        menuCustomer();
    }
}
