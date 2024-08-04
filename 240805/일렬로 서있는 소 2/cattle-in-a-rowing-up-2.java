import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] heights = new int[N];
        
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }
        
        int count = 0;
        
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (heights[i] <= heights[j] && heights[j] <= heights[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}