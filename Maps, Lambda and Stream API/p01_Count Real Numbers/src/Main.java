import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> map = new TreeMap<>();

        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        for (double num : nums) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }
        Consumer<Map.Entry<Double, Integer>> consumer = entry -> System.out.printf("%.2f -> %d.%n", entry.getKey(), entry.getValue());

        map.entrySet().stream()
                .forEach(consumer);
    }
}