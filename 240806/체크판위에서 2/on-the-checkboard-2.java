import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++){
                arr[i][j] = scanner.next().charAt(0);
        }

        int maxCnt = 0;
        for(int i = 0; i < n; i++)
            for(int j = 1; j < n - 1; j++)
                for(int k = i + 1; k < n - 1; k++)
                    for(int l = j + 1; l < m - 1; l++)
                        if(arr[0][0] != arr[i][j] && arr[i][j] != arr[k][l] && arr[k][l] != arr[n - 1][m - 1])
                            maxCnt++;
        
        System.out.println(maxCnt);
    }
}