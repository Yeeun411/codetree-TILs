import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int array[] = new int[n];
        for(int i =0;i<k;i++){
            int start = input.nextInt();
            int end = input.nextInt();
            for(int j = start-1;j<end;j++){
                array[j]+=1;
            }
        }
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println(max);
    }
}