import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String commands = scanner.nextLine();
        
        int x = 0, y = 0;
        int totalTime = 0;
        char currentDirection = 'N';
        
        int[][] directionVectors = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0; // 0: 북, 1: 동, 2: 남, 3: 서
        
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            totalTime++;
            
            switch (command) {
                case 'L':
                    directionIndex = (directionIndex + 3) % 4;
                    break;
                case 'R':
                    directionIndex = (directionIndex + 1) % 4;
                    break;
                case 'F':
                    x += directionVectors[directionIndex][0];
                    y += directionVectors[directionIndex][1];
                    break;
            }
            
            if (x == 0 && y == 0) {
                System.out.println(totalTime);
                return;
            }
        }
        System.out.println(-1);
    }
}