import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        for(int i = a;i<b+1;i++){
            if(isIncluded(i)==true||i%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isIncluded(int n){
        char[] arr = String.valueOf(n).toCharArray();
        for(char element:arr){
            if(element=='3'||element=='6'||element=='9'){
                return true;
            }
        }
        return false;
    }
}