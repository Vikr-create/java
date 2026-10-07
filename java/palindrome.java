import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int original=num;
        int reversed=0;
        while (num!=0) {
            int digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
              System.out.println(reversed);
        }
       if(original==reversed)
        {
        System.out.println("is palindrome");
        }
        else
        {
            System.out.println("is not palindrome");
        }

       }
    }
    

