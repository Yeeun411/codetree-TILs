import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        int length = str.length();
        
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '(') {
                for (int j = i + 1; j < length; j++) {
                    if (str.charAt(j) == ')') {
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}