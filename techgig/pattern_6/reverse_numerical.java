import java.util.Scanner;

public class reverse_numerical {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = sc.nextInt();
        }
        while (n <= 1 && n <= 1000);

        // pattern logic
        for (int i = n; i > 0; i--) { //  column loops && decrement loop
            for (int j = 0; j < n; j++) {   // row loop && increment loop
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}