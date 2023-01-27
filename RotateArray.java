import java.util.*;

public class RotateArray {
    public static void rotateMyArray(int[] arr, int l, int r){
        // reversing array
        // System.out.println(arr[l]);
        while(l < r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++; r--;
        }
        
        System.out.println("===Rotate===");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();
        k = k%n;
        k = k*-1; // converting k as anti-clock

        if(k<0){
            k = n+k;
        }

        // System.out.println(k);
        // rotateMyArray(arr,0, n-k-1);
        int l = 0; int r = n-k-1;
        while(l < r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++; r--;
        }
        
        // rotateMyArray(arr,n-k, n-1);

        l = n-k;
        r = n-1;
        while(l < r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++; r--;
        }

// rotate complete aray here


        System.out.println("===Result 2===");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
}
