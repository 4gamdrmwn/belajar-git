public class Switchcase {
    public static void main(String[] args) {
        int menu = 2;
        switch (menu) {
            case 1:
                System.out.println("You selected menu 1");
                break;
            case 2:
                System.out.println("You selected menu 2");
                break;
            case 3:
                System.out.println("You selected menu 3");
                break;
            default:
                System.out.println("Invalid menu selection");
                break;
        }
    }
}
