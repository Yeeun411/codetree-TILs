import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
        }

        int maxCnt = 0;
        for(int i = 0; i < n; i++)
            for(int j = 1; j < n - 1; j++){
                if(j-1 < 0 || j+1 > n-1) break;
                maxCnt = Math.max(maxCnt, arr[i][j] + arr[i][j + 1] + arr[i][j - 1]);
            }
        
        System.out.println(maxCnt);
    }
}