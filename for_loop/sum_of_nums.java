import java.util.Scanner;

public class sum_of_nums {
    public static int sumOfNums(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n;

        do {
            n = sc.nextInt();
        } while (n <= 0);

        int sum = sumOfNums(n);
        System.out.println("Sum of first '" + n + "' Natural numbers is: " + sum);
    }
}
