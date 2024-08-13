import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int maxSum = findMaxSum(arr, n);
        System.out.println(maxSum);
    }
    
    public static int findMaxSum(int[] arr, int n) {
        if (n < 3) {
            return 0;
        }

        int maxSum = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 2; j < n; j++) {
                maxSum = Math.max(maxSum, arr[i] + arr[j]);
            }
        }
        
        return maxSum;
    }
}