import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student names (type 'done' to stop):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            students.add(name);
        }

        System.out.println("\nList of students:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
