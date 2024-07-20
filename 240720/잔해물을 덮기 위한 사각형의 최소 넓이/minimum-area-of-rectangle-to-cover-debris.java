import java.util.Scanner;

public class Main {
    public static final int MAX_R = 2000;
    public static final int OFFSET = 1000;

    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x1 = new int[2];
        int[] y1 = new int[2];
        int[] x2 = new int[2];
        int[] y2 = new int[2];
        // 입력
        for(int i = 0; i < 2; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            // OFFSET을 더해줍니다.
            x1[i] += OFFSET;
            y1[i] += OFFSET;
            x2[i] += OFFSET;
            y2[i] += OFFSET;
        }

        // 첫 번째 직사각형과 두 번째 직사각형을 checked 배열에 표시
        for(int i = 0; i < 2; i++) {
            for(int x = x1[i]; x < x2[i]; x++) {
                for(int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y] = i + 1;
                }
            }
        }

        int maxWidth = 0;
        int maxHeight = 0;

        // 최대 연속 너비 구하기
        for(int y = 0; y <= MAX_R; y++) {
            int currentWidth = 0;
            for(int x = 0; x <= MAX_R; x++) {
                if (checked[x][y] == 1) {
                    currentWidth++;
                    if (currentWidth > maxWidth) {
                        maxWidth = currentWidth;
                    }
                } else {
                    currentWidth = 0;
                }
            }
        }

        // 최대 연속 높이 구하기
        for(int x = 0; x <= MAX_R; x++) {
            int currentHeight = 0;
            for(int y = 0; y <= MAX_R; y++) {
                if (checked[x][y] == 1) {
                    currentHeight++;
                    if (currentHeight > maxHeight) {
                        maxHeight = currentHeight;
                    }
                } else {
                    currentHeight = 0;
                }
            }
        }

        // 출력
        int area = maxWidth * maxHeight;
        System.out.println(area);
    }
}