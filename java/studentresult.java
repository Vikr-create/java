import java.util.Scanner;

public class studentresult {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name");
        String name =sc.nextLine();
        int total=0;
        for(int i=1;i<=5;i++){
            System.out.println("enter a 5 subject marks");
            int marks =sc.nextInt();
            total=total+marks;
            System.out.println(total);
        } 
        double percentage = total / 5.0;
    
        if (percentage>=35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

        if (percentage>=90) {
            System.out.println("A+");
            
        }
        else if (percentage>=80) {
            System.out.println("A");
        }
        else if (percentage>=70) {
            System.out.println("B");
        }
        else if (percentage>=60) {
            System.out.println("C");
        }
        else if (percentage>=40) {
            System.out.println("d");
        }
        else{
            System.out.println("f");
        }
        System.out.println(" total:"+total);
        System.out.println("percentage:"+percentage);
        
        
    }
    
}
