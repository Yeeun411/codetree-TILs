import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(n>m){
            int a = n;
            n = m;
            m = a;
        }
        int answer = 1;
        for(int i = 2;i<m+1;i++){
            if(n%i==0&&m%i==0){
                answer *= i;
                if(answer>=m){
                    break;
                }

            }
        }
        if(answer == 1){
            answer = m*n;
        }
        System.out.println(answer);
    }
}