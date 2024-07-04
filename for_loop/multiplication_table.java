import java.util.Scanner;

public class multiplication_table {
    public static void main(String args[]) {
        // take user input
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        do {
            num = sc.nextInt();
        }
        while (num < 0);

        // display logic        
        System.out.println("Multiplication Table of " + num);
        
        // table logic
        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
    }
}
