import java.util.Scanner;
public class Main {
    static int[] A;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        A = new int[n];
        for(int i =0;i<n;i++){
            A[i] = scanner.nextInt();
        }
        for(int i=0;i<m;i++){
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            System.out.println(calculator(a1,a2));
        }
    }

    public static int calculator(int a1, int a2){
        int sum = 0;
        for(int i = a1-1;i<a2;i++){
            sum += A[i];
        }
        return sum;
    }
}