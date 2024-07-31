import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            
            switch (parts[0]) {
                case "push_back":
                    int value = Integer.parseInt(parts[1]);
                    dynamicArray.add(value);
                    break;
                case "pop_back":
                    if (!dynamicArray.isEmpty()) {
                        dynamicArray.remove(dynamicArray.size() - 1);
                    }
                    break;
                case "size":
                    System.out.println(dynamicArray.size());
                    break;
                case "get":
                    int index = Integer.parseInt(parts[1]);
                    if (index > 0 && index <= dynamicArray.size()) {
                        System.out.println(dynamicArray.get(index - 1));
                    }
                    break;
            }
        }
    }
}