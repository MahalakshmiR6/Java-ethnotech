public class StringConcatenation {

    public static void main(String args[]) {
        String s = "Sachin";
        System.out.println(s); 
        s = "Sachin" + " Tendulkar";
        System.out.println(s); // Sachin Tendulkar

        String sn = 50 + 30 + " Sachin " + 40 + 40;
        System.out.println(sn); // 80Sachin4040 because Java evaluates left to right: 
        // it adds 50 + 30 first, then concatenates the remaining values as text 
         /*👉 Before the first String → + does addition.
        // 👉 After the first String → + does concatenation.
*/
        String sn1 = 50 + 30 + " Sachin " +( 40 + 40);
        System.out.println(sn1); // 80Sachin80

        String s1 = "Sachin ";
        String s2 = "Tendulkar";

        String s3 = s1.concat(s2);
        System.out.println(s3); // Sachin Tendulkar
    }
}