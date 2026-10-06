public class StringEquality {

    public static void main(String args[]) {

        String s1 = "Infoviaan";
        String s2 = "Infoviaan";
        String s3 = new String("Infoviaan");
        String s4 = new String("Infoviaan");

        System.out.println(s1 == s2);       // true
        System.out.println(s1 == s3);       // false
        System.out.println(s2 == s4);       // false

        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  // true
        System.out.println(s2.equals(s4));  // true
        System.out.println(s2.equals(s3));  // true
    }
}