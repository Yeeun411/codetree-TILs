import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[2*n]; 
        for(int i = 0; i < 2*n; i++)
            A[i] = scanner.nextInt();
        Arrays.sort(A);
        int max = 0;
        for(int i = 0; i < n; i++){
            int tmp = A[i]+A[2*n-i-1];
            max = Math.max(tmp, max);
        }
        System.out.println(max);
    }
}