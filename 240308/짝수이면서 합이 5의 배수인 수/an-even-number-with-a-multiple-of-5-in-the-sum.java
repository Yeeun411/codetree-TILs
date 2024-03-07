import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int condition1 = n%2;
        int condition2 = ((n/10)+(n-((n/10)*10)))%5;
        if(condition1==0&&condition2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}