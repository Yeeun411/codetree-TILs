import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
            if(arr[i]<0){
                arr[i] *= -1;
            }
            System.out.print(arr[i]+" ");
        }
    }
}