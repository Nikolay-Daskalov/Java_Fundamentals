import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter usernames to check: ");
        String[] tokens = scanner.nextLine().split(", ");
        int index = 0;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length() >= 3 && tokens[i].length() <= 16) {
                StringBuilder validUsernames = new StringBuilder();
                for (int j = 0; j < tokens[i].length(); j++) {
                    if (Character.isAlphabetic(tokens[i].charAt(j))) {
                        validUsernames.append(tokens[i].charAt(j));
                    } else if (Character.isDigit(tokens[i].charAt(j))) {
                        validUsernames.append(tokens[i].charAt(j));
                    } else if (tokens[i].charAt(j) == '-') {
                        validUsernames.append(tokens[i].charAt(j));
                    } else if (tokens[i].charAt(j) == '_') {
                        validUsernames.append(tokens[i].charAt(j));
                    }
                }
                if (tokens[i].equals(validUsernames.toString())) {
                    if (index == 0) {
                        System.out.println("Valid Usernames:");
                        index++;
                    }
                    System.out.println(validUsernames);
                }
            }
        }
    }
}