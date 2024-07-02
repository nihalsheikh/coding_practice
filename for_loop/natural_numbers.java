import java.util.Scanner;

public class natural_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        // take user input
        do {
            n = sc.nextInt();
        } while (n <= 0);

        //loop to print natural number
        for(int i = 1; i <= n; i++) {
            //display result
            System.out.print(i + "\n");
        }
    }
}