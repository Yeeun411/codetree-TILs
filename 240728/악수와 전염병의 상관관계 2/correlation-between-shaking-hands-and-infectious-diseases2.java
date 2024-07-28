import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // number of developers
        int K = sc.nextInt(); // number of handshakes after which a developer can no longer infect others
        int P = sc.nextInt(); // initial infected developer
        int T = sc.nextInt(); // number of handshakes
        
        // List to store all handshakes
        List<Handshake> handshakes = new ArrayList<>();
        
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            handshakes.add(new Handshake(t, x, y));
        }
        
        // Sort the handshakes based on the time they occurred
        Collections.sort(handshakes, Comparator.comparingInt(h -> h.time));
        
        boolean[] infected = new boolean[N + 1];
        int[] infectionCount = new int[N + 1];
        
        // Initial infection
        infected[P] = true;
        
        // Process each handshake in chronological order
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
        
        // Print the infection status of each developer
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