import java.util.Scanner;

public class asc_rev_alpha_right_triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char alpha = 65;
        int n;

        do {
            n = sc.nextInt();
        }
        while (n <= 1 && n <= 26);

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= n - i; j++) {
                System.out.print((char)(alpha + j) + " ");
            }
            System.out.println("");
        }
    }
}