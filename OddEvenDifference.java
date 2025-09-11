import java.util.Scanner;

public class OddEvenDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
                System.out.println(number + " is even.");
            } else {
                oddSum += number;
                System.out.println(number + " is odd.");
            }
        }
    }
}