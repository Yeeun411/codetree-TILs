import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String code = scanner.next();
        String color = scanner.next();
        
        int second = scanner.nextInt();
        
        // BombDisarm 객체 생성 및 결과 출력
        BombDisarm bombDisarm = new BombDisarm(code, color, second);
        bombDisarm.printDisarmInstruction();
    }
}

class BombDisarm {
    private String code;
    private String color;
    private int second;
    
    public BombDisarm(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
    
    public void printDisarmInstruction() {
        // 여기에서 해제 코드, 선의 색, 특정 초에 따른 로직 구현
        // 예시에서는 입력 받은 값 그대로 출력
        System.out.println("code : " + this.code);
        System.out.println("color : " + this.color);
        System.out.println("second : " + this.second);
    }
}