import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        gradeOutput(number);
    }

    public static void gradeOutput(double number) {
        if (number <= 2.99 && number >= 2.00) {
            System.out.println("Fail");
        } else if (number <= 3.49 && number >= 3.00) {
            System.out.println("Poor");
        } else if (number <= 4.49 && number >= 3.50) {
            System.out.println("Good");
        } else if (number <= 5.49 && number >= 4.50) {
            System.out.println("Very good");
        } else if (number <= 6.00 && number >= 5.50) {
            System.out.println("Excellent");
        }
    }
}