import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int answer = 0;
        if(a==b){
            System.out.println("0");
        }else{
            for(int i = a;i<b+1;i++){
                if(isPrime(i)==true){
                    answer += i;
                }
            }
            System.out.println(answer);
        }

    }
    public static boolean isPrime(int n){
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }



}