import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        Map<Integer, Integer> visited = new HashMap<>();
        int currentPosition = 0;
        
        visited.put(currentPosition, 1);
        
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            int distance = Integer.parseInt(parts[0]);
            String direction = parts[1];
            
            if (direction.equals("L")) {
                for (int j = 0; j < distance; j++) {
                    currentPosition -= 1;
                    visited.put(currentPosition, visited.getOrDefault(currentPosition, 0) + 1);
                }
            } else if (direction.equals("R")) {
                for (int j = 0; j < distance; j++) {
                    currentPosition += 1;
                    visited.put(currentPosition, visited.getOrDefault(currentPosition, 0) + 1);
                }
            }
        }
        
        int count = 0;
        for (int visitCount : visited.values()) {
            if (visitCount >= 2) {
                count++;
            }
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}