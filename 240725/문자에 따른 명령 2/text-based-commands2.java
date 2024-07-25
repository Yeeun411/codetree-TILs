import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        
        // 방향은 북, 동, 남, 서의 순서로 저장
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0; // 0은 북, 1은 동, 2는 남, 3은 서
        
        int x = 0, y = 0; // 초기 위치
        
        for (char command : commands.toCharArray()) {
            if (command == 'L') {
                // 왼쪽으로 회전
                directionIndex = (directionIndex + 3) % 4; // (directionIndex - 1 + 4) % 4와 동일
            } else if (command == 'R') {
                // 오른쪽으로 회전
                directionIndex = (directionIndex + 1) % 4;
            } else if (command == 'F') {
                // 현재 방향으로 한 칸 전진
                x += directions[directionIndex][0];
                y += directions[directionIndex][1];
            }
        }
        
        System.out.println(x + " " + y);
    }
}