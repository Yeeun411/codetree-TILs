import java.util.Scanner;

/*
 * 2011년 m1월 d1일로부터 2011년 m2월 d2일까지는 총 며칠이 있는지를 계산하는 프로그램을 작성해보세요.
 * 2011년은 윤년이 아닌 해이기 때문에 2월은 28일까지 있습니다.
 * 단, 날짜 계산시 시작일을 포함하여 세도록 합니다.
 * */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m1 = input.nextInt();
        int d1 = input.nextInt();
        int m2 = input.nextInt();
        int d2 = input.nextInt();
        int change1 = checkDays(m1)+d1;
        int change2 = checkDays(m2)+d2;
        int result = change2 - change1 + 1;
        System.out.println(result);
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