import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        String n = input.next();

        int decimal = toDecimal(n, a);
        String result = toKinaryString(decimal, b);

        System.out.println(result);
    }

    public static int toDecimal(String n, int base) {
        int decimal = 0;
        int length = n.length();

        for (int i = 0; i < length; i++) {
            char digit = n.charAt(length - 1 - i);
            int value;
            if (digit >= '0' && digit <= '9') {
                value = digit - '0';
            } else {
                value = digit - 'A' + 10;
            }
            decimal += value * Math.pow(base, i);
        }

        return decimal;
    }

    public static String toKinaryString(int n, int k) {
        if (n == 0) {
            return "0";
        }
        String kinary = "";
        while (n > 0) {
            int remainder = n % k;
            if (remainder < 10) {
                kinary = remainder + kinary;
            } else {
                kinary = (char) ('A' + remainder - 10) + kinary;
            }
            n = n / k;
        }
        return kinary;
    }

    public static String toBinaryString(int n) {
        return toKinaryString(n, 2);
    }
}