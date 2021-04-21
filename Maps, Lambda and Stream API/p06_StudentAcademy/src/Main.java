import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter grade: ");
            double grade = Double.parseDouble(scanner.nextLine());

            if (students.containsKey(name)) {
                List<Double> grades = students.get(name);
                grades.add(grade);
                students.put(name, grades);
            } else {
                students.put(name, new ArrayList<>(Collections.singletonList(grade)));
            }
        }

        Output(students);
    }

    private static void Output(Map<String, List<Double>> students) {
        students.entrySet().stream()
                .filter(grade -> grade.getValue().stream().mapToDouble(d -> d).sum() > 4.50)
                .sorted((a, b) -> Double.compare(b.getValue().stream().mapToDouble(d -> d).sum(),
                        a.getValue().stream().mapToDouble(d -> d).sum()))
                .forEach(grade -> System.out.printf("%s -> %.2f%n", grade.getKey(),
                        grade.getValue().stream().mapToDouble(a -> a).average().getAsDouble()));
    }
}