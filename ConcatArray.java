import java.util.*;
import java.io.*;

public class ConcatArray {
    // 1929 //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();

        System.out.println("Enter Array");
        int[] arr = new int[n];
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 2 * n; i++) {
            if (i >= n) {
                ans[i] = arr[i - n];
            } else {
                ans[i] = arr[i];
            }
        }

        System.out.println("Resulting Array");
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
