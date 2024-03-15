import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfSquares(n));
    }

    public static int sumOfSquares(int n) {
        if (n == 0) {
            return 0;
        } else {
            int lastDigit = n % 10;
            return lastDigit * lastDigit + sumOfSquares(n / 10);
        }
    }
}