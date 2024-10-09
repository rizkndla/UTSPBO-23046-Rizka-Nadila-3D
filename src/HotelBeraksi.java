import Pengguna.Admin;
import Pengguna.Customer;
import java.util.Scanner;

public class HotelBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Login ===");
        System.out.println("admin");
        System.out.println("customer");
        System.out.println("=============");
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        switch (username) {
            case "admin":
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();
                if (password.equals("bunny1623")) {
                    Admin admin = new Admin();
                    admin.menuAdmin();
                } else {
                    System.out.println("Password salah.");
                }
                break;
                
            case "customer":
                Customer customer = new Customer();
                customer.menuCustomer();
                break;

            default:
                System.out.println("Username tidak dikenali.");
                break;
        }
    }
}