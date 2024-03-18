import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(F(N));
    }
    public static int F(int n) {
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        return n * F(n - 1);
    }
}