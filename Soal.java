import java.util.Scanner;

public class Soal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai UTS: ");
        int nilaiuts = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiuas = sc.nextInt();
        double akhir = (nilaiuts + nilaiuas) / 2.0;
        System.out.println("Nilai Akhir (Average): " + akhir);
        System.out.print("Masukkan nilai akhir (angka): ");
        
        int nilaiAkhir = sc.nextInt();
        String nilaiHuruf;
        System.out.println("");
    }
    
}
