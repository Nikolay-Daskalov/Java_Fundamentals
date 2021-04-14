import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an array of ints: ");
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("End")) {

            if (command[0].equals("Add")) {
                numbers.add(Integer.parseInt(command[1]));

            } else if (command[0].equals("RemoveAt")) {
                int index = Integer.parseInt(command[1]);
                if (index < 0 || index >= numbers.size()) {
                    System.out.println("Wrong index!");
                    return;
                }
                numbers.remove(index);

            } else if (command[0].equals("Insert")) {
                Integer index = indexValidator(numbers.size(), command[1]);
                if (index == null) {
                    return;
                }
                numbers.add(index, Integer.parseInt(command[2]));
            }

            command = scanner.nextLine().split("\\s+");
        }

        System.out.print("Array: ");
        numbers.forEach(integer -> System.out.print(integer + " "));
        System.out.println();

        scanner.close();
    }

    private static Integer indexValidator(int size, String command) {
        int index = Integer.parseInt(command);
        if (index < 0 || index >= size) {
            System.out.println("Wrong index!");
            return null;
        }
        return index;
    }
}