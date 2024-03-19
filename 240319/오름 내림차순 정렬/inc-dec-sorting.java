import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n]; 
        for(int i = 0; i < n; i++)
            arr[i]=scanner.nextInt();;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}