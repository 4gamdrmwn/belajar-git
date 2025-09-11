import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the discount: ");
        String discount = sc.nextLine();

        if (discount.equalsIgnoreCase("DISCOUNT20")) {
            System.out.println("You get 20% discount");
        } else if (discount.equals("DISCOUNT30")) {
            System.out.println("You get 30% discount");
                    } else if (discount.equals("DISCOUNT50")) {
            System.out.println("You get 50% discount");
        } else {
            System.out.println("No discount available");
            
        }
    }
}