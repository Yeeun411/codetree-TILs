import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        int who = 0;

        for(int i = 1; i <= m; i++) {
            who = scanner.nextInt();
            b[who-1] ++;
            if(b[who-1] >= k) {
                System.out.println(who);
                return;
            }
        }
        System.out.println(-1);
    }
}