import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> list = new ArrayList<>();
        while (!input.equals("end")) {
            list.add(input);
            input = scanner.nextLine();
        }

        for (String string : list) {
            System.out.print(string + " = ");
            for (int j = string.length() - 1; j >= 0; j--) {
                System.out.print(string.charAt(j));
            }
            System.out.println();
        }
    }
}