import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder userName = new StringBuilder(reader.readLine());
        StringBuilder reversedUserName = new StringBuilder(userName.toString());
        reversedUserName.reverse();

        for (int i = 1; i <= 4; i++) {
            String input = reader.readLine();
            if (reversedUserName.toString().equals(input)) {
                System.out.printf("User %s logged in.%n", userName);
                return;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }

        System.out.printf("User %s blocked!%n", userName);
    }
}
