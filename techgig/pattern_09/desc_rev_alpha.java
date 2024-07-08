import java.util.Scanner;

public class desc_rev_alpha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char alpha = 65;
        int n;

        do {
            n = sc.nextInt();
        }
        while (n <= 1 && n <= 26);

        // pattern logic
        for(int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                System.out.print((char) (alpha + j - 1) + " ");
            }
            System.out.println("");
        }
    }
}