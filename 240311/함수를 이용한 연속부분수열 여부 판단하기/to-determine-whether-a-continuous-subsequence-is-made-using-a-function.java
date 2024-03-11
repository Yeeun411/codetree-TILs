import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfA = scanner.nextInt();
        int nOfB = scanner.nextInt();
        int[] arrA = new int[nOfA];
        int[] arrB = new int[nOfB];

        for(int i = 0; i<nOfA; i++){
            arrA[i] = scanner.nextInt();
        }

        for(int j = 0; j<nOfB; j++){
            arrB[j] = scanner.nextInt();
        }
        int count = 0;

        for(int elementA:arrA){
            for(int elementB:arrB){
                if(elementA==elementB){
                    count++;
                }
            }
            if(count==nOfB){
                break;
            }
        }

        if(count==nOfB){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}