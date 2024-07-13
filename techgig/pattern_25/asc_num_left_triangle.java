import java.util.Scanner;

public class asc_num_left_triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = sc.nextInt();
        }
        while (n < 1);

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < n; j++) {
                if(j < n - i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(i);
                }
            }
            System.out.println("");
        }
    }
}