import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + ", " + value);
            } else {
                map.put(key, value);
            }
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }
    }
}