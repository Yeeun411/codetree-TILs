import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        
        List<Handshake> handshakes = new ArrayList<>();
        
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            handshakes.add(new Handshake(t, x, y));
        }
        
        Collections.sort(handshakes, Comparator.comparingInt(h -> h.time));
        
        boolean[] infected = new boolean[N + 1];
        int[] infectionCount = new int[N + 1];
        
        infected[P] = true;
        
        for (Handshake h : handshakes) {
            int x = h.developer1;
            int y = h.developer2;
            
            if (infected[x] && infectionCount[x] < K) {
                if (!infected[y]) {
                    infected[y] = true;
                }
                infectionCount[x]++;
            }
            
            if (infected[y] && infectionCount[y] < K) {
                if (!infected[x]) {
                    infected[x] = true;
                }
                infectionCount[y]++;
            }
        }
        
        for (int i = 1; i <= N; i++) {
            System.out.print(infected[i] ? 1 : 0);
        }
    }
    
    static class Handshake {
        int time;
        int developer1;
        int developer2;
        
        Handshake(int time, int developer1, int developer2) {
            this.time = time;
            this.developer1 = developer1;
            this.developer2 = developer2;
        }
    }
}