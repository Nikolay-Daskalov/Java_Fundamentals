import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Student> list = new ArrayList<>();

        while (!input[0].equals("end")) {
            Student student = new Student(input[0], input[1], Integer.parseInt(input[2]), input[3]);
            list.add(student);
            input = scanner.nextLine().split("\\s+");
        }

        String city = scanner.nextLine();

        for (Student student : list) {
            if (student.getHometown().equals(city)) {
                System.out.printf("%s %s is %d years old.%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}