import java.util.HashMap;
import java.util.Map;
public class Hashmaps {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put(103,"Maha");
        students.put(102,"Mini");
        students.put(101,"Mahiya");
        students.put(104,"Pithra");
        System.out.println("Map: " + students);
        System.out.println("student 102: " + students.get(102));
        System.out.println("Size of map: " + students.size());
        System.out.println("Is map empty? " + students.isEmpty());
        System.out.println("Does map contain key 101? " + students.containsKey(101));
}