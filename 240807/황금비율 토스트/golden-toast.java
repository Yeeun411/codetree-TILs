import java.util.*;

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
            char command = scanner.next().charAt(0);
            if (command=='L') {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (command=='R') {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (command=='D') {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if (command=='P') {
                char newChar = scanner.next().charAt(0);
                it.add(newChar);
            }
        }
        
        it = list.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        } 
    }
}