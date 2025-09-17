import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nama :");
        String[] nama1 = new String[5];
        for (int i = 0; i < nama1.length; i++) {
            nama1[i] = sc.nextLine();
        }
        System.out.println("Nama yang dimasukkan : ");
        for (String nama : nama1) {
            System.out.println("Nama : " + nama);
        }
    }
}