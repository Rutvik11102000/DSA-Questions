import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] enemies = new int[n];

        for (int i = 0; i < n; i++) {
            enemies[i] = sc.nextInt();
        }

        Arrays.sort(enemies);

        for (int enemy : enemies) {
            if (enemy < x) {
                x += enemy;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
