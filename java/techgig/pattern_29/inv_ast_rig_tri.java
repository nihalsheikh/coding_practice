import java.util.Scanner;

public class inv_ast_rig_tri {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = sc.nextInt();
        }
        while (n < 1);

        for(int i = n; i > 0; i--){
            for(int j = 0; j < n; j++){
                if(j < n - i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}