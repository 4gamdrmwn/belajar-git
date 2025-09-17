import java.util.Scanner;
public class Nilaiutsuas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Nilai UTS :");
        int nilaiuts = sc.nextInt();
        System.out.println("Masukkan Nilai UAS :");
        int nilaiuas = sc.nextInt();

        double rataRata = (nilaiuts + nilaiuas) / 2.0;
        String huruf;
        String kesimpulan;

        if (rataRata >= 80 && rataRata <= 100) {
            huruf = "A";
            kesimpulan = "Sangat Baik";
        } else if (rataRata >= 70 && rataRata < 80) {
            huruf = "B";
            kesimpulan = "Baik";
        } else if (rataRata >= 60 && rataRata < 70) {
            huruf = "C";
            kesimpulan = "Cukup";
        } else if (rataRata >= 50 && rataRata < 60) {
            huruf = "D";
            kesimpulan = "Kurang";
        } else if (rataRata >= 0 && rataRata < 50) {
            huruf = "E";
            kesimpulan = "Sangat Kurang";
        } else {
            huruf = "Tidak Valid";
            kesimpulan = "Nilai tidak valid";
        }

        System.out.println("Rata-rata Nilai: " + rataRata);
        System.out.println("Nilai Huruf: " + huruf);
        System.out.println("Kesimpulan: " + kesimpulan);

        sc.close();
    }
    
}
