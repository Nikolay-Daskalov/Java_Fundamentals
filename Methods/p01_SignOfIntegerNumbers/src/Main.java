import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        numberRange(n);
    }

    public static void numberRange(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.%n", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.%n", number);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}