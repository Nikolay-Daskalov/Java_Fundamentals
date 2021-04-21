import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> charactersCount = new LinkedHashMap<>();

        for (int i = 0; i < input.trim().length(); i++) {
            if (input.charAt(i) != ' ') {
                if (charactersCount.containsKey(input.charAt(i))) {
                    charactersCount.put(input.charAt(i), charactersCount.get(input.charAt(i)) + 1);
                } else {
                    charactersCount.put(input.charAt(i), 1);
                }
            }
        }
        charactersCount.entrySet().stream()
                .forEach(characterCount -> System.out.println(characterCount.getKey() + " -> " + characterCount.getValue()));
    }
}