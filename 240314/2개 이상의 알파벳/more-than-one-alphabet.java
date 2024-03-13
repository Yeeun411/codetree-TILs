import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.next();
        char[] arr = alphabet.toCharArray();
        
        Set<Character> uniqueAlphabets = new HashSet<>();
        for (char c : arr) {
            uniqueAlphabets.add(c);
        }
        
        if (uniqueAlphabets.size() >= 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}