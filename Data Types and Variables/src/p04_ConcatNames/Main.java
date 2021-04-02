package p04_ConcatNames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your first name: ");
        String firstName = reader.readLine();

        System.out.print("Enter your middle name: ");
        String middleName = reader.readLine();

        System.out.print("Enter your last name: ");
        String lastName = reader.readLine();

        System.out.printf("Your name is: %s %s %s.%n:)%n", firstName, middleName, lastName);
    }
}