import java.util.Scanner;

public class asterisk_rectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        // user input
        do {
            n = sc.nextInt();
        }
        while (n <= 1 && n <= 1000);

        // asterisk pattern logic
        for (int i = 0; i < n; i++) {   // column loop
            for (int j = 0; j < n-1; j++) {   // row loop
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}