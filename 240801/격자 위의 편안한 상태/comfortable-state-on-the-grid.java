import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int[][] grid = new int[N + 1][N + 1];
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        for (int i = 0; i < M; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            
            grid[r][c] = 1;
            
            int comfortable = 0;
            int count = 0;
            
            for (int j = 0; j < 4; j++) {
                int nr = r + dx[j];
                int nc = c + dy[j];
                
                if (nr >= 1 && nr <= N && nc >= 1 && nc <= N && grid[nr][nc] == 1) {
                    count++;
                }
            }
            
            if (count == 3) {
                comfortable = 1;
            }
            
            System.out.println(comfortable);
        }
    }
}