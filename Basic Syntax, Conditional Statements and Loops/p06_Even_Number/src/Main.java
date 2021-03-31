import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Enter a even number: ");
            int number = Integer.parseInt(reader.readLine());
            number = Math.abs(number);
            if (number % 2 == 0) {
                System.out.println("The number is: " + number);
                break;
            } else {
                System.out.println("Please write an even number.");
            }
        } while (true);
    }
}