import java.util.Scanner;
class Secret {
    String code;
    String meetingPoint;
    int time;


    public Secret(String code, String meetingPoint, int time ){
        this.code = code;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
};
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();
        String meetingPoint = scanner.next();
        int time = scanner.nextInt();
        Secret secret = new Secret(code,meetingPoint,time);
        System.out.println("secret code : "+secret.code);
        System.out.println("meeting point : "+secret.meetingPoint);
        System.out.println("time : "+secret.time);
        
    }
}