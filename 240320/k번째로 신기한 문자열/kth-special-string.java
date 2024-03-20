import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int index = scanner.nextInt();
        String T = scanner.next();
        String[] words = new String[n]; 
        for(int i = 0; i < n; i++)
            words[i] = scanner.next();
        Arrays.sort(words);

        int count = 0;
        for (String word : words) {
            if (word.startsWith(T)) {
                count++;
                if (count == index) { 
                    System.out.println(word);
                    break;
                }
            }
        }
    }
}