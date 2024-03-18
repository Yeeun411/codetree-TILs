import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(re(N));
    }

    public static int re(int a) {
        if(a == 1)
            return 1;
        if(a == 2)
            return 2;
        return re(a/3) + re(a-1);
    }
}