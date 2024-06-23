import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int[] overlaps = new int[201]; // -100 ~ 100 을 위한 배열, offset 100 더해 사용

        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            // 해당 범위에 대해 겹치는 부분 +=1
            for (int j = x1 + 100; j < x2 + 100; j++) {
                overlaps[j]++;
            }
        }

        // 최대 겹치는 부분 찾기
        int maxOverlap = 0;
        for (int i = 0; i < overlaps.length; i++) {
            if (overlaps[i] > maxOverlap) {
                maxOverlap = overlaps[i];
            }
        }

        // 결과 출력
        System.out.println(maxOverlap);
        
        scanner.close();
    }
}