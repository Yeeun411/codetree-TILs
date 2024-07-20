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

        List<Rectangle> rectangles = new ArrayList<>();
        int ax1 = scanner.nextInt();
        int ay1 = scanner.nextInt();
        int ax2 = scanner.nextInt();
        int ay2 = scanner.nextInt();
        rectangles.add(new Rectangle(ax1, ay1, ax2, ay2));
        
        int bx1 = scanner.nextInt();
        int by1 = scanner.nextInt();
        int bx2 = scanner.nextInt();
        int by2 = scanner.nextInt();
        rectangles.add(new Rectangle(bx1, by1, bx2, by2));
        
        // Read third rectangle for subtraction
        int cx1 = scanner.nextInt();
        int cy1 = scanner.nextInt();
        int cx2 = scanner.nextInt();
        int cy2 = scanner.nextInt();
        Rectangle rectC = new Rectangle(cx1, cy1, cx2, cy2);

        Set<String> coveredPoints = new HashSet<>();
        Set<String> subtractPoints = new HashSet<>();

        for (Rectangle rect : rectangles) {
            for (int x = rect.x1; x < rect.x2; x++) {
                for (int y = rect.y1; y < rect.y2; y++) {
                    coveredPoints.add(x + "," + y);
                }
            }
        }

        // Process points for rectangle C
        for (int x = rectC.x1; x < rectC.x2; x++) {
            for (int y = rectC.y1; y < rectC.y2; y++) {
                subtractPoints.add(x + "," + y);
            }
        }

        // Subtract the points of rectangle C from the covered points
        for (String point : subtractPoints) {
            coveredPoints.remove(point);
        }

        System.out.println(coveredPoints.size());
    }
}