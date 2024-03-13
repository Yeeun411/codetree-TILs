import java.util.Scanner;

public class Main {

    public static int[] processNumbers(int a, int b) {
        if (a < b) {
            a += 10;
            b *= 2;
        } else {
            b += 10;
            a *= 2;
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] result = processNumbers(a, b);

        System.out.println(result[0] + " " + result[1]);
    }
}