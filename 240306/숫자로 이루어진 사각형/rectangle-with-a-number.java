import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = 1;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.print(temp+" ");
                temp++;
                if(temp>9){
                    temp = 1;
                }
            }
            System.out.println("");
        }
    }
}