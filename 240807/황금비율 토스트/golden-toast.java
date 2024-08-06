import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        String initialString = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();

        for (char c : initialString.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> it = list.listIterator(list.size());

        for (int i = 0; i < m; i++) {
            String command = scanner.nextLine();
            if (command.equals("L")) {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (command.equals("R")) {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (command.equals("D")) {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if (command.startsWith("P ")) {
                char newChar = command.charAt(2);
                it.add(newChar);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : list) {
            result.append(c);
        }

        System.out.println(result.toString());

        scanner.close();
    }
}