import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.next();
        String words2 = scanner.next();
        char[] a = words.toCharArray();
        char[] b = words2.toCharArray();

        if(a.length==b.length){
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i = 0; i < a.length; i++){
                if(a[i]!=b[i]){
                    System.out.println("No");
                    break;
                }
                if(i==a.length-1){
                    System.out.println("Yes");
                }
            }
        }else{
            System.out.println("No");
        }

        
    }
}