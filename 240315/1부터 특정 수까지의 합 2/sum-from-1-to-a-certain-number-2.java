import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(helloWorld(n));
    }

    public static int helloWorld(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + helloWorld(n - 1);
        }
    }
}