import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("minitha");
        students.add("sri");
        students.add("kiran");

        System.out.println("Students: " + students);

        if (students.contains("minitha")) {
            System.out.println("Minitha is present");
        }

        System.out.println("First student: " + students.get(0));

        students.set(1, "sriya");

        System.out.println("After update: " + students);

        students.remove("kiran");

        System.out.println("After removal: " + students);
    }
}