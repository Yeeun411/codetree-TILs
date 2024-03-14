import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] inputArr = input.toCharArray();
        String objective = scanner.next();
        char[] objectiveArr = objective.toCharArray();
        boolean found = false;
        int n = 0;
        
        while(n <= inputArr.length - objectiveArr.length && !found) {
            int tmp = n;
            for(int i = 0; i < objectiveArr.length && tmp < inputArr.length; i++) {
                if(inputArr[tmp] != objectiveArr[i]) {
                    break;
                }
                tmp++;
                
                if(tmp - n == objectiveArr.length) {
                    System.out.println(n);
                    found = true;
                    break;
                }
            }
            if(!found) {
                n++;
            }
        }

        if(!found) {
            System.out.println("-1");
        }
    }
}