import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        if(doesExist(m,d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean doesExist(int m,int d){
        int lastDate = 0;
        switch(m){
            case 1:  lastDate = 31;
                     break;
            case 2:  lastDate = 28;
                     break;
            case 3:  lastDate = 31;
                     break;
            case 4:  lastDate = 30;
                     break;
            case 5:  lastDate = 31;
                     break;
            case 6:  lastDate = 30;
                     break;
            case 7:  lastDate = 31;
                     break;
            case 8:  lastDate = 31;
                     break;
            case 9:  lastDate = 30;
                     break;
            case 10: lastDate = 31;
                     break;
            case 11: lastDate = 30;
                     break;
            case 12: lastDate = 31;
                     break;
            default: return false;
        }
        if(lastDate>=d){
            return true;
        }else{
            return false;
        }
    }
}