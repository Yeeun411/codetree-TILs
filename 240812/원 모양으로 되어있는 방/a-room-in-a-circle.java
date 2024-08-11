import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] people = new int[N];

        for (int i = 0; i < N; i++) {
            people[i] = scanner.nextInt();
        }

        int minDistanceSum = Integer.MAX_VALUE;

        for (int start = 0; start < N; start++) {
            int distanceSum = 0;

            for (int i = 0; i < N; i++) {
                int distance = (i >= start) ? (i - start) : (N - (start - i));
                distanceSum += distance * people[i];
            }

            minDistanceSum = Math.min(minDistanceSum, distanceSum);
        }

        System.out.println(minDistanceSum);
    }
}