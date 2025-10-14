import java.util.Scanner;
public class Nilaiutsuas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Mata Kuliah 1
        System.out.println("====== Mata Kuliah 1 : Algoritma dan Pemrograman ======");
        System.out.print("Masukkan Nilai UTS :");
        int nilaiuts1 = sc.nextInt();
        System.out.print("Masukkan Nilai UAS :");
        int nilaiuas1 = sc.nextInt();
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaitugas1 = sc.nextInt();

        double rataRata1 = (nilaiuts1 + nilaiuas1 + nilaitugas1) / 3.0;
        String huruf1;
        String kesimpulan1;

        if (rataRata1 >= 80 && rataRata1 <= 100) {
            huruf1 = "A";
            kesimpulan1 = "Sangat Baik";
        } else if (rataRata1 >= 70 && rataRata1 < 80) {
            huruf1 = "B";
            kesimpulan1 = "Baik";
        } else if (rataRata1 >= 60 && rataRata1 < 70) {
            huruf1 = "C";
            kesimpulan1 = "Cukup";
        } else if (rataRata1 >= 50 && rataRata1 < 60) {
            huruf1 = "D";
            kesimpulan1 = "Kurang";
        } else if (rataRata1 >= 0 && rataRata1 < 50) {
            huruf1 = "E";
            kesimpulan1 = "Sangat Kurang";
        } else {
            huruf1 = "Tidak Valid";
            kesimpulan1 = "Nilai tidak valid";
        }

        System.out.println("Rata-rata Nilai: " + rataRata1);
        System.out.println("Nilai Huruf: " + huruf1);
        System.out.println("Kesimpulan: " + kesimpulan1);

        // Mata Kuliah 2
        System.out.println("====== Mata Kuliah 2 : Struktur Data ======");
        System.out.print("Masukkan Nilai UTS :");
        int nilaiuts2 = sc.nextInt();
        System.out.print("Masukkan Nilai UAS :");
        int nilaiuas2 = sc.nextInt();
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaitugas2 = sc.nextInt();

        double rataRata2 = (nilaiuts2 + nilaiuas2 + nilaitugas2) / 3.0;
        String huruf2;
        String kesimpulan2;

        if (rataRata2 >= 80 && rataRata2 <= 100) {
            huruf2 = "A";
            kesimpulan2 = "Sangat Baik";
        } else if (rataRata2 >= 70 && rataRata2 < 80) {
            huruf2 = "B";
            kesimpulan2 = "Baik";
        } else if (rataRata2 >= 60 && rataRata2 < 70) {
            huruf2 = "C";
            kesimpulan2 = "Cukup";
        } else if (rataRata2 >= 50 && rataRata2 < 60) {
            huruf2 = "D";
            kesimpulan2 = "Kurang";
        } else if (rataRata2 >= 0 && rataRata2 < 50) {
            huruf2 = "E";
            kesimpulan2 = "Sangat Kurang";
        } else {
            huruf2 = "Tidak Valid";
            kesimpulan2 = "Nilai tidak valid";
        }

        System.out.println("Rata-rata Nilai: " + rataRata2);
        System.out.println("Nilai Huruf: " + huruf2);
        System.out.println("Kesimpulan: " + kesimpulan2);

        sc.close();
    }
    
}
