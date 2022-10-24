class FirstLast {
    public static int findFirstPosition(int[] arr, int x) {
        int start = 0, high = arr.length - 1, ans = 0;
        while (start <= high) {
            int mid = start + (high - start) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] <= x) {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int findLastPosition(int[] arr, int x) {
        int start = 0, high = arr.length - 1, ans = 0;
        while (start <= high) {
            int mid = start + (high - start) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 7, 8, 8, 9 };
        int x = 7;
        int first = findFirstPosition(arr, x);
        int second = findLastPosition(arr, x);
        System.out.println("First = " + first);
        System.out.println("Second = " + second);

    }
}