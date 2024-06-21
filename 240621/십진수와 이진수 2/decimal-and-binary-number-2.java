import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n = toDecimal(n)*17;

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
    public static int toKinary(int n,int k){
        String binary = "";
        while(true){
            if(n == 0){
                break;
            }
            int remainder = n % k;
            binary = remainder + binary;
            n = n / k;
        }
        return Integer.parseInt(binary);
    }

    public static int toDecimal(int n){
        int decimal = 0;
        int p = 0;
        while(true){
            if((n%10)==1){
                int j=1;
                for(int i=0;i<p;i++){
                    j*=2;
                }
                decimal += j;
            }
            p+=1;
            n=n/10;
            if(n<=0){
                return decimal;
            }
        }
    }
}