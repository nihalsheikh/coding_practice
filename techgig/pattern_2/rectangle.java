import java.util.Scanner;

public class rectangle {
    public static void main(String args[]) {
        // Numerical Rectangle
        Scanner sc = new Scanner(System.in);
        int n;

        // User input from range (1 <= n <= 1000)
        do {
            n = sc.nextInt();
        }
        while (n <= 1 && n <= 1000);

        // Numerical Rectangle logic

        // column loop
        for (int i = 0; i < n; i++) {
            // row loop
            for(int j = 0; j < n; j++) {
                System.out.print(i + 1 + " ");    // used only print to stay in the same line
            }
            System.out.println(""); // used println to go to next line in the terminal
        }
    }
}