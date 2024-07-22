import java.util.Scanner;

public class Main {
    public static final int MAX_T = 1000000;
    
    public static int n, m;
    public static int[] posA = new int[MAX_T + 1];
    public static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        m = sc.nextInt();
        
        // A가 매 초마다 서있는 위치를 기록
        int timeA = 1;
        for(int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            while(t-- > 0) {
                posA[timeA] = posA[timeA - 1] + v;
                timeA++;
            }
        }
        
        // B가 매 초마다 서있는 위치를 기록
        int timeB = 1;
        for(int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            while(t-- > 0) {
                posB[timeB] = posB[timeB - 1] + v;
                timeB++;
            }
        }
        
        // A와 B 중 더 앞서 있는 경우를 확인합니다.
        // A가 리더면 1, B가 리더면 2로 관리합니다.
        int leader = 0, ans = 0;
        for(int i = 1; i < timeA; i++) {
            if(posA[i] > posB[i]) {
                // 기존 리더가 B였다면
                // 답을 갱신합니다.
                if(leader == 2)
                    ans++;
                
                // 리더를 A로 변경합니다.
                leader = 1; 
            }
            else if(posA[i] < posB[i]) {
                // 기존 리더가 A였다면
                // 답을 갱신합니다.
                if(leader == 1)
                    ans++;
                
                // 리더를 B로 변경합니다.
                leader = 2; 
            }
        }
        
        System.out.print(ans);
    }
}