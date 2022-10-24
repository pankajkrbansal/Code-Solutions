import java.util.*;

public class SubArraySum {
    // 1800. Maximum Ascending Subarray Sum
    public static void main(String[] args) {
        int[] arr = { 10, 9, 12, 5, 6, 7 };
        int sum = arr[0], tempAns = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                tempAns += arr[i];
            }else{
                tempAns = arr[i];
            }
            sum = Math.max(sum, tempAns);
        }

        System.out.println("Sum = " + sum);
    }
}
