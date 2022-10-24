import java.util.*;

class BinarySearch {
    public static int binary(int[] arr, int x, int low, int high) {
        // int high = arr.length-1, low = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return arr[mid];
            } else if (arr[mid] > x) {
                // binary(arr, x, low, mid - 1);
                high = mid - 1;
            } else if (arr[mid] < x) {
                // binary(arr, x, mid + 1, high);
                low = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int low = 0, high;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        System.out.println("Enter num");
        int x = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        int result = binary(arr, x,low, arr.length-1);
        System.out.println("Result = " + result);
    }
}