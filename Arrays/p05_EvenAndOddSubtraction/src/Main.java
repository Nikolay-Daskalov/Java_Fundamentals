import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some integers: ");
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumEven = 0, sumOdd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.printf("The sum of even numbers is: %d.%n", sumEven);
        System.out.printf("The sum of odd numbers is: %d.%n", sumOdd);
    }
}
