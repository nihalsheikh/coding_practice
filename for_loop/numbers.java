import java.util.Scanner;

public class numbers {
    public static void main(String args[]) {
        // take user input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //loop to print natural number
        for(int i = 1; i <= n; i++) {
            //display result
            System.out.print(i + "\n");
        }
    }
}