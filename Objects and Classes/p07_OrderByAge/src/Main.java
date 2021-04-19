import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Person> people = new ArrayList<>();

        while (!input[0].equals("End")) {
            Person person = new Person(input[0], input[1], Integer.parseInt(input[2]));
            people.add(person);
            input = scanner.nextLine().split("\\s+");
        }

        people.stream()
                .sorted((a, b) -> Integer.compare(b.getAge(), a.getAge()))
                .forEach(person -> System.out.println(person.toString()));
    }
}