import java.util.Scanner;

public class asc_alp_left_tri {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char alpha = 65;
        int n;

        do {
            n = sc.nextInt();
        }
        while(n < 1);

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n; j++){
                if(j < n - i){
                    System.out.print(" ");
                }
                else {
                    System.out.print((char)(alpha + i));
                }
            }
            System.out.println("");
        }
    }
}