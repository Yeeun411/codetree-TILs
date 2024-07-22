import java.util.Scanner;

public class Main {
    public static final int MAX_T = 1000000;
    
    public static int n, m;
    public static int[] posA = new int[MAX_T  + 1];
    public static int[] posB = new int[MAX_T  + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        m = sc.nextInt();
        
        // A가 매 초마다 서있는 위치를 기록
        int timeA = 1;
        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            while(t-- > 0) {
                if(d == 'R')
                    posA[timeA] = posA[timeA - 1] + 1;
                else
                    posA[timeA] = posA[timeA - 1] - 1;
                
                timeA++;
            }
        }
        
        // B가 매 초마다 서있는 위치를 기록
        int timeB = 1;
        for(int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            while(t-- > 0) {
                if(d == 'R')
                    posB[timeB] = posB[timeB - 1] + 1;
                else
                    posB[timeB] = posB[timeB - 1] - 1;
                
                timeB++;
            }
        }
        
        if(timeA < timeB) {
            for(int i = timeA; i < timeB; i++) {
                posA[i] = posA[i - 1];
            }
        }
        else if(timeA > timeB) {
            for(int i = timeB; i < timeA; i++) {
                posB[i] = posB[i - 1];
            }
        }
        
        // 새롭게 만나는 횟수를 구합니다.
        int cnt = 0;
        int timeMax = 0;
        if(timeA < timeB)
            timeMax = timeB;
        else
            timeMax = timeA;
        
        for(int i = 1; i < timeMax; i++) {
            if(posA[i] == posB[i] && posA[i - 1] != posB[i - 1])
                cnt++;
        }
        
        System.out.print(cnt);
    }
}