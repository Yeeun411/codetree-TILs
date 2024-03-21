import java.util.Scanner;
class Nextlevel {
    String id;
    int level;

    public Nextlevel(String id, int level){
        this.id = id;
        this.level = level;
    }
};
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        int level = scanner.nextInt();
        String id1 = "codetree";
        int level1 = 10;
        Nextlevel nextlevel1 = new Nextlevel(id1,level1);
        System.out.print("user "+nextlevel1.id);
        System.out.println(" lv "+nextlevel1.level);
        
        Nextlevel nextlevel = new Nextlevel(id, level);
        System.out.print("user "+nextlevel.id);
        System.out.println(" lv "+nextlevel.level);
        
    }
}