import java.util.Scanner;

public class total {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int number;

        while (true) {

            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number == 0) {
                break;
            }

            total = total + number;
        }

        System.out.println("Total = " + total);

        sc.close();
    }
}