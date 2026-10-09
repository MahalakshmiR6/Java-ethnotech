import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("nikhil");
        students.add("minitha");
        students.add("sree");

        System.out.println("Students: " + students);

        students.addFirst("pithra");
        students.addLast("Nimi");

        System.out.println("After adding first and last: " + students);

        System.out.println("First: " + students.getFirst());
        System.out.println("Last: " + students.getLast());

        students.removeFirst();
        students.removeLast();

        System.out.println("After removing first and last: " + students);
    }
}