/*
위치 0에서 시작하여 n번의 명령에 걸쳐 움직인 뒤, 2번 이상 지나간 영역의 크기를 출력하는 프로그램을 작성해보세요.
단 명령은 “x L“, “x R” 형태로만 주어집니다.
"x L" 의 경우 왼쪽으로 x만큼 이동해야 함을, "x R"의 경우 오른쪽으로 x만큼 이동해야 함을 뜻합니다.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        int[] positionCount = new int[2001]; // To cover the range from -1000 to 1000
        int currentPosition = 1000; // Starting at position 0, which is indexed as 1000 in the array

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String[] parts = command.split(" ");
            int x = Integer.parseInt(parts[0]);
            char direction = parts[1].charAt(0);

            if (direction == 'L') {
                for (int j = 0; j < x; j++) {
                    positionCount[currentPosition - j]++;
                }
                currentPosition -= x;
            } else if (direction == 'R') {
                for (int j = 0; j < x; j++) {
                    positionCount[currentPosition + j]++;
                }
                currentPosition += x;
            }
        }

        int overlapCount = 0;
        for (int i = 0; i < positionCount.length; i++) {
            if (positionCount[i] >= 2) {
                overlapCount++;
            }
        }

        System.out.println(overlapCount);
        sc.close();
    }
}