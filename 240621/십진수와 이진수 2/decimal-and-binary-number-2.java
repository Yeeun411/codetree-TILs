import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n = toDecimal(n) * 17;

        System.out.println(toBinaryString(n));
    }

    public static String toBinaryString(int n) {
        if (n == 0) {
            return "0";
        }
        String binary = "";
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        return binary;
    }

    public static String toKinaryString(int n, int k) {
        if (n == 0) {
            return "0";
        }
        String kinary = "";
        while (n > 0) {
            int remainder = n % k;
            kinary = remainder + kinary;
            n = n / k;
        }
        return kinary;
    }

    public static int toDecimal(int n) {
        int decimal = 0;
        int p = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            decimal += lastDigit * Math.pow(2, p);
            p++;
            n = n / 10;
        }
        return decimal;
    }
}