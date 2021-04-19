import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student information: ");
            String[] input = scanner.nextLine().split("\\s+");
            Student student = new Student(input[0], input[1], Double.parseDouble(input[2]));
            students.add(student);
        }

        students.stream()
                .sorted((a, b) -> Double.compare(b.getGrade(), a.getGrade()))
                .forEach(student -> System.out.println(student.toString()));

    }
}