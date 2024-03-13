import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(whichSeason(y, m, d));
    }

    public static String whichSeason(int y, int m, int d) {
        boolean isLeapYear = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);

        if (!doesExist(m, d, isLeapYear)) {
            return "-1";
        }

        if (m >= 3 && m <= 5) {
            return "Spring";
        } else if (m >= 6 && m <= 8) {
            return "Summer";
        } else if (m >= 9 && m <= 11) {
            return "Fall";
        } else {
            return "Winter";
        }
    }

    public static boolean doesExist(int m, int d, boolean isLeapYear) {
        int[] daysInMonth = {31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m < 1 || m > 12 || d < 1) {
            return false;
        }
        return d <= daysInMonth[m - 1];
    }
}