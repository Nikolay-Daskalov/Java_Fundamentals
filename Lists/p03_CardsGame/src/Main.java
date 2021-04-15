import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = parseLineOfNumbers(scanner);
        List<Integer> secondPlayerCards = parseLineOfNumbers(scanner);

        while (!secondPlayerCards.isEmpty() && !firstPlayerCards.isEmpty()) {
            if (secondPlayerCards.get(0) > firstPlayerCards.get(0)) {
                secondPlayerCards.add(secondPlayerCards.get(0));
                secondPlayerCards.add(firstPlayerCards.get(0));
                secondPlayerCards.remove(0);
                firstPlayerCards.remove(0);
            } else if (secondPlayerCards.get(0) < firstPlayerCards.get(0)) {
                firstPlayerCards.add(firstPlayerCards.get(0));
                firstPlayerCards.add(secondPlayerCards.get(0));
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            } else {
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            }
        }
        int sum = 0;
        if (secondPlayerCards.isEmpty()) {
            for (int i = 0; i < firstPlayerCards.size(); i++) {
                sum += firstPlayerCards.get(i);
            }
            System.out.println("First player wins! Sum: " + sum);
        } else {
            for (int i = 0; i < secondPlayerCards.size(); i++) {
                sum += secondPlayerCards.get(i);
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }

    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String[] numbers = scanner.nextLine().split(" ");
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            nums.add(Integer.parseInt(numbers[i]));
        }

        return nums;
    }
}
