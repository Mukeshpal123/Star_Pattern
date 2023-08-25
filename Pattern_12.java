import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j%2==0){
                    System.out.print("!\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
