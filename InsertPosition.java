
// Given a sorted array of distinct integers and a target value, return the index if the target is found.
//  If not, return the index where it would be if it were inserted in order.
import java.util.*;
import java.io.*;

public class InsertPosition {
    public static int findInsertPos(int[] arr, int x) {
        int start = 0, high = arr.length - 1;
        while (start <= high) {
            
            int mid = (start + high) / 2;

            if (arr[mid] > x) {
               high = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else if (arr[mid] == x) {
                return mid;
            }
            
        }
        return start;
    }

    public static void main(String[] args) {
        int target;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target");

        target = sc.nextInt();
        int[] arr = { 1, 3, 5, 6 };

        int result = findInsertPos(arr, target);
        System.out.println("Result = " + result);
    }
}
