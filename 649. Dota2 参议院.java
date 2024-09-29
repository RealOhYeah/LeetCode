import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();

        // Populate queues for Radiant and Dire
        for (int i = 0; i < n; i++) {
            char senator = senate.charAt(i);
            if (senator == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }

        // Simulate the voting process
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();

            if (rIndex < dIndex) {
                radiant.offer(rIndex + n); // simulate the next time Radiant can vote
            } else {
                dire.offer(dIndex + n); // simulate the next time Dire can vote
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        // Example 1
        String senate1 = "RD";
        System.out.println(predictPartyVictory(senate1));  

        // Example 2
        String senate2 = "RDD";
        System.out.println(predictPartyVictory(senate2));  
    }
}
