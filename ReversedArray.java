import java.util.*;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] rev = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse into another array
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }

        // Print reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}
