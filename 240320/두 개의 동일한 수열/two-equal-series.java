import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n]; 
        int[] B = new int[n]; 
        for(int i = 0; i < n; i++)
            A[i] = scanner.nextInt();
        for(int i = 0; i < n; i++)
            B[i] = scanner.nextInt();
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < n; i++){
            if(A[i]!=B[i]){
                System.out.println("No");
                break;
            }
            if(i==n-1){
                System.out.println("Yes");
            }
        }
        
    }
}