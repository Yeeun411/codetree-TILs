import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] inputArr = input.toCharArray();
        String objective = scanner.next();
        char[] objectiveArr = objective.toCharArray();
        boolean keepFinding = true;
        int n = 0;
        while(keepFinding){
            if(n>inputArr.length){
                System.out.println("-1");
                keepFinding = false;
            }else{
                int tmp = n;
                for(int i = 0;i<objectiveArr.length;i++){
                    if(inputArr[tmp]!=objectiveArr[i]){
                        break;
                    }else{
                        tmp++;
                        
                        if(tmp-n==objectiveArr.length){
                            System.out.println(n);
                            keepFinding = false;
                        }
                    }
                }
                n++;
            }
        }



    }
}