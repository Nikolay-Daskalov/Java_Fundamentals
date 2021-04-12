import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a operator (add/multiply/subtract/divide): ");
        String operator = scanner.nextLine();

        System.out.print("Enter first number: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter second number: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Output: " + example(a, b, operator));
    }

    static int example(int a, int b, String operator) {
        int answer = Integer.MIN_VALUE;
        switch (operator) {
            case "add":
                answer = a + b;
                break;
            case "multiply":
                answer = a * b;
                break;
            case "subtract":
                answer = a - b;
                break;
            case "divide":
                answer = a / b;
                break;
        }
        return answer;
    }
}