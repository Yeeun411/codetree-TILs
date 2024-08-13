import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int dis = 0;
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        for(int i =0;i<n-1;i++){
            for(int j = 1; j < n;j++){
                dis = i>j ? i - j : j-i;
                if(dis != 1){
                    max = max >= arr[i] + arr[j] ? max : arr[i] + arr[j];
                }
            }
        }
        System.out.println(max);
    }
}