package p05_LowerOrUpper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a character: ");
        char character = reader.readLine().charAt(0);

        if (character >= 65 && character <= 90) {
            System.out.println("The character: " + character + " is Upper case.");
        } else if (character >= 97 && character <= 122) {
            System.out.println("The character: " + character + " is Lower case.");
        }
    }
}
