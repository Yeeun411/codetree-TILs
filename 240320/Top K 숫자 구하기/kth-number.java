import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int index = scanner.nextInt();
        int[] words = new int[n]; 
        for(int i = 0; i < n; i++)
            words[i] = scanner.nextInt();
        Arrays.sort(words);

        System.out.println(words[index-1]);
    }
}