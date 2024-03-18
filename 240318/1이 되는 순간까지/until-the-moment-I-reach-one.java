import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(reduceToOne(N, 0));
    }
    
    public static int reduceToOne(int N, int count) {
        if(N == 1){
            return count;
        } else if(N%2==0){
            count++;
            return reduceToOne(N/2,count);
        }else{
            count++;
            return reduceToOne(N/3,count);
        }
    }
}