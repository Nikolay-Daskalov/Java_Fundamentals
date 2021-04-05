import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.print("Enter day of the week (number): ");
        int day = Integer.parseInt(reader.readLine());

        if (day > 0 && day < 8) {
            System.out.printf("The day is: %s.", days[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}