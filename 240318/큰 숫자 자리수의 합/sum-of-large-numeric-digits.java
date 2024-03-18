import java.util.Scanner;

public class Main {    
    public static final int MAX_N = 100;
    
    public static int[] arr = new int[MAX_N];
    
    public static int solution(int a) {
        if(a/10==0)
            return a%10;
        return (a%10)+solution(a/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a*b*c;
        System.out.print(solution(sum));
    }
}