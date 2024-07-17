/*
일직선으로 무한히 나열된 타일이 있습니다.
아무 타일에서 시작하여 n번의 명령에 걸쳐 움직입니다.
명령은 "x L", "x R" 형태로만 주어지며, "x L"의 경우 왼쪽으로 이동하면서 현재 위치 타일포함 총 x칸의 타일을 흰색으로 연속하게 칠하고,
"x R"의 경우 오른쪽으로 이동하면서 현재 위치 타일포함 총 x칸의 타일을 검은색으로 연속하게 칠함을 뜻합니다.
각 명령 이후에는 마지막으로 칠한 타일 위치에 서있는다고 가정합니다.
타일의 색은 덧칠해지면 마지막으로 칠해진 색으로 바뀌는데,
만약 타일 하나가 순서 상관없이 흰색과 검은색으로 각각 두 번 이상 칠해지면 회색으로 바뀌고 더 이상 바뀌지 않습니다.
모든 명령을 실행한 뒤의 흰색, 검은색, 회색의 타일 수를 각각 출력하는 프로그램을 작성해보세요.
*/
import java.util.Scanner;

public class Main {
    public static final int MAX_K = 100000;

    public static int n;
    public static int[] a = new int[2 * MAX_K + 1];
    public static int[] cntB = new int[2 * MAX_K + 1];
    public static int[] cntW = new int[2 * MAX_K + 1];
    public static int b, w, g;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 입력
        n = sc.nextInt();

        int cur = MAX_K;
        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'L') {
                // x칸 왼쪽으로 칠합니다.
                while(x-- > 0) {
                    a[cur] = 1;
                    cntW[cur] = -1;
                    if(x > 0) cur--;
                }
            }
            else {
                // x칸 오른쪽으로 칠합니다.
                while(x-- > 0) {
                    a[cur] = 2;
                    cntW[cur] = 1;
                    if(x > 0) cur++;
                }
            }
        }

        for(int i = 0; i <= 2 * MAX_K; i++) {
            // 검은색과 흰색으로 두 번 이상 칠해진 타일은 회색입니다.
            if(cntW[i] == 1) b++;
                // 그렇지 않으면 현재 칠해진 색깔이 곧 타일의 색깔입니다.
            else if(cntW[i] == -1) w++;
        }

        // 정답을 출력합니다.
        System.out.print(w + " " + b);
    }
}