import java.util.Scanner;

public class rev_num_right_triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Height: ");
            n = sc.nextInt();
        }
        while (n < 1);

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= n - i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}