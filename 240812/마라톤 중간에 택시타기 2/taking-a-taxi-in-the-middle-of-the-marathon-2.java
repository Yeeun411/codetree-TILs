import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 1; i < N; i++) {
            total += getDistance(points[i-1], points[i]);
        }

        int min = total;
        for (int i = 1; i < N-1; i++) {
            int skip = total
                    - getDistance(points[i-1], points[i])
                    - getDistance(points[i], points[i+1])
                    + getDistance(points[i-1], points[i+1]);
            min = Math.min(min, skip);
        }

        System.out.println(min);
    }

    public static int getDistance(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }
}