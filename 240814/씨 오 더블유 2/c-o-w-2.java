import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        String input = scanner.next();
        
        List<Integer> cPositions = new ArrayList<>();
        List<Integer> oPositions = new ArrayList<>();
        List<Integer> wPositions = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (ch == 'C') {
                cPositions.add(i);
            } else if (ch == 'O') {
                oPositions.add(i);
            } else if (ch == 'W') {
                wPositions.add(i);
            }
        }

        int count = 0;

        for (int cPos : cPositions) {
            for (int oPos : oPositions) {
                if (oPos > cPos) {
                    for (int wPos : wPositions) {
                        if (wPos > oPos) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}