import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(hap(n));
    }
    public static int hap(int n){
        int answer = (1+n)*(n/2);
        if(n%2 != 0){
            answer += n/2+1;
        }
        return answer/10;
    }
}