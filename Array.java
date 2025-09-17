import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nilai = new double[5];
        double total = 0;

        System.out.println("Masukkan Nilai:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextDouble();
            total += nilai[i];
        }

        double rataRata = total / nilai.length;
        System.out.println("Rata-rata Nilai: " + rataRata);

        sc.close();
    }
}