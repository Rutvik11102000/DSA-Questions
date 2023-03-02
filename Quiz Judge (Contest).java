import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> teamScore = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String winner = sc.nextLine();
            if (!teamScore.containsKey(winner)) {
                teamScore.put(winner, 1);
            } else {
                int score = teamScore.get(winner) + 1;
                teamScore.put(winner, score);
            }
        }
        int maxScore = 0;
        String winningTeam = "";
        for (Map.Entry<String, Integer> entry : teamScore.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                winningTeam = entry.getKey();
            }
        }
        System.out.println(winningTeam);
    }
}