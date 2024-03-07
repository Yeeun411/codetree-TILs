import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(findMin(a,b,c));
        
    }
    public static int findMin(int a,int b,int c){

        int[] arr = {a,b,c};
        int min = Arrays.stream(arr)
                        .min()
                        .orElse(0);
        return min;

    }
}