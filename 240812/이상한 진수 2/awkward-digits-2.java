import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int maxN = 0;

        for (int i = 0; i < a.length(); i++) {
            char[] modified = a.toCharArray();
            modified[i] = (modified[i] == '0') ? '1' : '0';

            int possibleN = Integer.parseInt(new String(modified), 2);
            
            maxN = Math.max(maxN, possibleN);
        }

        System.out.println(maxN);
    }
}