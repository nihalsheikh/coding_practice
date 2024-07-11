import java.util.Scanner;

public class rev_ast_triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;

        do {
            n = sc.nextInt();
        }
        while(n < 1);

        for(i = 0; i < n; i++){
            for(j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
