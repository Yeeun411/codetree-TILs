import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int answer = 1;
        for(int i = 0;i<b;i++){
            answer *= a;
        }
        System.out.println(answer);
    }
}