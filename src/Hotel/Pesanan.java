package Hotel;

import java.util.Scanner;

public class Pesanan implements interfaceHotel {
    private boolean Tersedia = true;
    private String namaCustomer;
    private String tipeKamar;
    private int malam;
    
    public void cekTersedia() {
        if (Tersedia) {
            System.out.println("Kamar tersedia untuk dipesan.");
        } else {
            System.out.println("Maaf, tidak ada kamar yang tersedia.");
        }
    }

    @Override
    public void Memesan() {
        if (Tersedia) {
            Tersedia = false;
            System.out.println("Kamar berhasil dipesan.");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

   public void tipeKamar(Scanner scanner) {
        System.out.println("\n=== Pilih Tipe Kamar ===");
        System.out.println("1. Kamar Standar");
        System.out.println("2. Kamar Deluxe");
        System.out.println("3. Kamar Suite");
        System.out.print("Pilih tipe kamar : ");
        int tipe = scanner.nextInt();

        String kamar;
        switch (tipe) {
            case 1:
                kamar = "Kamar Standar";
                break;
            case 2:
                kamar = "Kamar Deluxe";
                break;
            case 3:
                kamar = "Kamar Suite";
                break;
            default:
                System.out.println("Tipe kamar tidak valid");
                return;
        }

        System.out.print("Berapa malam anda menginap ? ");
        int malam = scanner.nextInt();

        System.out.println("Anda telah memesan " + kamar + " untuk " + malam + " malam.");
    }
    @Override
    public void cekDetail() {
        if (!Tersedia) {
            System.out.println("Nama Customer: " + namaCustomer);
            System.out.println("Tipe Kamar: " + tipeKamar);
            System.out.println("Jumlah Malam: " + malam);
        } else {
            System.out.println("Belum ada pesanan.");
        }
    }
}
