import java.util.Scanner;

public class Main {
    static int a = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        asc(n);
        System.out.println();
        desc(n);
    }

    public static void asc(int n) {
        if (n <= 0) return;
        asc(n - 1);
        System.out.print(n+" ");
    }

    public static void desc(int n) {
        if (n <= 0) return;
        System.out.print(n+" ");
        desc(n - 1);
    }
}