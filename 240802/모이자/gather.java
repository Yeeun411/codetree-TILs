import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int minDistanceSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int distanceSum = 0;
            for (int j = 0; j < n; j++) {
                distanceSum += A[j] * Math.abs(j - i);
            }
            minDistanceSum = Math.min(minDistanceSum, distanceSum);
        }

        System.out.println(minDistanceSum);
    }
}