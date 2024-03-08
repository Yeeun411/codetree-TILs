import java.util.Scanner;

public class Main {
    
    // 온전수인지 판별하는 함수
    public static boolean isCompleteNumber(int number) {
        // 2로 나누어 떨어지는 경우
        if (number % 2 == 0) return false;
        // 일의 자리가 5인 경우
        if (number % 10 == 5) return false;
        // 3으로 나누어 떨어지면서 9로는 나누어 떨어지지 않는 수
        if (number % 3 == 0 && number % 9 != 0) return false;
        
        // 위 조건을 모두 만족하지 않는 경우, 온전수임
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 a와 b 입력받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0; // 온전수의 개수를 저장할 변수

        // a부터 b까지 반복하며 온전수인지 확인
        for (int i = a; i <= b; i++) {
            if (isCompleteNumber(i)) {
                count++;
            }
        }

        // 온전수의 개수 출력
        System.out.println(count);
    }
}