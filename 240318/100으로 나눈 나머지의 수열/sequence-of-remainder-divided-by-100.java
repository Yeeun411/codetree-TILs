import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(re(N));
    }

    public static int re(int a) {
        if(a == 1)
            return 2;
        if(a==2)
            return 4;
        return re(a-1)*re(a-2)%100;
    }
}