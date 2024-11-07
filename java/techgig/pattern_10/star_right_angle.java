import java.util.Scanner;

public class star_right_angle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = sc.nextInt();
        }
        while (n <= 1 && n <= 26);

        // pattern
        for (int i = 1; i <= n; i++) {  // column, decrement && loop runs this much time
            for (int j = 0; j < i; j++) {   // row, increment && loop restriction for each line
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}