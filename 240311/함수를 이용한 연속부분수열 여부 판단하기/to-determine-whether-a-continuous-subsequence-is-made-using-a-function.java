import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfA = scanner.nextInt();
        int nOfB = scanner.nextInt();
        int[] arrA = new int[nOfA];
        int[] arrB = new int[nOfB];

        for(int i = 0; i < nOfA; i++){
            arrA[i] = scanner.nextInt();
        }

        for(int j = 0; j < nOfB; j++){
            arrB[j] = scanner.nextInt();
        }

        // 호출
        boolean result = isSubsequence(arrA, arrB);
        System.out.println(result ? "Yes" : "No");
    }

    // 함수 작성
    public static boolean isSubsequence(int[] arrA, int[] arrB) {
        for (int i = 0; i <= arrA.length - arrB.length; i++) {
            boolean isSub = true;
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i + j] != arrB[j]) {
                    isSub = false;
                    break;
                }
            }
            if (isSub) {
                return true;
            }
        }
        return false;
    }
}