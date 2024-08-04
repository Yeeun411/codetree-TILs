import java.util.*;

public class Main {

    public static void performCommand(LinkedList<Integer> list, String command, Integer value) {
        switch(command) {
            case "push_front":
                list.addFirst(value);
                break;
            case "push_back":
                list.addLast(value);
                break;
            case "pop_front":
                System.out.println(list.pollFirst());
                break;
            case "pop_back":
                System.out.println(list.pollLast());
                break;
            case "size":
                System.out.println(list.size());
                break;
            case "empty":
                System.out.println(list.isEmpty() ? 1 : 0);
                break;
            case "front":
                System.out.println(list.peekFirst());
                break;
            case "back":
                System.out.println(list.peekLast());
                break;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            Integer value = null;
            if (parts.length > 1) {
                value = Integer.parseInt(parts[1]);
            }
            performCommand(list, command, value);
        }
    }
}