import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(re(N));
    }

    public static int re(int a) {
        if(a == 1)
            return 0;
    
        if(a % 2 == 0)
            return re(a / 2) + 1;
        else
            return re(3 * a + 1) + 1;
    }
}