import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        int[] positionCount = new int[4001];
        int currentPosition = 2000; // Starting at position 0
        
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String[] parts = command.split(" ");
            int x = Integer.parseInt(parts[0]);
            char direction = parts[1].charAt(0);
            
            if (direction == 'L') {
                for (int j = 1; j <= x; j++) {
                    positionCount[currentPosition - j]++;
                }
                currentPosition -= x;
            } else if (direction == 'R') {
                for (int j = 1; j <= x; j++) {
                    positionCount[currentPosition + j]++;
                }
                currentPosition += x;
            }
        }
        
        int overlapCount = 0;
        for (int i = 0; i < positionCount.length; i++) {
            if (positionCount[i] >= 2) {
                overlapCount++;
            }
        }
        
        System.out.println(overlapCount);
    }
}