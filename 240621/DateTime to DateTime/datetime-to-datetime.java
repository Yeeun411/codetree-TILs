import java.util.Scanner;

/*
 * 2011년 m1월 d1일로부터 2011년 m2월 d2일까지는 총 며칠이 있는지를 계산하는 프로그램을 작성해보세요.
 * 2011년은 윤년이 아닌 해이기 때문에 2월은 28일까지 있습니다.
 * 단, 날짜 계산시 시작일을 포함하여 세도록 합니다.
 * */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int changeInput = (a * 24 * 60) + (b * 60) +c; // 하루, 시간을 변환
        int change11 = (11*24*60)+(11*60)+11;

        int result = changeInput - change11;
        if (result>=0){
            System.out.println(result);
        }else{
            System.out.println("-1");
        }
    }
}