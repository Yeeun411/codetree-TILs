import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(toBinary(n));
    }
    public static int toBinary(int n){
        String binary = "";
        while(true){
            if(n == 0){
                break;
            }
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        return Integer.parseInt(binary);
    }
}