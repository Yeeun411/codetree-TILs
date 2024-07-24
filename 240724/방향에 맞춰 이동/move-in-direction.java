import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine();
        
        // 초기 위치
        int x = 0;
        int y = 0;
        
        // 이동 처리
        for (int i = 0; i < N; i++) {
            String direction = scanner.next();
            int distance = scanner.nextInt();
            
            switch (direction) {
                case "N":
                    y += distance;
                    break;
                case "S":
                    y -= distance;
                    break;
                case "E":
                    x += distance;
                    break;
                case "W":
                    x -= distance;
                    break;
            }
        }
        
        // 최종 위치 출력
        System.out.println(x + " " + y);
    }
}