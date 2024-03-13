import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.next();
        char[] arr = palindrome.toCharArray();
        for(int i=0;i<arr.length;i++){
            int j = arr.length-i-1;
            if(i>=j){
                System.out.println("Yes");
                break;
            }else{
                if(arr[i] != arr[j]){
                    System.out.println("No");
                    break;
                }
            }
        }
    }
}