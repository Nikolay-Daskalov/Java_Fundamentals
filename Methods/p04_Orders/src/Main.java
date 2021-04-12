import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a product (coffee/water/coke/snacks): ");
        String product = scanner.nextLine();

        System.out.print("Enter a quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = productsPrice(product);
        System.out.printf("You bought a %s which will cost you a %.2flv each with quantity of %d and total of %.2flv.", product, price, quantity, price * quantity);
    }

    static double productsPrice(String operator) {
        double price = -1;
        switch (operator) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        return price;
    }
}
