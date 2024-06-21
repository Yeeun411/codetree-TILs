import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m1 = input.nextInt();
        int d1 = input.nextInt();
        int m2 = input.nextInt();
        int d2 = input.nextInt();
        int change1 = checkDays(m1)+d1;
        int change2 = checkDays(m2)+d2;
        int result = change2 - change1+1;
        int a = result % 7;
        if(change2<change1){
            result = change1 - change2 + 5;
            a = 6 -(result%7);
        }
        switch(a) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 0:
                System.out.println("Sun");
                break;
        }

    }

    public static int checkDays(int month){
        int days = 0;

        for(int i =1;i<month;i++) {
            if(i == 1 || i == 3||i == 5 || i == 7|| i == 8 || i == 10||i == 12){
                days += 31;
            }
            else if(i == 2){
                days += 28;
            }
            else{
                days += 30;
            }
        }
        return days;
    }

}