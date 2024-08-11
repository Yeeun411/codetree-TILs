import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int result = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 1; i < n; i++) {
            int j = i - 1;
            int tmp = arr[i];
            while(j >= 0 && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j--;
                result++;
            }
            arr[j + 1] = tmp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}