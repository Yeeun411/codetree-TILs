import java.util.Scanner;

public class Main {

    public static int sumSequenceElements(int[] A, int m) {
        int sum = 0;
        while (m >= 1) { 
            sum += A[m - 1];
            if (m % 2 == 0) {
                m = m / 2;
            } else if (m > 1) {
                m = m - 1;
            } else {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println(sumSequenceElements(A, m));
    }
}