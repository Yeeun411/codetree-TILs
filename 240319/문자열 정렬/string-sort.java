import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

        System.out.println();
    }
}