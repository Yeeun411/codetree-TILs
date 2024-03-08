import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String calculate = scanner.next();
        int b = scanner.nextInt();

        int answer = 0;

        if(calculate.equals("*")){
            answer = a*b;
            System.out.println(a+" "+calculate+" "+b+" = "+answer);
        } else if(calculate.equals("+")){
            answer = a+b;
            System.out.println(a+" "+calculate+" "+b+" = "+answer);
        } else if(calculate.equals("-")){
            answer = a-b;
            System.out.println(a+" "+calculate+" "+b+" = "+answer);
        } else if(calculate.equals("/")){
            answer = a/b;
            System.out.println(a+" "+calculate+" "+b+" = "+answer);
        } else{
            System.out.println("False");
        }
    }

}