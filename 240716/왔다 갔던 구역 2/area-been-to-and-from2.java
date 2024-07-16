import java.util.Scanner;

public class Main {    
    public static final int OFFSET = 1000;
    public static final int MAX_R = 2000;
    public static final int MAX_N = 100;
    
    public static int n;
    public static int[] x1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];
    
    public static int[] checked = new int[MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        
        // 현재 위치
        int cur = 0;
        
        for(int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            char direction = sc.next().charAt(0);
            
            if(direction == 'L') {
                // 왼쪽으로 이동할 경우 : cur - distance ~ cur까지 경로 이동
                x1[i] = cur - distance;
                x2[i] = cur;
                cur -= distance;
            }
            else {
                // 오른쪽으로 이동할 경우 : cur ~ cur + distance까지 경로 이동
                x1[i] = cur;
                x2[i] = cur + distance;
                cur += distance;
            }
            
            // OFFSET을 더해줍니다.
            x1[i] += OFFSET;
            x2[i] += OFFSET;
        }
        
        // 구간을 칠해줍니다.
        // 구간 단위로 진행하는 문제이므로
        // x2[i]에 등호가 들어가지 않음에 유의합니다.
        for(int i = 0; i < n; i++)
            for(int j = x1[i]; j < x2[i]; j++)
                checked[j]++;
        
        // 2번 이상 지나간 영역의 크기를 구합니다.
        int cnt = 0;
        for(int i = 0; i <= MAX_R; i++)
            if(checked[i] >= 2)
                cnt++;
        
        System.out.print(cnt);
    }
}