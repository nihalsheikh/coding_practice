import java.util.Scanner;

public class desc_alpha_rev_right_triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char alpha = 65;
        int n;

        do {
            n = sc.nextInt();
        }
        while(n < 1);

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= n - i; j++) {
                System.out.print((char)(alpha + n - i) + " ");
            }
            System.out.println("");
        }
    }
}