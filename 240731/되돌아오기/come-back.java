import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine();
        int x = 0, y = 0;
        int totalTime = 0;
        
        for (int i = 0; i < N; i++) {
            String[] move = scanner.nextLine().split(" ");
            char direction = move[0].charAt(0);
            int distance = Integer.parseInt(move[1]);
            for(int j = 0; j< distance;j++){
                switch (direction) {
                case 'N':
                    y += 1;
                    break;
                case 'S':
                    y -= 1;
                    break;
                case 'E':
                    x += 1;
                    break;
                case 'W':
                    x -= 1;
                    break;
                }
            totalTime += 1;
            
            if (x == 0 && y == 0) {
                System.out.println(totalTime);
                return;
            }
            }
        }

        System.out.println(-1);
    }
}