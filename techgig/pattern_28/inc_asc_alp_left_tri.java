import java.util.Scanner;

public class inc_asc_alp_left_tri {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char alpha = 65;
        int n;

        do {
            n = sc.nextInt();
        }
        while(n < 1);

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <= n; j++){
        //         if(j < n - i){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print((char)(alpha + i + j - n));
        //         }
        //     }
        //     System.out.println("");
        // }

        for(int i = 0; i < n; i++){
            int k = 1;
            for(int j = 0; j <= n; j++){
                if(j < n - i){
                    System.out.print(" ");
                }
                else{
                    System.out.print((char)(alpha + k++ - 1));
                }
            }
            System.out.println("");
        }
    }
}