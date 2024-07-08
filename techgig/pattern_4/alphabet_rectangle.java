import java.util.Scanner;

public class alphabet_rectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        char alpha = 65;

        do {
            n = sc.nextInt();
        }
        while (n <= 1 && n <= 26);

        // Alphabet Rectangle Logic
        for (int i = 0; i < n; i++) {   // column loop
            for (int j = 0; j < n; j++) {   // row loop
                System.out.print(alpha + " ");    // display alphabet
            }
            System.out.println("");
            alpha++;    // increase alphabet
        }
    }
}