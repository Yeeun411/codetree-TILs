import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String calculate = scanner.next();
        int b = scanner.nextInt();

        System.out.println(a+" "+calculate+" "+b+" = "+calculator(a,calculate,b));
    }
    public static int calculator(int a, String cal, int b){
        int answer = 0;
        switch(cal){
            case "+": answer = a+b;
            case "-": answer = a-b;
            case "/": answer = a/b;
            case "*": answer = a*b;
        }
        return answer;
    }
}