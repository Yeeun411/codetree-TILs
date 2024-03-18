import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMax(arr, 0, N));
    }

    public static int findMax(int[] arr, int index, int n) {
        if (index == n - 1) {
            return arr[index];
        }
        int max = findMax(arr, index + 1, n);
        return Math.max(arr[index], max);
    }
}