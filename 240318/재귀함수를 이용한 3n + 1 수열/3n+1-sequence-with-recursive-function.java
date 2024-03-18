import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(re(N,0));
    }

    public static int re(int n, int count) {
        if (n == 1) {
            return count;
        }
        count++;
        if(n%2==0){
            return re(n/2,count);
        }
        return re(n*3+1,count);
    }
}