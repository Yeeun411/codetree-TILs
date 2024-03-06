import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(n>m) {
            int a = n;
            n = m;
            m = a;
        }
        int max = 0;
        for(int i =1;i<n;i++) {
            if(n%i==0 && m%i==0) {
                max = i;
            }
        }
        System.out.println(max);

    }
}