import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if ((i + 1) % 2 != 0) {
                int[] temp = Arrays.copyOf(numbers, i + 1);
                Arrays.sort(temp);
                System.out.print(temp[temp.length / 2] + " ");
            }
        }
    }
}