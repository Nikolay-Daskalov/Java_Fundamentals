import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day (Weekday/Weekend/Holiday):");
        String day = scanner.nextLine();
        System.out.println("Enter an age:");
        int age = Integer.parseInt(scanner.nextLine());
        int price = -1;
        switch (day) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                } else if (age > 64 && age <= 122) {
                    price = 12;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                } else if (age > 64 && age <= 122) {
                    price = 15;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                }
                break;
        }

        if (price != -1) {
            System.out.println('$' + price);
        } else {
            System.out.println("Error!");
        }

        scanner.close();
    }
}
