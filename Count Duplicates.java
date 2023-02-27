import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a, b) -> a - b);

        for (int key : keys) {
            if (map.get(key) > 1) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
