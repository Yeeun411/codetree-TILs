import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N과 M을 입력받습니다.
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // A와 B의 이동 기록을 저장할 배열
        int[] positionA = new int[1000000];
        int[] positionB = new int[1000000];

        // 현재 위치와 시간을 저장할 변수
        int currentPositionA = 0;
        int currentTime = 0;

        // A의 이동 기록을 입력받아 positionA 배열에 저장
        for (int i = 0; i < N; i++) {
            char direction = scanner.next().charAt(0);
            int time = scanner.nextInt();

            int move = (direction == 'R') ? 1 : -1;

            for (int j = 0; j < time; j++) {
                currentTime++;
                currentPositionA += move;
                positionA[currentTime] = currentPositionA;
            }
        }

        // B의 이동 기록을 입력받아 positionB 배열에 저장
        int currentPositionB = 0;
        currentTime = 0;
        
        for (int i = 0; i < M; i++) {
            char direction = scanner.next().charAt(0);
            int time = scanner.nextInt();

            int move = (direction == 'R') ? 1 : -1;

            for (int j = 0; j < time; j++) {
                currentTime++;
                currentPositionB += move;
                positionB[currentTime] = currentPositionB;
            }
        }

        // A와 B가 최초로 만나는 시간을 찾기
        int meetingTime = -1;
        for (int i = 1; i <= currentTime; i++) {
            if (positionA[i] == positionB[i]) {
                meetingTime = i;
                break;
            }
        }

        // 결과 출력
        System.out.println(meetingTime);
    }
}