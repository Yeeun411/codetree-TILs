import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a_arr = new int[n];
        int[] b_arr = new int[m];
        int v = 0;
        int t = 0;

        for(int i=0;i<n;i++){
            v = scanner.nextInt();
            t = scanner.nextInt();
            a += v*t;
            a_arr[i] = a;
        }
        for(int i=0;i<m;i++){
            v = scanner.nextInt();
            t = scanner.nextInt();
            b += v*t;
            b_arr[i] = b;
        }
        int count = 1;
        for(int i=1;i < (m<n?m:n);i++){

            if(a_arr[i]>b_arr[i] && a_arr[i-1]>b_arr[i]){

            } else if(b_arr[i]>a_arr[i] && b_arr[i-1]>a_arr[i]){

            } else{count++;}
        }
        System.out.println(count);
    }
}