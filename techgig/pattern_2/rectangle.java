import java.util.Scanner;

public class rectangle {
    public static void main(String args[]) {
        // Numerical Rectangle
        Scanner sc = new Scanner(System.in);
        int n;

        // User input from range (1 <= n <= 1000)
        
            n = sc.nextInt();

        // Numerical Rectangle logic
        // column loop
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // Row loop
                System.out.print(i + 1);
            }
            System.out.println("");
        }
    }
}