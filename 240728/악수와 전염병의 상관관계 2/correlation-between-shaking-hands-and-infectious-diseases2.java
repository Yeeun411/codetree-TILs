import java.util.Scanner;
import java.util.Arrays;

// 악수의 정보를 나타내는 클래스 선언
class Shake implements Comparable<Shake> {
    int time;
    int person1;
    int person2;
    
    public Shake(int time, int person1, int person2) {
        this.time = time;
        this.person1 = person1;
        this.person2 = person2;
    }

    @Override
    public int compareTo(Shake shake) {
        // 시간을 기준으로 오름차순으로 정렬합니다.
        return time - shake.time;
    }
};

public class Main {
    public static final int MAX_T = 250;
    public static final int MAX_N = 100;
    
    public static int n, k, p, t;
    public static int[] shakeNum = new int[MAX_N + 1];
    public static boolean[] infected = new boolean[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        k = sc.nextInt();
        p = sc.nextInt();
        t = sc.nextInt();
        infected[p] = true;
        
        Shake[] shakes = new Shake[MAX_T];
        
        for(int i = 0; i < t; i++) {
            int time = sc.nextInt();
            int person1 = sc.nextInt();
            int person2 = sc.nextInt();
            // Shake 객체를 생성해 넣어줍니다.
            shakes[i] = new Shake(time, person1, person2);
        }
        
        // custom comparator를 활용한 정렬
        Arrays.sort(shakes, 0, t);
        
        // 각 악수 횟수를 세서,
        // K번 초과로 악수를 했을 시 전염시키지 않습니다.
        for(int i = 0; i < t; i++) {
            int target1 = shakes[i].person1;
            int target2 = shakes[i].person2;
            
            // 감염되어 있을 경우 악수 횟수를 증가시킵니다.
            if(infected[target1])
                shakeNum[target1]++;
            if(infected[target2])
                shakeNum[target2]++;
            
            // target1이 감염되어 있고 아직 K번 이하로 악수했다면 target2를 전염시킵니다.
            if(shakeNum[target1] <= k && infected[target1])
                infected[target2] = true;
            
            // target2가 감염되어 있고 아직 K번 이하로 악수했다면 target1을 전염시킵니다.
            if(shakeNum[target2] <= k && infected[target2])
                infected[target1] = true;
        }
        
        for(int i = 1; i <= n; i++) {
            if(infected[i])
                System.out.print(1);
            else
                System.out.print(0);
        }
        
    }
}