import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        double aver = 0;
        for(int i=0;i<10;i++){
            int number = sc.nextInt();
            if(number>=250){
                break;
            }
            sum += number;
            n++;
        }
        aver = sum/(double)n;
        System.out.println(sum+" "+String.format("%.1f",aver));
    }
}