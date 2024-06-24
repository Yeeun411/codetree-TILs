import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int[] overlaps = new int[102]; // 1 ~ 100 을 위한 배열, offset 없이 사용

        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            // 해당 범위에 대해 겹치는 부분 +=1
            for (int j = x1; j <= x2; j++) {
                overlaps[j]++;
            }
        }

        // 최대 겹치는 부분 찾기
        int maxOverlap = 0;
        for (int i = 1; i <= 100; i++) {
            if (overlaps[i] > maxOverlap) {
                maxOverlap = overlaps[i];
            }
        }

        // 결과 출력
        System.out.println(maxOverlap);
        
        scanner.close();
    }
}