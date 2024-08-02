import java.util.Scanner;

public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int n, m;

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] answer = new int[n][m];

        int x = 0, y = 0, dirNum = 0;
        answer[x][y] = 1;

        for (int i = 2; i <= n * m; i++) {
            int nx = x + dx[dirNum], ny = y + dy[dirNum];

            if (!inRange(nx, ny) || answer[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
            }

            x = nx;
            y = ny;
            answer[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}