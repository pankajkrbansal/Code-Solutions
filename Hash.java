import java.util.HashMap;

//1748 sum of unique elemest 
public class Hash {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = { 1, 2, 3, 2 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            System.out.println("Get for " + arr[i] + " " + map.get(arr[i]));
        }

        for (int i = 0; i < arr.length; i++) {
            // if (map.get(arr[i]) == 1) {
            //     sum += arr[i];
            //     System.out.println("S + = " + sum);
            // } 

            System.out.println("For "+arr[i]+" count = "+map.get(arr[i]));
        }

        System.out.println("Sum = " + sum);
    }
}
