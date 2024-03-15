import java.util.Scanner;

public class Main {
    static int a = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        asc(n, n);
        desc(n);
    }

    public static void asc(int m,int n) {
        if (n <= 0){
            System.out.println("");
            return;
            }
        System.out.print((m-n+1)+" ");
        asc(m, n - 1);
    }

    public static void desc(int n) {
        if (n <= 0) return;
        System.out.print(n+" ");
        desc(n - 1);
    }
}