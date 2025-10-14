import java.util.Scanner;

public class Orderafood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nama Menu :");
        String namaMenu = sc.nextLine();
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Ayam Bakar", "Sate Ayam", "Gado-Gado"};
        boolean found = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(namaMenu)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Menu " + namaMenu + " tersedia!!");
        } else {
            System.out.println("Maaf Menu "+ namaMenu + " tidak tersedia.");
        }
        sc.close();
    }
}
