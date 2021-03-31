import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a integer to start counting: ");
        int startNumber = Integer.parseInt(reader.readLine());

        System.out.print("Enter a integer to end counting: ");
        int endNumber = Integer.parseInt(reader.readLine());

        System.out.println();
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
