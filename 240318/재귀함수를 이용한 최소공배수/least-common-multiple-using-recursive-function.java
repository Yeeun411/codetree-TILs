import java.util.Scanner;

public class Main {    
    public static final int MAX_N = 10;
    
    public static int[] arr = new int[MAX_N];
    
    // 최대공약수를 구하는 함수
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }


    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int solution(int index) {
        if (index == 1) {
            return arr[0];
        } else {
            return lcm(arr[index - 1], solution(index - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n));
    }
}