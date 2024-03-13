import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a+" "+b);
    }
}