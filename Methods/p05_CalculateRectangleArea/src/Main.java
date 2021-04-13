import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height: ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("The area is: " + calculateRectangleArea(height, width));
    }

    private static double calculateRectangleArea(double height, double width) {
        return height * width;
    }
}