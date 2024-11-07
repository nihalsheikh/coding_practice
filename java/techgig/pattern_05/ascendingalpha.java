import java.util.Scanner;

public class ascendingalpha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char alpha = 65;
        int n;

        do {
            n = sc.nextInt();
        }
        while (n <= 1 && n <= 26);

        // pattern logic
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char) (alpha + j) +  " ");
            }
            System.out.println("");
        }    
    }
}