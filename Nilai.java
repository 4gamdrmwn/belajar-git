import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai UTS :");
        int nilaiuts = sc.nextInt();
        System.out.println("Masukkan Nilai UAS :");
        int nilaiuas = sc.nextInt();
        double akhir = (nilaiuts + nilaiuas) / 2.0;
        String huruf;
        String kualifikasi;

        if (80 <= nilaiuts && nilaiuts <= 100 &&
            80 <= nilaiuas && nilaiuas <= 100) {
            huruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (70 <= nilaiuts && nilaiuts < 80 &&
                   70 <= nilaiuas && nilaiuas < 80) {
            huruf = "B";
            kualifikasi = "Baik";
        } else if (60 <= nilaiuts && nilaiuts < 70 &&
                   60 <= nilaiuas && nilaiuas < 70) {
            huruf = "C";
            kualifikasi = "Cukup";
        } else if (50 <= nilaiuts && nilaiuts < 60 &&
                   50 <= nilaiuas && nilaiuas < 60) {
            huruf = "D";
            kualifikasi = "Kurang";
        } else if (0 <= nilaiuts && nilaiuts < 50 &&
                   0 <= nilaiuas && nilaiuas < 50) {
            huruf = "E";
            kualifikasi = "Sangat Kurang";
        } else {
            huruf = "I";
            kualifikasi = "Tidak Ada";
        }
        System.out.println("Nilai Akhir (Average): " + akhir);
        System.out.println("Nilai Akhir (Huruf): " + huruf);
        System.out.println("Kualifikasi : " + kualifikasi);

        sc.close();
    }
}