import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1.balanced ");
            System.out.println("2.withdraw");
            System.out.println("3.deposit");
            System.out.println("4.thank you");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("balanced selected");
                    break;

                case 2:
                    System.out.println("withdraw selected");
                    break;

                case 3:
                    System.out.println("deposit selected");
                    break;

                case 4:
                    System.out.println("thanku");
                    break;

                default:
                    System.out.println("");
            }

        } while (choice != 4);

        sc.close();
    }
}