import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        
        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isEvenDigitSum(i)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    // 소수 판별 함수
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    // 자릿수의 합이 짝수인지 판별하는 함수
    public static boolean isEvenDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum % 2 == 0;
    }
}