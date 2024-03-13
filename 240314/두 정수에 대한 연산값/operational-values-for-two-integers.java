import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a>=b){
            a += 25;
            b *= 2;
        }else{
            b += 25;
            a *= 2;
        }
        System.out.println(a+" "+b);
    }
}