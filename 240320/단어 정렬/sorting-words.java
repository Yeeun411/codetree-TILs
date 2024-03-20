import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] words = new String[n]; 
        for(int i = 0; i < n; i++)
            words[i] = scanner.next();
        Arrays.sort(words);

        for(int i = 0; i < n; i++)
            System.out.println(words[i]);
    }
}