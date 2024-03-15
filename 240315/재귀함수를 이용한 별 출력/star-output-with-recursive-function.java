import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        helloWorld(n);
    }

    public static void helloWorld(int n) {
        if (n <= 0) return;
        helloWorld(n - 1);
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}