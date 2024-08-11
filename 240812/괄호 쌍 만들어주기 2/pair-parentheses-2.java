import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();

        List<Integer> openIndices = new ArrayList<>();
        List<Integer> closeIndices = new ArrayList<>();

        for (int i = 0; i < A.length() - 1; i++) {
            if (A.charAt(i) == '(' && A.charAt(i + 1) == '(') {
                openIndices.add(i);
            }
        }

        for (int i = 0; i < A.length() - 1; i++) {
            if (A.charAt(i) == ')' && A.charAt(i + 1) == ')') {
                closeIndices.add(i);
            }
        }

        int count = 0;
        
        for (int open : openIndices) {
            for (int close : closeIndices) {
                if (open < close) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}