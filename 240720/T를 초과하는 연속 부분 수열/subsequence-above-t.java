import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 N을 입력 받음
        int N = scanner.nextInt();
        int t = scanner.nextInt();

        // 숫자 배열을 저장할 배열 생성
        int[] numbers = new int[N];

        // 숫자 배열 입력 받기
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 최대 연속 길이 계산
        int maxStreak = 1;  // 최소 길이는 1이므로 1로 초기화
        int currentStreak = 1;  // 현재 연속 길이

        for (int i = 1; i < N; i++) {
            if ((numbers[i]>t) && (numbers[i-1]>t)) {
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 1;  // 연속이 끊기면 초기화
            }
        }

        // 결과 출력
        System.out.println(maxStreak);
    }
}