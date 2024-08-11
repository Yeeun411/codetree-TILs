import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();

        int openPairs = 0;
        int closePairs = 0;

        for (int i = 0; i < A.length() - 1; i++) {
            if (A.charAt(i) == '(' && A.charAt(i + 1) == '(') {
                openPairs++;
            }
        }

        for (int i = 0; i < A.length() - 1; i++) {
            if (A.charAt(i) == ')' && A.charAt(i + 1) == ')') {
                closePairs++;
            }
        }

        int result = openPairs * closePairs;
        System.out.println(result);
    }
}