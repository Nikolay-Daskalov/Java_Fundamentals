import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] characters = scanner.nextLine().toCharArray();
        StringBuilder digits = new StringBuilder();
        StringBuilder alphabet = new StringBuilder();
        StringBuilder everyOtherCharacters = new StringBuilder();
        for (char character : characters) {
            if (Character.isDigit(character)) {
                digits.append(character).append("|");
            } else if (Character.isAlphabetic(character)) {
                alphabet.append(character).append("|");
            } else {
                everyOtherCharacters.append(character).append("|");
            }
        }

        System.out.print("The digits are: ");
        System.out.println(digits.toString().isEmpty() ? "none" : digits.toString());

        System.out.print("The characters are: ");
        System.out.println(alphabet.toString().isEmpty() ? "none" : alphabet.toString());

        System.out.print("Other characters are: ");
        System.out.println(everyOtherCharacters.toString().isEmpty() ? "none" : everyOtherCharacters.toString());
    }
}