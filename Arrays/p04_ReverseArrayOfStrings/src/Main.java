import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String[] string = scanner.nextLine().split("");

        System.out.print("Reversed string: ");
        for (int i = string.length - 1; i >= 0; i--) {
            System.out.print(string[i]);
        }
    }
}