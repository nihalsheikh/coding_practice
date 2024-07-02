import java.util.Scanner;

public class numbers {
    public static void main(String args[]) {
        //print number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++) {
            //display result
            System.out.print(i + "\n");
        }
    }
}