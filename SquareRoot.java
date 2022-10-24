import java.util.*;
import java.io.*;

public class SquareRoot {
    public static int findPower(int num, int pow) {
        int res = 1;
        while (pow > 0) {
            res = res * num;
            pow--;
        }
        return res;
    }

    public static int nthRoot(int root, int num) {
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = i + 1;
        }
        int start = 0, high = num - 1;
        while (start <= high) {
            int mid = (start + high) / 2;
            if (findPower(nums[mid], root) > num) {
                high = mid - 1;
            } else if (findPower(nums[mid], root) < num) {
                start = mid + 1;
            } else {
                return nums[mid];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Root");
        int root = sc.nextInt();
        System.out.println("Entyert Number");
        int number = sc.nextInt();
        int result = nthRoot(root, number);
        System.out.println(result);
    }
}
