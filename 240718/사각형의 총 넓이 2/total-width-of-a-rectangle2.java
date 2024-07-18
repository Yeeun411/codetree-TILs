import java.util.*;

public class Main {
    static class Rectangle {
        int x1, y1, x2, y2;
        Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Rectangle> rectangles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            rectangles.add(new Rectangle(x1, y1, x2, y2));
        }

        Set<String> coveredPoints = new HashSet<>();

        for (Rectangle rect : rectangles) {
            for (int x = rect.x1; x < rect.x2; x++) {
                for (int y = rect.y1; y < rect.y2; y++) {
                    coveredPoints.add(x + "," + y);
                }
            }
        }

        System.out.println(coveredPoints.size());
    }
}