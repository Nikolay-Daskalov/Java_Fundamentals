import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String string = scanner.nextLine();

        while (string.contains(input)) {
            string = string.replace(input, "");
        }

        System.out.println(string);
    }
}